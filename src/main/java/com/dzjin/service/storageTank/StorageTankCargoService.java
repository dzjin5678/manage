package com.dzjin.service.storageTank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.StorageTankCargoDao;
import com.ange.model.StorageTankCargo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StorageTankCargoService {
	
	@Autowired
	StorageTankCargoDao storageTankCargoDao;
	
	public int insertStorageTankCargo(String storageTankTaskId,String task,String cargoType,
			String transportType,String planNum,String actualNum){
		return storageTankCargoDao.insertStorageTankCargo(storageTankTaskId, task, cargoType, transportType, planNum, actualNum);
	}
	
	public StorageTankCargo getstorageTankCargo(String id){
		return storageTankCargoDao.getstorageTankCargo(id);
	}
	
	public Map<String, Object> queryStorageTankTask(Integer page, Integer strip , String storageTankTaskId){
		PageHelper.startPage(page, strip);
		List<StorageTankCargo> list = storageTankCargoDao.querystorageTankCargo(storageTankTaskId);
		PageInfo<StorageTankCargo> pageInfo = new PageInfo<StorageTankCargo>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteStorageTankCargo(String id){
		return storageTankCargoDao.deleteStorageTankCargo(id);
	}
	
	public int updatestorageTankCargoDao(String id,String cargoType , String transportType,
			String notify,String planNum,String actualNum){
		return storageTankCargoDao.updatestorageTankCargoDao(id, cargoType, transportType, notify, planNum, actualNum);
	}
	
}
