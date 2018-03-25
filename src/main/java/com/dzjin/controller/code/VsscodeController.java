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

import com.ange.model.Vsscode;
import com.dzjin.service.code.VssCodeService;
/**
 * 船舶代码控制器
 * @author dzjin
 *
 */
@Controller
@RequestMapping("/vssCode")
public class VsscodeController {
	
	@Autowired
	VssCodeService vssCodeService;
	
	@RequestMapping(value = "/getVssCode" , method=RequestMethod.POST)
	public String getVssCode(HttpServletRequest request , String id){
		Vsscode vsscode = vssCodeService.getVssCode(id);
		if(null!=vsscode){
			List<Vsscode> vsscodes = new ArrayList<Vsscode>();
			vsscodes.add(vsscode);
			request.getSession().setAttribute("vssCodeList", vsscodes);
			return "code/updateVssCode.jsp";
		}else{
			return "code/vssCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/insertVssCode" , method = RequestMethod.POST)
	public String insertVssCode(String vssCode ,String vssCname ,String vssEname ,String nationality ,
			String caption,String width ,String tonnage ,String cargoType ,String loadline ,
			String distance_outfall_bow , String unitCode ,String agency ,String remark){
		if(1 == vssCodeService.insertVssCode(vssCode, vssCname, vssEname, nationality, 
				caption, width, tonnage, cargoType, loadline, 
				distance_outfall_bow, unitCode, agency, remark)){
			return "code/vssCodeList.jsp";
		}else{
			return "code/addVssCode.jsp";
		}
	}
	
	@RequestMapping(value = "/updateVssCode" , method = RequestMethod.POST)
	public String updateVssCode(String id , String vssCode ,String vssCname ,String vssEname ,String nationality ,
			String caption,String width ,String tonnage ,String cargoType ,String loadline ,
			String distance_outfall_bow , String unitCode ,String agency ,String remark){
		if(1 == vssCodeService.updateVssCode(id , vssCode, vssCname, vssEname, nationality, 
				caption, width, tonnage, cargoType, loadline, 
				distance_outfall_bow, unitCode, agency, remark)){
			return "code/vssCodeList.jsp";
		}else{
			return "code/vssCodeList.jsp";
		}
	}
	
	@RequestMapping(value = "/deleteVssCode" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteVssCode(String id ){
		if(1 == vssCodeService.deleteVssCode(id)){
			return "删除成功！";
		}else{
			return "删除失败！";
		}
	}
	
	@RequestMapping(value = "/queryVssCodeCode" , method = RequestMethod.GET)
	public String queryVssCodeCode(HttpServletRequest request, HttpServletResponse response, Integer page, Integer strip){
		
		Map<String, Object> map = vssCodeService.queryVssCode(page , strip);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("getVssList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "code/vssCodeList.jsp";	
		
	}

}
