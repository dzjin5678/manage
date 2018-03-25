package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.Costcode;

public interface CostcodeDao {
	
	@Insert("insert into Costcode(costCode,costName,costUnit,costRate,costType) "
			+ "values(#{costCode},#{costName},#{costUnit},#{costRate},#{costType})")
	public int insertCostCode(
			@Param("costCode")String costCode ,
			@Param("costName")String costName ,
			@Param("costUnit")String costUnit ,
			@Param("costRate")String costRate ,
			@Param("costType")String costType);
	
	@Update("update Costcode set costCode=#{costCode},costName=#{costName},costUnit=#{costUnit},"
			+ "costRate=#{costRate},costType=#{costType} where id=#{id}")
	public int updateCostCode(
			@Param("id")String id ,
			@Param("costCode")String costCode ,
			@Param("costName")String costName ,
			@Param("costUnit")String costUnit ,
			@Param("costRate")String costRate ,
			@Param("costType")String costType);
	
	@Select("select * from Costcode  order by id desc")
	public List<Costcode> queryCostCode();
	
	@Select("select * from Costcode where id=#{id}")
	public Costcode getCostcode(@Param("id")String id);

	@Delete("delete from CostCode where id =#{id}")
	public int deleteCostCode(@Param("id")String id);
}
