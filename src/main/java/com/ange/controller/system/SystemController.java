package com.ange.controller.system;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ange.service.system.SystemService;
import com.ange.tool.Result;

/**
 * 其他系统需要用到的接口
 * 
 * @author ange
 *
 */
@RestController
@RequestMapping("/system")
public class SystemController {
	@Autowired
	private SystemService systemService;

	/**
	 * 用户登录信息错误
	 * 
	 * @return Result对象(false,"登录凭证失效")
	 */
	@RequestMapping("/User_error")
	@ResponseBody
	public Result error(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("user", null);
		return new Result(false, "登录凭证失效");
	}

	/**
	 * 添加角色<br>
	 * 接口:system/addRole
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param roleName
	 *            角色名
	 * @return Result对象
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/addRole")
	public String addRole(HttpServletRequest request, HttpServletResponse response, String roleName) throws UnsupportedEncodingException {
		Result res = systemService.addRole(roleName);
		if (res.isExpect()) {
			return "system/getRoleList?page=1&strip=10";
		} else {
			request.getSession().setAttribute("addRoleerrorInfo", res.getMsg());
			return "sys/addRole.jsp";
		}
	}

	/**
	 * 删除角色<br>
	 * 接口:system/deleteRole
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param roleName
	 *            角色名
	 * @return Result对象
	 */
	@RequestMapping("/deleteRole")
	@ResponseBody
	public Result deleteRole(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Result res = systemService.deleteRole(id);
		return res;
	}

	/**
	 * 获取权限列表<br>
	 * 接口:system/getRoleList
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return
	 */
	@RequestMapping("/getRoleList")
	public String getRoleList(HttpServletRequest request, HttpServletResponse response, Integer page, Integer strip) {
		request.getSession().setAttribute("addRoleerrorInfo", "");
		Map<String, Object> map = systemService.getRoleList(page, strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("getRoleList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "sys/roleList.jsp";
	}

	/**
	 * 维护角色权限<br>
	 * 接口:system/updatePower
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param roleId
	 *            角色id
	 * @param id
	 *            权限id
	 * @return
	 */
	@RequestMapping("/updatePower")
	@ResponseBody
	public Result updatePower(HttpServletRequest request, HttpServletResponse response, Integer roleId, Integer id) {
		Result res = systemService.updatePower(roleId,id);
		return res;
	}

//	/**
//	 * 删除角色权限<br>
//	 * 接口:system/deletePower
//	 * 
//	 * @param request
//	 *            request
//	 * @param response
//	 *            response
//	 * @param id
//	 *            记录id
//	 * @return Result对象
//	 */
//	@RequestMapping("/deletePower")
//	@ResponseBody
//	public Result deletePower(HttpServletRequest request, HttpServletResponse response, Integer id) {
//		if (id == null) {
//			return new Result(false, "id必填");
//		}
//		Result res = systemService.deletePower(id);
//		return res;
//	}

	/**
	 * 获取指定角色权限<br>
	 * 接口:system/getPowerList
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param roleId
	 *            角色id
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return
	 */
	@RequestMapping("/getPowerList")
	public String getPowerList(HttpServletRequest request, HttpServletResponse response, Integer roleId, Integer page,
			Integer strip,String roleName) {
		Map<String, Object> map = systemService.getPowerList(roleId, page, strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("getPowerList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		request.getSession().setAttribute("roleName",roleName);
		request.getSession().setAttribute("roleId",roleId);
		return "sys/powerList.jsp";
	}
}
