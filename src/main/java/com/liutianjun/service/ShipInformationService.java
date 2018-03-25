package com.liutianjun.service;

import java.util.List;

import com.liutianjun.pojo.ShipInformation;

public interface ShipInformationService {

	//查询船舶信息列表
	List<ShipInformation> getShipInformationList(int page, int rows);
	//查询外贸船舶信息列表
	List<ShipInformation> getShipInformationByFTradeList(int page, int rows);
	//插入船舶信息
	int insert(ShipInformation record);
	//删除船舶信息
	int deleteByPrimaryKey(Integer id);
	//更新传播信息
	int updateByPrimaryKey(ShipInformation record);
	//查询总数
	int countAll();
	//通过主键查询单条记录
	ShipInformation selectByPrimaryKey(Integer id);
}
