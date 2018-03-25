package com.liutianjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liutianjun.dao.ShipForeignTradeBillDao;
import com.liutianjun.pojo.ShipForeignTradeBill;
import com.liutianjun.pojo.ShipForeignTradeBillQuery;
import com.liutianjun.pojo.ShipForeignTradeBillQuery.Criteria;
import com.liutianjun.service.ShipForeignTradeBillService;

/**
 * 船舶外贸提单表Service
 *
 * @author Administrator
 *
 */
@Service
public class ShipForeignTradeBillServiceImpl implements ShipForeignTradeBillService {

	@Autowired
	private ShipForeignTradeBillDao shipForeignTradeBillDao;
	
	/**
	 * 根据船舶信息ID查询船舶外贸提单表
	 * <p>Title: getShipForeignTradeBillList</p>  
	 * <p>Description: </p>  
	 * @param page
	 * @param rows 
	 * @param id 根据船舶信息ID
	 * @return
	 */
	@Override
	public List<ShipForeignTradeBill> getShipForeignTradeBillList(int page, int rows, int shipInformationId) {
		ShipForeignTradeBillQuery example = new ShipForeignTradeBillQuery();
		Criteria criteria = example.createCriteria();
		criteria.andShipInformationIdEqualTo(shipInformationId);
		example.setPageNo(page);
		example.setPageSize(rows);
		List<ShipForeignTradeBill> list = shipForeignTradeBillDao.selectByExample(example);
		return list;
	}

	/**
	 * 根据船舶信息ID查询船舶外贸提单数量
	 * <p>Title: countByshipInformationId</p>  
	 * <p>Description: </p>  
	 * @param shipInformationId
	 * @return
	 */
	@Override
	public int countByshipInformationId(Integer shipInformationId) {
		ShipForeignTradeBillQuery example = new ShipForeignTradeBillQuery();
		Criteria criteria = example.createCriteria();
		criteria.andShipInformationIdEqualTo(shipInformationId);
		int i = shipForeignTradeBillDao.countByExample(example);
		return i;
	}

	/**
	 * 插入外贸提单记录
	 * <p>Title: insert</p>  
	 * <p>Description: </p>  
	 * @param record
	 * @return
	 */
	@Override
	public int insert(ShipForeignTradeBill record) {
		int i = shipForeignTradeBillDao.insert(record);
		return i;
	}

	/**
	 * 根据主键删除记录
	 * <p>Title: deleteByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param id
	 * @return
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = shipForeignTradeBillDao.deleteByPrimaryKey(id);
		return i;
	}

	/**
	 * 根据主键更新数据
	 * <p>Title: updateByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param record
	 * @return
	 */
	@Override
	public int updateByPrimaryKey(ShipForeignTradeBill record) {
		int i = shipForeignTradeBillDao.updateByPrimaryKey(record);
		return i;
	}

	/**
	 * 通过主键查询单条记录
	 * <p>Title: selectByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param id
	 * @return
	 */
	@Override
	public ShipForeignTradeBill selectByPrimaryKey(Integer id) {
		ShipForeignTradeBill shipForeignTradeBill = shipForeignTradeBillDao.selectByPrimaryKey(id);
		return shipForeignTradeBill;
	}

}
