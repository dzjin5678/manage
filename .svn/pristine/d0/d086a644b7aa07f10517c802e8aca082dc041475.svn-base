package com.jiangjin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.jiangjin.model.CarWeigh;
import com.jiangjin.model.CarWeighQuery;

public interface CarWeighDao {
    
	int insert(CarWeigh carWeigh);
	
	List<CarWeigh> selectByExample(CarWeighQuery carWeighQuery);

	int updateCarWeigh(CarWeigh carRelease);
	
	int deletCarWeigh(Integer id);
	
	int countAll();

	CarWeigh findCarWeighById(CarWeigh carWeigh);

	
	@Insert("insert into cargo_car(car_release_id,car_weigh_id) "
			+ "values(#{releaseId},#{id})")
	void saveCargoCar(@Param("releaseId")Integer releaseId, @Param("id")Integer id);
	
	
}