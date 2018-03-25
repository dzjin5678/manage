package com.dzjin.controller.code;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ange.model.StorageTank;
import com.dzjin.service.code.StorageTankCodeService;

@Controller
@RequestMapping(value = "/storageTankCode")
public class StorageTankCodeController {
	
	@Autowired
	StorageTankCodeService storageTankCodeService;
	
	@RequestMapping(value = "/getStorageTankCode" , method=RequestMethod.POST)
	public String getStorageTankCode(HttpServletRequest request , String storageTankNumber){
		System.out.println("储罐号："+storageTankNumber);
		StorageTank storageTank = storageTankCodeService.getStorageTank(storageTankNumber);
		if(null!=storageTank){
			List<StorageTank> storageTanks = new ArrayList<StorageTank>();
			storageTanks.add(storageTank);
			request.getSession().setAttribute("storageTanks", storageTanks);
			return "code/updateStorageTankCode.jsp";
		}else{
			return "code/storageTankCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/queryStorageTankCodeList" , method = RequestMethod.GET)
	public String queryStorageTankCodeList(HttpServletRequest request, HttpServletResponse response ,String type){
		
		List<String> columnStrs = storageTankCodeService.getCloumn();

		int row = storageTankCodeService.getMaxRow();
		String [][] strings = new String[row][columnStrs.size()];
		for(int i=0;i<columnStrs.size();i++){
			//遍历列相同的数值，并对数组响应列进行赋值
			List<StorageTank> storageTanks = storageTankCodeService.queryStorageTankList(columnStrs.get(i));
			for(int j=0;j<storageTanks.size();j++){
				strings[j][i]= storageTanks.get(j).getStorageTankNumber();
			}
		}
		request.getSession().setAttribute("getStorageTankList", strings);
		if(type == null){
			//储罐增删查改功能
			return "code/storageTankCodeList.jsp";	
		}else{
			//只限储罐增删查改功能
			return "code/storageTankCodeListOnlyQuery.jsp";	
		}
		
	}
	
	@RequestMapping(value = "/deleteStorageTank" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteCargoNameCode(String storageTankNumber){
		if(1 == storageTankCodeService.deleteStorageCode(storageTankNumber)){
			return "code/storageTankCodeList.jsp";
		}else{
			return "code/storageTankCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/insertStorageTankCode" , method = RequestMethod.POST)
	public String insertStorageTankCode(String tankColumn ,String storageTankNumber ,
			String storageTankPosition , String storageTankCapacity){
		if(1 == storageTankCodeService.insertStorageTank(tankColumn, storageTankNumber, storageTankPosition, storageTankCapacity)){
			return "code/storageTankCodeList.jsp";
		}else{
			return "code/addStorageTankCode.jsp";
		}
	}
	
	@RequestMapping(value = "/updateStorageTankCode" , method = RequestMethod.POST)
	public String updateStorageTankCode(String id , String tankColumn ,String storageTankNumber ,String storageTankPosition ,String storageTankCapacity){
		if(1 == storageTankCodeService.updateStorageTank(id, tankColumn, storageTankNumber, storageTankPosition, storageTankCapacity)){
			return "code/storageTankCodeList.jsp";
		}else{
			return "code/storageTankCodeList.jsp";
		}
	}

}
