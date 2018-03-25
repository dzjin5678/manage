package com.ange.controller.system;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ange.model.SysPage;
import com.ange.model.User;
import com.ange.service.system.LoginService;
import com.ange.service.system.SystemService;
import com.ange.tool.MD5;
import com.ange.tool.Result;

/**
 * 登录相关接口
 * 
 * @author ange
 * 
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private SystemService systemService;

	/**
	 * 用户在pc端登录 <br>
	 * 接口:login/webLogin
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param username
	 *            账号
	 * @param password
	 *            密码
	 * @return Result对象 token存入cookie中
	 * @throws IOException
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response, String username, String password)
			throws IOException {
		request.getSession().setAttribute("page", 1);
		request.getSession().setAttribute("strip", 10);
		if (username == null || username.equals("") || password == null || password.equals("")) {
			request.getSession().setAttribute("errorInfo", "用户名和密码不能为空");
			response.sendRedirect("../sys/login.jsp");
			return;
		}
		Result res = loginService.webLogin(username, password);
		if (res.isExpect()) {
			User user = (User) res.getMsg();
			if(!user.getState().equals("0")) {
				request.getSession().setAttribute("errorInfo", "账号被限制登录");
				response.sendRedirect("../sys/login.jsp");
				return;
			}
			request.getSession().setAttribute("user", user);
			List<SysPage> pageList = systemService.getRolePage(user.getRole());
			request.getSession().setAttribute("pageList", pageList);
			Map<String, Object> roleList = systemService.getRoleList(1, 10);
			request.getSession().setAttribute("getRoleList", roleList.get("list"));
			request.getSession().setAttribute("total", roleList.get("total"));
			request.getSession().setAttribute("page", 1);
			request.getSession().setAttribute("strip", 10);
			// return "sys/index.jsp";
			response.sendRedirect("../sys/index.jsp");
		} else {
			request.getSession().setAttribute("errorInfo", res.getMsg());
			// return "sys/login.jsp";
			response.sendRedirect("../sys/login.jsp");
		}
	}

	/**
	 * 获取用户列表
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return 用户列表
	 */
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request, HttpServletResponse response, Integer page, Integer strip) {
		request.getSession().setAttribute("errorInfo", "");
		Map<String, Object> userList = loginService.getUserList(page, strip);
		request.getSession().setAttribute("userList", userList.get("list"));
		request.getSession().setAttribute("total", userList.get("total"));
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		return "sys/userList.jsp";
	}

	/**
	 * 添加用户
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @param realName
	 *            真实姓名
	 * @param role
	 *            角色id
	 * @param department
	 *            部门
	 * @return
	 */
	@RequestMapping("/addUser")
	@ResponseBody
	public Result addUser(HttpServletRequest request, HttpServletResponse response, String userName, String password,
			String realName, Integer role, String department) {
		if (userName == null || userName.length() == 0 || password == null || password.length() == 0) {
			return new Result(false, "账号密码不能为空");
		}
		password = MD5.encodePA(password);
		Result res = loginService.addUser(userName, password, realName, role, department);
		return res;
	}
	/**
	 * 更新用户信息
	 * @param request request
	 * @param response response
	 * @param id 用户id
	 * @param userName 账号
	 * @param password 密码
	 * @param realName 真实姓名
	 * @param role 角色id
	 * @param department 部门
	 * @return
	 */
	@RequestMapping("/updateUser")
	@ResponseBody
	public Result updateUser(HttpServletRequest request, HttpServletResponse response, Integer id, String userName,
			String password, String realName, Integer role, String department,String state) {
		if (userName == null || userName.length() == 0 ) {
			return new Result(false, "账号不能为空");
		}
		Result res = loginService.updateUser(id,userName, password, realName, role, department,state);
		return res;
	}

	/**
	 * 获取添加用户页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getAddUserPage")
	public String getAddUserPage(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map = systemService.getRoleList(1, 100);
		request.getSession().setAttribute("allRoleList", map.get("list"));
		return "sys/addUser.jsp";
	}

	/**
	 * 获取更新用户信息页面
	 * 
	 * @param request
	 *            request
	 * @param response
	 * @param id
	 *            用户id
	 * @return
	 */
	@RequestMapping("/getUpdatePage")
	public String getUpdatePage(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Map<String, Object> map = loginService.getUserInfo(id);
		request.getSession().setAttribute("userInfo", map);
		Map<String, Object> allRoleList = systemService.getRoleList(1, 100);
		request.getSession().setAttribute("allRoleList", allRoleList.get("list"));
		return "sys/updateUser.jsp";
	}

	

}
