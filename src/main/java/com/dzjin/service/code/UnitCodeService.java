package com.dzjin.service.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.UnitcodeDao;
import com.ange.model.Unitcode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UnitCodeService {

	@Autowired
	private UnitcodeDao unitCodeDao;
	
	public int insertUnitCode(String unitCode,String unitName,String unitType,String unitEname,String address,String phone){
		return unitCodeDao.insertUnitCode(unitCode, unitName, unitType, unitEname, address, phone);
	}
	
	public int updateUnitCode(String id , String unitCode,String unitName,String unitType,String unitEname,String address,String phone){
		return unitCodeDao.updateUnitCode(id , unitCode, unitName, unitType, unitEname, address, phone);
	}
	
	public Map<String, Object> queryUnitCode(Integer page, Integer strip){
		
		PageHelper.startPage(page, strip);
		List<Unitcode> list = unitCodeDao.queryUnitCode();
		PageInfo<Unitcode> pageInfo = new PageInfo<Unitcode>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteUnitCode(String id){
		return unitCodeDao.deleteUnitCode(id);
	}
	
	public Unitcode getUnitCode(String id){
		return unitCodeDao.getUnitCode(id);
	}
	
	

}
