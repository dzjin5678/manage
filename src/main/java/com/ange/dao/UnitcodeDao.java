package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.Unitcode;

/**
 * 单位相关操作控制器
 * @author dzjin
 *
 */
public interface UnitcodeDao {
	
	@Insert("insert into unitCode(unitCode,unitName,unitType,unitEname,address,phone) "
			+ "values(#{unitCode},#{unitName},#{unitType},#{unitEname},#{address},#{phone})")
	public int insertUnitCode(@Param("unitCode")String unitCode,
			@Param("unitName")String unitName,
			@Param("unitType")String unitType,
			@Param("unitEname")String unitEname,
			@Param("address")String address,
			@Param("phone")String phone);
	
	@Update("update unitCode set unitCode=#{unitCode},unitName=#{unitName},unitType=#{unitType},"
			+ "unitEname=#{unitEname},address=#{address},phone=#{phone} where id=#{id} ")
	public int updateUnitCode(
			@Param("id")String id,
			@Param("unitCode")String unitCode,
			@Param("unitName")String unitName,
			@Param("unitType")String unitType,
			@Param("unitEname")String unitEname,
			@Param("address")String address,
			@Param("phone")String phone);
	
	@Select("select * from UnitCode  order by id desc")
	public List<Unitcode> queryUnitCode();
	
	@Select("select * from UnitCode where id=#{id}")
	public Unitcode getUnitCode(@Param("id")String id);
	
	@Delete("delete from unitCode where id =#{id}")
	public int deleteUnitCode(@Param("id")String id);
	
	
	
	

}
