package com.jiangjin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiangjin.dao.CarWeighDao;
import com.jiangjin.model.CarWeigh;
import com.jiangjin.model.CarWeighQuery;
import com.jiangjin.service.CarWeighService;

@Service
public class CarWeighServiceImpl implements CarWeighService{

	@Autowired
	private CarWeighDao carWeighDao;
	@Override
	public int insert(CarWeigh carWeigh) {
		// TODO Auto-generated method stub
		return carWeighDao.insert(carWeigh);
	}

	@Override
	public List<CarWeigh> selectByExample(int page, int rows,CarWeigh carWeigh) {
		// TODO Auto-generated method stub
		CarWeighQuery carWeighQuery=new CarWeighQuery();
		carWeighQuery.setPageNo(page);
		carWeighQuery.setPageSize(rows);
		carWeighQuery.createCriteria().addCriterion("cw.release_id=", carWeigh.getReleaseId(), "releaseId");
		carWeighQuery.createCriteria().addCriterion("cw.creator=", carWeigh.getCreator(), "creator");
		return carWeighDao.selectByExample(carWeighQuery);
	}

	@Override
	public int updateCarWeigh(CarWeigh carRelease) {
		// TODO Auto-generated method stub
		return carWeighDao.updateCarWeigh(carRelease);
	}

	@Override
	public int deletCarWeigh(Integer id) {
		// TODO Auto-generated method stub
		return carWeighDao.deletCarWeigh(id);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return carWeighDao.countAll();
	}

	@Override
	public CarWeigh findCarWeighById(CarWeigh carWeigh) {
		// TODO Auto-generated method stub
		return carWeighDao.findCarWeighById(carWeigh);
	}

	@Override
	public void saveCargoCar(Integer releaseId, Integer id) {
		// TODO Auto-generated method stub
		this.carWeighDao.saveCargoCar(releaseId,id);
	}

	

	
	
	
}
