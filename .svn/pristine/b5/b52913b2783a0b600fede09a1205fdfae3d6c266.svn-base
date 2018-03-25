package com.liutianjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liutianjun.dao.ShipForecastDao;
import com.liutianjun.pojo.ShipForecast;
import com.liutianjun.pojo.ShipForecastQuery;
import com.liutianjun.service.ShipForecastService;

@Service
public class ShipForecastServiceImpl implements ShipForecastService {
	
	@Autowired
	private ShipForecastDao shipForecastDao;

	/**
	 * 查询船舶预报列表
	 * <p>Title: getShipForecastList</p>  
	 * <p>Description: </p>  
	 * @param page
	 * @param rows
	 * @return
	 */
	@Override
	public List<ShipForecast> getShipForecastList(int page,int rows) {
		ShipForecastQuery example = new ShipForecastQuery();
		example.setPageNo(page);
		example.setPageSize(rows);
		List<ShipForecast> list = shipForecastDao.selectByExample(example);
		return list;
	}

	/**
	 * 插入船舶预报
	 * <p>Title: insert</p>  
	 * <p>Description: </p>  
	 * @param record
	 * @return
	 */
	@Override
	public int insert(ShipForecast record) {
		int i = shipForecastDao.insert(record);
		return i;
	}

	/**
	 * 修改船舶预报
	 * <p>Title: updateByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param record
	 * @return
	 */
	@Override
	public int updateByPrimaryKey(ShipForecast record) {
		int i = shipForecastDao.updateByPrimaryKey(record);
		return i;
	}


	/**
	 * 删除船舶预报
	 * <p>Title: deleteByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param id
	 * @return
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = shipForecastDao.deleteByPrimaryKey(id);
		return i;
	}

	/**
	 * 统计船舶预报总记录数
	 * <p>Title: countAll</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	@Override
	public int countAll() {
		ShipForecastQuery example = new ShipForecastQuery();
		int i = shipForecastDao.countByExample(example);
		return i;
	}

	/**
	 * 查询单条船舶预报记录
	 * <p>Title: selectByPrimaryKey</p>  
	 * <p>Description: </p>  
	 * @param id
	 * @return
	 */
	@Override
	public ShipForecast selectByPrimaryKey(Integer id) {
		ShipForecast shipForecast = shipForecastDao.selectByPrimaryKey(id);
		return shipForecast;
	}


}
