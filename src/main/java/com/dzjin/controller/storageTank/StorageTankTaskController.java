package com.dzjin.controller.storageTank;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ange.model.StorageTankTask;
import com.dzjin.service.storageTank.StorageTankTaskService;

@Controller
@RequestMapping(value = "/storageTankTask")
public class StorageTankTaskController {
	
	@Autowired
	StorageTankTaskService storageTankTaskService;
	
	
	@RequestMapping(value = "/getStorageTankTask" , method=RequestMethod.POST)
	public String getStorageTankTask(HttpServletRequest request , String id){
		StorageTankTask storageTankTask= storageTankTaskService.getStorageTankTask(id);
		if(null!=storageTankTask){
			request.getSession().setAttribute("storageTankTask", storageTankTask);
			return "";
		}else{
			return "";
		}
	}
	
	@RequestMapping(value = "/queryStorageTankTask")
	public String queryStorageTankTask(HttpServletRequest request, HttpServletResponse response ,
			String storageTankNumber , String contract, Integer page, Integer strip){
		if(storageTankNumber==null){
			storageTankNumber = (String)request.getSession().getAttribute("storageTankNumber");
		}
		if(contract==null){
			contract = (String)request.getSession().getAttribute("contract");
		}
		Map<String, Object> map = storageTankTaskService.queryStorageTankTask(page, strip, storageTankNumber, contract);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("storageTankNumber", storageTankNumber);
		request.getSession().setAttribute("contract", contract);
		request.getSession().removeAttribute("storageTankTaskList");
		request.getSession().setAttribute("storageTankTaskList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/storageTankTaskList.jsp";
	}
	
	@RequestMapping(value = "/deleteStorageTankTask" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteStorageTankTask(String id){
		if(1 == storageTankTaskService.deleteStorageTankNumber(id)){
			return "删除成功";
		}else{
			return "删除失败";
		}
	}
	
	@RequestMapping(value = "/insertStorageTankTask")
	public String insertStorageTankTask(HttpServletRequest request , String storageTankNumber ,String contract ,String task , String notify ,
			String  ladingBill, String customPassFile ,String loadUnloadDatetime){
		if(1 == storageTankTaskService.insertStorageTankTaskDao(storageTankNumber, contract, task, notify, ladingBill, customPassFile, loadUnloadDatetime)){
			return "storageTankTask/queryStorageTankTask?page=1&strip=10";
		}else{
			return "code/storageTankTaskList.jsp";
		}
	}
	
	@RequestMapping(value = "/updateStorageTankTask" , method = RequestMethod.POST)
	public String updateStorageTankTask(String id , String task , String notify ,
			String  ladingBill, String customPassFile ,String loadUnloadDatetime){
		if(1 == storageTankTaskService.updateStorageTankTask(id, task, notify, ladingBill, customPassFile, loadUnloadDatetime)){
			return "storageTankTask/queryStorageTankTask?page=1&strip=10";
		}else{
			return "code/storageTankContractList.jsp";
		}
	}
	
	
}
