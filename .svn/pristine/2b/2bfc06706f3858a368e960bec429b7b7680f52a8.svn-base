package com.liutianjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liutianjun.dao.ShipInformationDao;
import com.liutianjun.pojo.ShipInformation;
import com.liutianjun.pojo.ShipInformationQuery;
import com.liutianjun.pojo.ShipInformationQuery.Criteria;
import com.liutianjun.service.ShipInformationService;

@Service
public class ShipInformationServiceImpl implements ShipInformationService {

	@Autowired
	private ShipInformationDao shipInformationDao;
	/**
	 * 显示船舶信息列表
	 * @Title: getShipForecastList 
	 * @param page 
	 * @param rows
	 * @param
	 * @return
	 */
	@Override
	public List<ShipInformation> getShipInformationList(int page, int rows) {
		ShipInformationQuery example = new ShipInformationQuery();
		example.setPageNo(page);
		example.setPageSize(rows);
		List<ShipInformation> list = shipInformationDao.selectByExample(example);
		return list;
	}
	
	/**
	 * 显示外贸船舶信息列表
	 * <p>Title: getShipInformationByFTradeList</p>  
	 * <p>Description: </p>  
	 * @param page
	 * @param rows
	 * @param iFTrade
	 * @return
	 */
	@Override
	public List<ShipInformation> getShipInformationByFTradeList(int page, int rows) {
		ShipInformationQuery example = new ShipInformationQuery();
		Criteria criteria = example.createCriteria();
		criteria.andIFTradeEqualTo(1);
		example.setPageNo(page);
		example.setPageSize(rows);
		List<ShipInformation> list = shipInformationDao.selectByExample(example);
		return list;
	}

	/**
	 * 插入船舶信息
	 * @Title: insert 
	 * @param record
	 * @param 
	 * @return
	 */
	@Override
	public int insert(ShipInformation record) {
		int i = shipInformationDao.insert(record);
		return i;
	}

	/**
	 * 根据主键删除信息
	 * @Title: deleteByPrimaryKey 
	 * @param @param id
	 * @param @return 
	 * @return
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = shipInformationDao.deleteByPrimaryKey(id);
		return i;
	}

	/**
	 * 根据主键更新信息
	 * @Title: updateByPrimaryKeySelective 
	 * @param @param record
	 * @param @return 
	 * @return
	 */
	@Override
	public int updateByPrimaryKey(ShipInformation record) {
		int i = shipInformationDao.updateByPrimaryKey(record);
		return i;
	}

	/**
	 * 统计数量
	 * @Title: countAll 
	 * @param @return 
	 * @return
	 */
	@Override
	public int countAll() {
		ShipInformationQuery example = new ShipInformationQuery();
		int i = shipInformationDao.countByExample(example);
		return i;
	}

	/**
	 * 根据主键查询信息
	 * @Title: selectByPrimaryKey 
	 * @param id
	 * @param  
	 * @return ShipInformation
	 */
	@Override
	public ShipInformation selectByPrimaryKey(Integer id) {
		ShipInformation shipInfomation = shipInformationDao.selectByPrimaryKey(id);
		return shipInfomation;
	}

}
