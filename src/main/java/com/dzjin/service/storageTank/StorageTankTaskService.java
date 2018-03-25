package com.dzjin.service.storageTank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.StorageTankTaskDao;
import com.ange.model.StorageTankTask;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StorageTankTaskService {
	
	@Autowired
	StorageTankTaskDao storageTankTaskDao;
	
	public int insertStorageTankTaskDao(String storageTankNumber,String contract,String task,String notify,
			String ladingBill,String customPassFile,String loadUnloadDatetime){
		return storageTankTaskDao.insertStorageTankTaskDao(storageTankNumber, contract, task, notify, 
				ladingBill, customPassFile, loadUnloadDatetime);
	}
	
	public StorageTankTask getStorageTankTask(String id){
		return storageTankTaskDao.getStorageTankTask(id);
	}
	
	public Map<String, Object> queryStorageTankTask(Integer page, Integer strip , 
			String storageTankNumber , String contract){
		PageHelper.startPage(page, strip);
		List<StorageTankTask> list = storageTankTaskDao.queryStorageTankTask(storageTankNumber, contract);
		PageInfo<StorageTankTask> pageInfo = new PageInfo<StorageTankTask>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}
	
	public int deleteStorageTankNumber(String id){
		return storageTankTaskDao.deleteStorageTankNumber(id);
	}
	
	public int updateStorageTankTask(String id , String task,String notify,String ladingBill,
			String customPassFile,String loadUnloadDatetime){
		return storageTankTaskDao.updateStorageTankTaskDao(id, task, notify, ladingBill, 
				customPassFile, loadUnloadDatetime);
	}

}
