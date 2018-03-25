package com.ange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.User;

public interface UserDao {

	/**
	 * 根据用户名和密码获取用户信息
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	@Select("select * from user where userName=#{userName} and password=#{password} ")
	public User loginGetUser(@Param("userName") String userName, @Param("password") String password);

	/**
	 * 根据用户名和密码获取User信息
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 */
	@Select("select * from user where username=#{username} and password=#{password}")
	public User byPasswordGetUser(@Param("username") String username, @Param("password") String password);

	@Insert("insert into testuser (username,password) values(#{username},#{password})")
	public void createUser(@Param("username") String username, @Param("password") String password);

	@Select("select * from user where id=#{id}")
	public User byIdGetUserInfo(@Param("id") int id);

	@Select("select u.id,u.userName,u.realName,u.department,u.state,u.role,r.explains from `user` u left join sysrole r on r.id=u.role where u.role!='0' order by u.id desc")
	public List<Map<String, Object>> getUserList();

	@Insert("insert into user (userName,password,realName,role,department) values (#{userName},#{password},#{realName},#{role},#{department})")
	public void insertUser(@Param("userName") String userName, @Param("password") String password,
			@Param("realName") String realName, @Param("role") Integer role, @Param("department") String department);

	@Select("select * from user where userName=#{userName} or realName=#{realName} limit 0,1")
	public User byNameGetUser(@Param("userName") String userName, @Param("realName") String realName);

	@Select("select u.id,u.userName,u.realName,u.department,u.state,u.role,r.explains from `user` u left join sysrole r on r.id=u.role where u.role!='0' and u.id=#{id} order by u.id desc")
	public Map<String, Object> getUserInfo(Integer id);

	@Select("select * from user where (userName=#{userName} or realName=#{realName}) and id!=${id} limit 0,1")
	public User byIdAndNameGetUser(@Param("userName") String userName, @Param("realName") String realName,
			@Param("id") Integer id);

	@Update("update user set userName=#{userName},password=#{password},realName=#{realName},role=#{role},department=#{department},state=#{state} where id=#{id}")
	public void updateUserInfo(@Param("id") Integer id, @Param("userName") String userName,
			@Param("password") String password, @Param("realName") String realName, @Param("role") Integer role,
			@Param("department") String department,@Param("state") String state);

}
