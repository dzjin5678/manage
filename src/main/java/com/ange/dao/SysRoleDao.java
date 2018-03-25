package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.ange.model.SysRole;

public interface SysRoleDao {


	@Insert("insert into sysRole (role,explains,createtime) values (#{role},#{explains},#{createtime})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public void addRole(SysRole sysRole);
	
	@Select("select * from sysRole where explains=#{explains}")
	public SysRole byRoleNameGetSingle(String explains);

	@Delete("delete from sysRole where id=#{id}")
	public void deleteRole(Integer id);

	@Select("select * from sysRole order by id desc")
	public List<SysRole> getRoleList();

}
