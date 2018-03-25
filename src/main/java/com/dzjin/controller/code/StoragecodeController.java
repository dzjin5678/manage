package com.dzjin.controller.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ange.model.Storagecode;
import com.dzjin.service.code.StorageCodeService;
/**
 * 库场代码控制器
 * @author dzjin
 *
 */
@Controller
@RequestMapping("/storageCode")
public class StoragecodeController {

	@Autowired
	StorageCodeService storageCodeService;
	
	@RequestMapping(value = "/getStorageCode" , method=RequestMethod.POST)
	public String getStorageCode(HttpServletRequest request , String id){
		Storagecode storagecode = storageCodeService.getStorageCode(id);
		if(null!=storagecode){
			List<Storagecode> storagecodes = new ArrayList<Storagecode>();
			storagecodes.add(storagecode);
			request.getSession().setAttribute("storageCodeList", storagecodes);
			return "code/updateStorageCode.jsp";
		}else{
			return "code/storageCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/insertStorageCode" , method = RequestMethod.POST)
	public String insertStorageCode(String storageCode ,String storageName ,String storagePosition){
		if(1 == storageCodeService.insertStorageTypeCode(storageCode, storageName, storagePosition)){
			return "code/storageCodeList.jsp";
		}else{
			return "code/addStorageCode.jsp";
		}
	}
	
	@RequestMapping(value = "/updateStorageCode" , method = RequestMethod.POST)
	public String updateStorageCode(String id , String storageCode ,String storageName ,String storagePosition){
		if(1 == storageCodeService.updateStorageTypeCode(id , storageCode, storageName, storagePosition)){
			return "code/storageCodeList.jsp";
		}else{
			return "code/storageCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/deleteStorageCode" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteStorageCode(String id){
		if(1 == storageCodeService.deleteStorageCode(id)){
			return "删除成功！";
		}else{
			return "删除失败！";
		}
	}

	@RequestMapping(value = "/queryStorageCodeCode" , method = RequestMethod.GET)
	public String queryStorageCodeCode(HttpServletRequest request, HttpServletResponse response, 
			Integer page, Integer strip){
		
		Map<String, Object> map = storageCodeService.queryStorageCode(page , strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("storageList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/storageCodeList.jsp";
	}
}
