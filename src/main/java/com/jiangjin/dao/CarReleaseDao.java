package com.jiangjin.dao;

import java.util.List;

import com.jiangjin.model.CarRelease;
import com.jiangjin.model.CarReleaseQuery;

public interface CarReleaseDao {
    
	int insert(CarRelease carRelease);
	
	List<CarRelease> selectByExample(CarReleaseQuery carReleaseQuery);

	int updateCarRelease(CarRelease carRelease);
	
	int deletCarRelease(Integer id);
	
	int countAll();

	CarRelease findCarReleaseById(CarRelease carRelease);
	
	
}