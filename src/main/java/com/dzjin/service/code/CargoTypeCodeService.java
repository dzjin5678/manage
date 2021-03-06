package com.dzjin.service.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.CargotypecodeDao;
import com.ange.model.Cargotypecode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CargoTypeCodeService {
	@Autowired
	CargotypecodeDao cargotypecodeDao;
	
	public int insertCargoTypeCode(String cargoTypeCode ,String cargoTypeName){
		return cargotypecodeDao.insertCargoTypeCode(cargoTypeCode, cargoTypeName);
	}
	
	public int updateCargoTypeCode(String id , String cargoTypeCode ,String cargoTypeName){
		return cargotypecodeDao.updateCargoTypeCode(id,cargoTypeCode, cargoTypeName);
	}
	
	public Map<String, Object> queryCargoTypeCode(Integer page, Integer strip){

		PageHelper.startPage(page, strip);
		List<Cargotypecode> list = cargotypecodeDao.queryCargoTypeCode();
		PageInfo<Cargotypecode> pageInfo = new PageInfo<Cargotypecode>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteCargoTypeCode(String id){
		return cargotypecodeDao.deleteCargoTypeCode(id);
	}
	
	public Cargotypecode getCargoTypeCode(String id){
		return cargotypecodeDao.getCargoTypeCode(id);
	}
	

	


}
