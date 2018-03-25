package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.StorageTankContract;

public interface StorageTankContractDao {
	
	@Select("select * from storageTankContract where id=#{id} order by id desc")
	public StorageTankContract getStorageTankContract(@Param("id") String id);
	
	@Select("select * from storageTankContract where storageTankNumber=#{storageTankNumber}")
	public List<StorageTankContract> queryStorageTankContract(@Param("storageTankNumber") String storageTankNumber);
	
	@Insert("insert into storageTankContract(storageTankNumber,client,contract,cargoName,P15,DCF) "
			+ "values(#{storageTankNumber},#{client},#{contract},#{cargoName},#{P15},#{DCF})")
	public int insertStorageTankContract(
			@Param("storageTankNumber")String storageTankNumber,
			@Param("client")String client,
			@Param("contract")String contract,
			@Param("cargoName")String cargoName,
			@Param("P15")String P15,
			@Param("DCF")String DCF);
	
	@Update("update storageTankContract set storageTankNumber=#{storageTankNumber},client=#{client},contract=#{contract},"
			+ "cargoName=#{cargoName},P15=#{P15},DCF=#{DCF} where id=#{id}")
	public int updateStorageTankContract(
			@Param("id")String id,
			@Param("storageTankNumber")String storageTankNumber,
			@Param("client")String client,
			@Param("contract")String contract,
			@Param("cargoName")String cargoName,
			@Param("P15")String P15,
			@Param("DCF")String DCF);
	
	@Delete("delete from storageTankContract where id=#{id}")
	public int deleteStorageTankContract(@Param("id")String id);
	
}
