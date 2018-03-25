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

import com.ange.model.Unitcode;
import com.dzjin.service.code.UnitCodeService;

/**
 * 单位代码控制器
 * @author dzjin
 *
 */
@Controller
@RequestMapping("/unitCode")
public class UnitCodeController {
	
	@Autowired
	UnitCodeService unitCodeService;
	
	@RequestMapping(value = "/getUnitCode" , method=RequestMethod.POST)
	public String getUnitCode(HttpServletRequest request , String id){
		Unitcode unitcode = unitCodeService.getUnitCode(id);
		if(null!=unitcode){
			List<Unitcode> unitcodes = new ArrayList<Unitcode>();
			unitcodes.add(unitcode);
			request.getSession().setAttribute("unitCodeList", unitcodes);
			return "code/updateUnitCode.jsp";
		}else{
			return "code/unitCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/insertUnitCode" , method = RequestMethod.POST)
	public String insertUnitCode(String unitCode,String unitName,String unitType,String unitEname,String address,String phone){
		if(1 == unitCodeService.insertUnitCode(unitCode, unitName, unitType, unitEname, address, phone)){
			return "code/unitCodeList.jsp";
		}else{
			return "code/addUnitCode.jsp";
		}
	}
	
	@RequestMapping(value = "/updateUnitCode" , method = RequestMethod.POST)
	public String updateUnitCode(String id , String unitCode,String unitName,String unitType,String unitEname,String address,String phone){
		if(1 == unitCodeService.updateUnitCode(id , unitCode, unitName, unitType, unitEname, address, phone)){
			return "code/unitCodeList.jsp";
		}else{
			return "code/unitCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/deleteUnitCode" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteUnitCode(String id ){
		if(1 == unitCodeService.deleteUnitCode(id)){
			return "删除成功！";
		}else{
			return "删除失败！";
		}
	}
	
	@RequestMapping(value = "/queryUnitCodeCode" , method = RequestMethod.GET)
	public String queryUnitCodeCode(HttpServletRequest request, HttpServletResponse response, 
			Integer page, Integer strip){
		
		Map<String, Object> map = unitCodeService.queryUnitCode(page , strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("getUnitList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/unitCodeList.jsp";
	}
	


}
