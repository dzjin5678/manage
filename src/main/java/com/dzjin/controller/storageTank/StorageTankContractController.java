package com.dzjin.controller.storageTank;

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

import com.ange.model.StorageTankContract;
import com.dzjin.service.storageTank.StorageTankContractService;

@Controller
@RequestMapping(value = "/storageTankContract")
public class StorageTankContractController {
	
	@Autowired
	StorageTankContractService storageTankContractService;
	
	@RequestMapping(value = "/getStorageTankContract" , method=RequestMethod.POST)
	public String getStorageTankContract(HttpServletRequest request , String id){
		StorageTankContract storageTankContract = storageTankContractService.getStorageTankContract(id);
		if(null!=storageTankContract){
			List<StorageTankContract> storageTankContracts = new ArrayList<StorageTankContract>();
			storageTankContracts.add(storageTankContract);
			request.getSession().setAttribute("storageTankContracts", storageTankContracts);
			request.getSession().setAttribute("storageTankContract", storageTankContract);
			return "code/updateStorageTankContract.jsp";
		}else{
			return "code/storageTankContractList.jsp";
		}
	}
	
	@RequestMapping(value = "/queryStorageTankContract")
	public String queryStorageTankContract(HttpServletRequest request, HttpServletResponse response ,
			String storageTankNumber , Integer page, Integer strip){
		if(storageTankNumber==null){
			storageTankNumber = (String)request.getSession().getAttribute("storageTankNumber");
		}
		Map<String, Object> map = storageTankContractService.queryStorageTankContract(storageTankNumber, page, strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("storageTankNumber", storageTankNumber);
		request.getSession().setAttribute("storageTankContractList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/storageTankContractList.jsp";
	}
	
	@RequestMapping(value = "/deleteStorageTankContract" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteStorageTankContract(String id){
		if(1 == storageTankContractService.deleteStorageTankContract(id)){
			return "删除成功";
		}else{
			return "删除失败";
		}
	}
	
	@RequestMapping(value = "/insertStorageTankContract")
	public String insertStorageTankContract(HttpServletRequest request , String storageTankNumber ,String client ,
			String contract , String cargoName , String  P15, String DCF){
		if(1 == storageTankContractService.insertStorageTankContract(storageTankNumber, client, contract, cargoName, P15, DCF)){
			return "storageTankContract/queryStorageTankContract?page=1&strip=10";
		}else{
			return "code/storageTankContractList.jsp";
		}
	}
	
	@RequestMapping(value = "/updateStorageTankContract" , method = RequestMethod.POST)
	public String updateStorageTankContract(String id , String storageTankNumber ,String client ,
			String contract ,String cargoName,String P15 ,String DCF){
		if(1 == storageTankContractService.updateStorageTankContract(id, storageTankNumber, client, contract, cargoName, P15, DCF)){
			return "storageTankContract/queryStorageTankContract?page=1&strip=10";
		}else{
			return "code/storageTankContractList.jsp";
		}
	}
}
