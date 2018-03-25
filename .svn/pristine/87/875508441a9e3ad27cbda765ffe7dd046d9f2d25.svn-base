package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.ange.model.Shipoperation;

public interface ShipoperationDao {


	
	
	@Insert("insert into shipoperation (dynamicId, number, operation, connectionTime, startPump, stopTime,disconnectTime, "
			+ "unberthingTime, operationTime, weight, volume, speed, inBerthTime, remarks,realName, userid, time) values "
			+ "(#{dynamicId},#{number},#{operation},#{connectionTime},#{startPump},#{stopTime},#{disconnectTime},#{unberthingTime},"
			+ "#{operationTime},#{weight},#{volume},#{speed},#{inBerthTime},#{remarks},#{realName},#{userid},#{time})")
	public void addShipOperation(@Param("dynamicId") Integer dynamicId, @Param("number") String number,
			@Param("operation") String operation, @Param("connectionTime") String connectionTime,
			@Param("startPump") String startPump, @Param("stopTime") String stopTime,
			@Param("disconnectTime") String disconnectTime, @Param("unberthingTime") String unberthingTime,
			@Param("operationTime") String operationTime, @Param("weight") String weight,
			@Param("volume") String volume, @Param("speed") String speed, @Param("inBerthTime") String inBerthTime,
			@Param("remarks") String remarks, @Param("realName") String realName, @Param("userid") Integer userid,
			@Param("time") String time);

	@Select("select * from shipoperation WHERE dynamicId=#{dynamicId} order by id desc")
	public List<Shipoperation> getShipOperationList(Integer dynamicId);
	

	@Select("select * from shipoperation where id=#{id}")
	public Shipoperation getShipOperationInfo(Integer id);
	
	@Update("update shipoperation set number=#{number}, operation=#{operation}, connectionTime=#{connectionTime}, startPump=#{startPump}, "
			+ "stopTime=#{stopTime},disconnectTime=#{disconnectTime}, unberthingTime=#{unberthingTime}, operationTime=#{operationTime}, "
			+ "weight=#{weight}, volume=#{volume},speed=#{number}, inBerthTime=#{number}, remarks=#{number},realName=#{realName}, userid=#{userid} where id=#{id}")
	public void updateShipOperation(@Param("id") Integer id, @Param("number") String number,
			@Param("operation") String operation, @Param("connectionTime") String connectionTime,
			@Param("startPump") String startPump, @Param("stopTime") String stopTime,
			@Param("disconnectTime") String disconnectTime, @Param("unberthingTime") String unberthingTime,
			@Param("operationTime") String operationTime, @Param("weight") String weight,
			@Param("volume") String volume, @Param("speed") String speed, @Param("inBerthTime") String inBerthTime,
			@Param("remarks") String remarks, @Param("realName") String realName, @Param("userid") Integer userid);
	

	@Select("select * from shipoperation where id=#{id}")
	public Shipoperation getShipOperationInfoTest(Integer id);

	@Delete("delete from shipoperation where id=#{id}")
	public void deleteShipOperation(Integer id);

}
