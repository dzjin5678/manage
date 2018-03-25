package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.Cargonamecode;

public interface CargonamecodeDao {
	
	@Insert("insert into cargonameCode(cargoNameCode,cargoName,cargoTypeBelonged)"
			+ " values(#{cargoNameCode},#{cargoName},#{cargoTypeBelonged})")
	public int insertCargonamecode(@Param("cargoNameCode")String cargoNameCode,
			@Param("cargoName")String cargoName,
			@Param("cargoTypeBelonged")String cargoTypeBelonged);
	
	
	@Update("update cargonameCode set cargoNameCode=#{cargoNameCode},cargoName=#{cargoName},"
			+ "cargoTypeBelonged=#{cargoTypeBelonged} where id=#{id}")
	public int updateCargonamecode(
			@Param("id")String id,
			@Param("cargoNameCode")String cargoNameCode,
			@Param("cargoName")String cargoName,
			@Param("cargoTypeBelonged")String cargoTypeBelonged);
	
	@Select("select * from Cargonamecode order by id desc")
	public List<Cargonamecode> queryCargoNameCode();
	
	@Select("select * from cargonameCode where id=#{id}")
	public Cargonamecode getCargonNameCode(@Param("id")String id);
	
	@Delete("delete from cargoNameCode where id =#{id}")
	public int deleteCargoNameCode(@Param("id")String id);

}