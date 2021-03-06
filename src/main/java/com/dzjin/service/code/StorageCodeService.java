package com.dzjin.service.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.StoragecodeDao;
import com.ange.model.Storagecode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StorageCodeService {
	
	@Autowired
	StoragecodeDao storagecodeDao;
	
	public int insertStorageTypeCode(String storageCode ,String storageName ,String storagePosition){
		return storagecodeDao.insertStorageCode(storageCode, storageName, storagePosition);
	}
	
	public int updateStorageTypeCode(String id , String storageCode ,String storageName ,String storagePosition){
		return storagecodeDao.updateStorageCode(id , storageCode, storageName, storagePosition);
	}
	
	
	
	public Map<String, Object> queryStorageCode(Integer page, Integer strip){
		
		PageHelper.startPage(page, strip);
		List<Storagecode> list = storagecodeDao.queryStorageCode();
		PageInfo<Storagecode> pageInfo = new PageInfo<Storagecode>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteStorageCode(String id){
		return storagecodeDao.deleteStorageCode(id);
	}
	
	public Storagecode getStorageCode(String id){
		return storagecodeDao.getStorageCode(id);
	}

}
