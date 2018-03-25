package com.liutianjun.service;

import java.util.List;

import com.liutianjun.pojo.ShipForeignTradeBill;

public interface ShipForeignTradeBillService {

	//查询船舶外贸提单
	List<ShipForeignTradeBill> getShipForeignTradeBillList(int page, int rows, int shipInformationId);
	
	//查询符合条件的记录数量
	int countByshipInformationId(Integer shipInformationId);
	
	//插入记录
	int insert(ShipForeignTradeBill record);
	
	//通过主键删除记录
	int deleteByPrimaryKey(Integer id);
	
	//通过主键更新记录
	int updateByPrimaryKey(ShipForeignTradeBill record);
	
	//通过主键查询单条记录
	ShipForeignTradeBill selectByPrimaryKey(Integer id);
}
