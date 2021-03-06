package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.StorageTankCargo;
import com.jiangjin.model.CarWeigh;

public interface StorageTankCargoDao {
	
	@Insert("insert into storageTankCargo(storageTankTaskId,task,cargoType,transportType,planNum,actualNum) "
			+ "values(#{storageTankTaskId},#{task},#{cargoType},#{transportType},#{planNum},#{actualNum})")
	public int insertStorageTankCargo(
			@Param("storageTankTaskId")String storageTankTaskId,
			@Param("task")String task,
			@Param("cargoType")String cargoType,
			@Param("transportType")String transportType,
			@Param("planNum")String planNum,
			@Param("actualNum")String actualNum);
	
	@Select("select * from storageTankCargo where id=#{id}")
	public StorageTankCargo getstorageTankCargo(
			@Param("id")String id);
	
	@Select("select * from storageTankCargo where storageTankTaskId=#{storageTankTaskId}")
	public List<StorageTankCargo> querystorageTankCargo(
			@Param("storageTankTaskId")String storageTankTaskId);
	
	@Delete("delete from storageTankCargo where id=#{id}")
	public int deleteStorageTankCargo(@Param("id")String id);
	
	/**
	 * 更新储罐详单货物记录，不可更新与这条货物记录绑定的作业，如果想要转移货物，只能是删除重新添加
	 * @param id
	 * @param cargoType
	 * @param transportType
	 * @param notify
	 * @param planNum
	 * @param actualNum
	 * @return
	 */
	@Update("update storageTankCargo set cargoType=#{cargoType},transportType=#{transportType},planNum=#{planNum},actualNum=#{actualNum} "
			+ "where id=#{id}")
	public int updatestorageTankCargoDao(
			@Param("id")String id,
			@Param("cargoType")String cargoType , 
			@Param("transportType")String transportType,
			@Param("notify")String notify,
			@Param("planNum")String planNum,
			@Param("actualNum")String actualNum);
	
	@Select("select * from car_release,car_weigh where car_release.id=car_weigh.release_id and car_weigh.")
	public List<CarWeigh> queryCarWeighByType(@Param("handling_type")String handing_type);
}
