package com.ange.service.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.UserDao;
import com.ange.model.User;
import com.ange.tool.MD5;
import com.ange.tool.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;

	

	/**
	 * 用户在pc端登录
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	public Result webLogin(String username, String password) {
		password=MD5.encodePA(password);
		User user=userDao.byPasswordGetUser(username,password);
		if(user==null||user.getId()<1) {
			return new Result(false,"账号或密码错误");
		}
		return new Result(true,user);
	}

	/**
	 * 获取用户列表
	 * @param page 页数
	 * @param strip 条数
	 * @return
	 */
	public Map<String,Object> getUserList(Integer page, Integer strip) {
		PageHelper.startPage(page, strip);
		List<Map<String,Object>> list = userDao.getUserList();
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}

	/**
	 * 添加用户
	 * @param userName 账号
	 * @param password 密码
	 * @param realName 真实姓名
	 * @param role 角色id
	 * @param department 部门
	 * @return
	 */
	public Result addUser(String userName, String password, String realName, Integer role, String department) {
		User user=userDao.byNameGetUser(userName,realName);
		if(user!=null) {
			return new Result(false,"账号或员工已经存在");
		}
		try {
			userDao.insertUser(userName,password,realName,role,department);
			return new Result(true);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"添加失败");
		}
	}

	/**
	 * 更新用户信息
	 * @param id 用户id
	 * @param userName 用户名
	 * @param password 密码
	 * @param realName 真实姓名
	 * @param role 角色id
	 * @param department 部门
	 * @return
	 */
	public Result updateUser(Integer id, String userName, String password, String realName, Integer role,
			String department,String state) {
		User user=userDao.byIdAndNameGetUser(userName,realName,id);
		if(user!=null) {
			return new Result(false,"账号或员工已经存在");
		}
		user=userDao.byIdGetUserInfo(id);
		if(password==null||password.length()==0) {
			password=user.getPassword();
		}else {
			password=MD5.encodePA(password);
		}
		try {
			userDao.updateUserInfo(id,userName,password,realName,role,department,state);
			return new Result(true);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"更新失败");
		}
	}
	
	/**
	 * 获取用户基础信息
	 * @param id 用户id
	 * @return 
	 */
	public Map<String, Object> getUserInfo(Integer id) {
		Map<String,Object> map = userDao.getUserInfo(id);
		return map;
	}

	
}
