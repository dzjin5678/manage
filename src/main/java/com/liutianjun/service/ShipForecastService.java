package com.liutianjun.service;

import java.util.List;

import com.liutianjun.pojo.ShipForecast;

public interface ShipForecastService {

	//查询船舶预报列表
	List<ShipForecast> getShipForecastList(int page, int rows);
	//插入船舶预报
	int insert(ShipForecast record);
	//通过主键删除
	int deleteByPrimaryKey(Integer id);
	//通过主键更新
	int updateByPrimaryKey(ShipForecast record);
	//查询总数
	int countAll();
	//通过主键查询单条记录
	ShipForecast selectByPrimaryKey(Integer id);
}
