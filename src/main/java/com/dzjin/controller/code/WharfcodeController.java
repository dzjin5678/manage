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

import com.ange.model.Wharfcode;
import com.dzjin.service.code.WharfCodeService;
/**
 * 码头代码控制器
 * @author dzjin
 *
 */
@Controller
@RequestMapping("/wharfCode")
public class WharfcodeController {

	@Autowired
	WharfCodeService wharfCodeService;
	
	@RequestMapping(value = "/getWharfCode" , method=RequestMethod.POST)
	public String getWharfCode(HttpServletRequest request , String id){
		Wharfcode wharfcode = wharfCodeService.getWharfCode(id);
		if(null!=wharfcode){
			List<Wharfcode> wharfcodes = new ArrayList<Wharfcode>();
			wharfcodes.add(wharfcode);
			request.getSession().setAttribute("wharfCodeList", wharfcodes);
			return "code/updateWharfCode.jsp";
		}else{
			return "code/wharfCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/insertWharfCode" , method = RequestMethod.POST)
	public String insertWharfCode(String wharfCode ,String wharfName){
		if(1 == wharfCodeService.insertWharfCode(wharfCode, wharfName)){
			return "code/wharfCodeList.jsp";
		}else{
			return "code/addWharfCode.jsp";
		}
	}
	
	@RequestMapping(value = "/updateWharfCode" , method = RequestMethod.POST)
	public String updateWharfCode(String id , String wharfCode ,String wharfName){
		if(1 == wharfCodeService.updateWharfCode(id , wharfCode, wharfName)){
			return "code/wharfCodeList.jsp";
		}else{
			return "code/wharfCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/deleteWharfCode" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteWharfCode(String id){
		if(1 == wharfCodeService.deleteWharfCode(id)){
			return "删除成功！";
		}else{
			return "删除失败！";
		}
	}
	
	@RequestMapping(value = "/queryWharfCodeCode" , method = RequestMethod.GET)
	public String queryWharfCodeCode(HttpServletRequest request, HttpServletResponse response, 
			Integer page, Integer strip){
		
		Map<String, Object> map = wharfCodeService.queryWharfCode(page , strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("getWharfList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/wharfCodeList.jsp";	
	}
}
