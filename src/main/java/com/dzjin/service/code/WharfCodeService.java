package com.dzjin.service.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.WharfcodeDao;
import com.ange.model.Wharfcode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class WharfCodeService {
	
	@Autowired
	WharfcodeDao wharfcodeDao;
	
	public int insertWharfCode(String wharfCode ,String wharfName){
		return wharfcodeDao.insertWharfCode(wharfCode, wharfName);
	}
	
	public int updateWharfCode(String id , String wharfCode ,String wharfName){
		return wharfcodeDao.updateWharfCode(id , wharfCode, wharfName);
	}
	
	public Map<String, Object> queryWharfCode(Integer page, Integer strip){
		
		PageHelper.startPage(page, strip);
		List<Wharfcode> list = wharfcodeDao.queryWharfCode();
		PageInfo<Wharfcode> pageInfo = new PageInfo<Wharfcode>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteWharfCode(String id){
		return wharfcodeDao.deleteWharfCode(id);
	}
	
	public Wharfcode getWharfCode(String id){
		return wharfcodeDao.getWharfCode(id);
	}

}
