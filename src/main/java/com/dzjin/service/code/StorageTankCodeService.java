package com.dzjin.service.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.StorageTankCodeDao;
import com.ange.model.StorageTank;

@Service
public class StorageTankCodeService {
	@Autowired
	StorageTankCodeDao storageTankCodeDao;
	
	public List<StorageTank> queryStorageTankList(String tankColumn){
		return storageTankCodeDao.queryStorageTankList(tankColumn);
	}
	
	public StorageTank getStorageTank(String storageTankNumber){
		return storageTankCodeDao.getStorageTank(storageTankNumber);
	}
	
	public int insertStorageTank(String tankColumn ,String storageTankNumber , 
			String storageTankPosition , String storageTankCapacity ){
		return storageTankCodeDao.insertStorageTank(tankColumn, storageTankNumber, 
				storageTankPosition, storageTankCapacity);
				
	}
	
	public int deleteStorageCode(String storageTankNumber){
		return storageTankCodeDao.deleteStorageCode(storageTankNumber);
	}
	
	public List<String> getCloumn(){
		return storageTankCodeDao.getCloumn();
	}
	
	public int getMaxRow(){
		int row = 0;
		int column = storageTankCodeDao.getMaxColumn();
		for(int i=1;i<=column;i++){
			int temp=storageTankCodeDao.getCountByTaskColumn(String.valueOf(i));
			if(temp>row){
				row = temp;
			}
		}
		return row;
	}
	
	public int updateStorageTank(String id , String tankColumn , String storageTankNumber , String storageTankPosition , String storageTankCapacity ){
		return storageTankCodeDao.updateStorageTank(id, tankColumn, storageTankNumber, storageTankPosition, storageTankCapacity);
				
	}

}
