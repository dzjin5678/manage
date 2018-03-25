package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.GoodsTask;

public interface GoodsTaskDao {

	@Select("select * from goodsTask where goodsId=#{goodsId} order by stream desc")
	public List<GoodsTask> getGoodsTaskList(Integer goodsId);

	@Select("select IFNULL(max(stream),0)+1 from goodstask where goodsId=#{goodsId}")
	public Integer getGoodsTaskStream(Integer goodsId);

	@Insert("insert into goodsTask (shift,amount,startTime,stopTime,goodsId,userid,realName,stream,time,operation,reservoirArea) values "
			+ "(#{shift},#{amount},#{startTime},#{stopTime},#{goodsId},#{userid},#{realName},#{stream},#{time},#{operation},#{reservoirArea})")
	public void addGoodsTask(@Param("shift") String shift, @Param("amount") Double amount,
			@Param("startTime") String startTime, @Param("stopTime") String stopTime, @Param("goodsId") Integer goodsId,
			@Param("userid") Integer userid, @Param("realName") String realName, @Param("stream") Integer stream,
			@Param("time") String time, @Param("operation")String operation,@Param("reservoirArea")String reservoirArea);

	@Delete("delete from goodsTask where id=#{id}")
	public void deleteGoodsTask(Integer id);

	@Select("select * from goodsTask where id=#{goodsTaskId}")
	public GoodsTask getGoodsTaskInfo(Integer goodsTaskId);

	@Update("update goodsTask set shift=#{shift},amount=#{amount},startTime=#{startTime},stopTime=#{stopTime},"
			+ "userid=#{userid},realName=#{realName},time=#{time},operation=#{operation},reservoirArea=#{reservoirArea} where id=#{id}")
	public void updateGoodsTask(@Param("shift") String shift, @Param("amount") Double amount,
			@Param("startTime") String startTime, @Param("stopTime") String stopTime, @Param("id") Integer id,
			@Param("userid") Integer userid, @Param("realName") String realName, 
			@Param("time") String time, @Param("operation")String operation,@Param("reservoirArea")String reservoirArea);

}
