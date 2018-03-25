package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.StorageTankTask;

public interface StorageTankTaskDao {
	
	@Insert("insert into storageTankTask(storageTankNumber,contract,task,notify,ladingBill,customPassFile,loadUnloadDatetime) "
			+ "values(#{storageTankNumber},#{contract},#{task},#{notify},#{ladingBill},#{customPassFile},#{loadUnloadDatetime})")
	public int insertStorageTankTaskDao(@Param("storageTankNumber")String storageTankNumber,
			@Param("contract")String contract,
			@Param("task")String task,
			@Param("notify")String notify,
			@Param("ladingBill")String ladingBill,
			@Param("customPassFile")String customPassFile,
			@Param("loadUnloadDatetime")String loadUnloadDatetime);
	
	@Select("select * from storageTankTask where id=#{id}")
	public StorageTankTask getStorageTankTask(@Param("id")String id);
	
	@Select("select * from storageTankTask where storageTankNumber=#{storageTankNumber} and contract=#{contract}")
	public List<StorageTankTask> queryStorageTankTask(@Param("storageTankNumber")String storageTankNumber , 
			@Param("contract")String contract);
	
	@Delete("delete from storageTankTask where id=#{id}")
	public int deleteStorageTankNumber(@Param("id")String id);
	
	@Update("update storageTankTask set task=#{task},notify=#{notify},ladingBill=#{ladingBill},customPassFile=#{customPassFile},"
			+ "loadUnloadDatetime=#{loadUnloadDatetime} where id=#{id}")
	public int updateStorageTankTaskDao(@Param("id")String id , 
			@Param("task")String task,
			@Param("notify")String notify,
			@Param("ladingBill")String ladingBill,
			@Param("customPassFile")String customPassFile,
			@Param("loadUnloadDatetime")String loadUnloadDatetime);
	
}
