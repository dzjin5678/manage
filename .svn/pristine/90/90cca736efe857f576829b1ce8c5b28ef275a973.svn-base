package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.StorageTank;

public interface StorageTankCodeDao {
	
	@Select("select * from storageTank where tankColumn=#{tankColumn} order by id asc")
	public List<StorageTank> queryStorageTankList(@Param("tankColumn")String tankColumn);
	
	@Select("select * from storageTank where storageTankNumber=#{storageTankNumber}")
	public StorageTank getStorageTank(@Param("storageTankNumber")String storageTankNumber);
	
	@Insert("insert into storageTank(tankColumn,storageTankNumber,storageTankPosition,storageTankCapacity) "
			+ "values(#{tankColumn},#{storageTankNumber},#{storageTankPosition},#{storageTankCapacity})")
	public int insertStorageTank(@Param("tankColumn")String tankColumn , 
			@Param("storageTankNumber")String storageTankNumber , 
			@Param("storageTankPosition")String storageTankPosition , 
			@Param("storageTankCapacity")String storageTankCapacity );
	
	@Select("select max(tankColumn) from storageTank")
	public int getMaxColumn();
	
	@Select("select count(*) from storageTank where tankColumn=#{tankColumn}")
	public int getCountByTaskColumn(@Param("tankColumn")String tankColumn);
	
	@Select("select distinct tankColumn from storagetank order by tankColumn asc")
	public List<String> getCloumn();
	
	@Delete("delete from storageTank where storageTankNumber=#{storageTankNumber}")
	public int deleteStorageCode(@Param("storageTankNumber")String storageTankNumber);
	
	
	@Update("update storageTank set tankColumn=#{tankColumn},storageTankNumber=#{storageTankNumber}"
			+ ",storageTankPosition=#{storageTankPosition},storageTankCapacity=#{storageTankCapacity}"
			+ " where storageTankNumber=#{id}")
	public int updateStorageTank(
			@Param("id")String id , 
			@Param("tankColumn")String tankColumn , 
			@Param("storageTankNumber")String storageTankNumber , 
			@Param("storageTankPosition")String storageTankPosition , 
			@Param("storageTankCapacity")String storageTankCapacity );

	
}
