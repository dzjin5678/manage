package com.jiangjin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiangjin.dao.CarReleaseDao;
import com.jiangjin.model.CarRelease;
import com.jiangjin.model.CarReleaseQuery;
import com.jiangjin.service.CarReleaseService;

@Service
public class CarReleaseServiceImpl implements CarReleaseService{

	@Autowired
	private CarReleaseDao carReleaseDao;

	@Override
	public int insert(CarRelease carRelease) {
		// TODO Auto-generated method stub
		
		return carReleaseDao.insert(carRelease);
	}

	@Override
	public List<CarRelease> selectByExample(int page, int rows) {
		// TODO Auto-generated method stub
		CarReleaseQuery carReleaseQuery=new CarReleaseQuery();
		carReleaseQuery.setPageNo(page);
		carReleaseQuery.setPageSize(rows);
		return carReleaseDao.selectByExample(carReleaseQuery);
	}

	@Override
	public int updateCarRelease(CarRelease carRelease) {
		// TODO Auto-generated method stub
		return carReleaseDao.updateCarRelease(carRelease);
	}

	@Override
	public int deletCarRelease(Integer id) {
		// TODO Auto-generated method stub
		return carReleaseDao.deletCarRelease(id);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return carReleaseDao.countAll();
	}

	@Override
	public CarRelease findCarReleaseById(CarRelease carRelease) {
		// TODO Auto-generated method stub
		return carReleaseDao.findCarReleaseById(carRelease);
	}
	
	
	
}
