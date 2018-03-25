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
import com.dzjin.service.storageTank.StorageTankCargoService;

@Controller
@RequestMapping(value = "/storageTankCargo")
public class StorageTankCargoController {

	@Autowired
	StorageTankCargoService storageTankCargoService;
	
	@RequestMapping(value = "/queryStorageTankCargo")
	public String queryStorageTankCargo(HttpServletRequest request, HttpServletResponse response ,String storageTankTaskId, Integer page, Integer strip){
		if(storageTankTaskId == null){
			StorageTankTask storageTankTask = (StorageTankTask)request.getSession().getAttribute("storageTankTask");
			storageTankTaskId = String.valueOf(storageTankTask.getId());
		}
		Map<String, Object> map = storageTankCargoService.queryStorageTankTask(page, strip, storageTankTaskId);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("storageTankCargoList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/storageTankCargoList.jsp";
	}
	
	@RequestMapping(value = "/insertStorageTankCargo")
	public String insertStorageTankCargo(String storageTankTaskId ,String task ,String cargoType , String transportType ,String  planNum, String actualNum){
		if(1 == storageTankCargoService.insertStorageTankCargo(storageTankTaskId, task, cargoType, transportType, planNum, actualNum)){
			return "storageTankCargo/queryStorageTankCargo?page=1&strip=10";
		}else{
			return "code/storageTankTaskList.jsp";
		}
	}
	
	@RequestMapping(value = "/deleteStorageTankCargo" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteStorageTankCargo(String id){
		if(1 == storageTankCargoService.deleteStorageTankCargo(id)){
			return "删除成功";
		}else{
			return "删除失败";
		}
	}
	
	
}
