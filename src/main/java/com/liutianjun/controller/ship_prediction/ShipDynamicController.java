package com.liutianjun.controller.ship_prediction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ange.dao.StoragecodeDao;
import com.ange.dao.WharfcodeDao;
import com.ange.model.Storagecode;
import com.ange.model.Wharfcode;
import com.liutianjun.pojo.ShipDynamic;
import com.liutianjun.service.ShipDynamicService;
/**
 * 船舶动态管理Controller
 * @author a121bc
 *
 */
@Controller
@RequestMapping("/ship_dynamic")
public class ShipDynamicController {

	@Autowired
	private ShipDynamicService shipDynamicService;
	

	@Autowired
	private StoragecodeDao storagecodeDao;
	@Autowired
	private WharfcodeDao wharfcodeDao;
	
	/*public String showIndex() {
		return "ship_predition/ship_dynamic.jsp";
	}*/
	
	/**
	 * 船舶动态列表
	 * @Title: getShipDynamicList 
	 * @param @param page
	 * @param @param strip
	 * @param @param model
	 * @param @return 
	 * @return String
	 */
	@RequestMapping("/list")
	public String getShipDynamicList(@RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="strip", defaultValue="10")int strip, Model model) {
		List<ShipDynamic> list = shipDynamicService.getShipDynamicList(page, strip);
		int total = shipDynamicService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", total);
		return "ship_predition/ship_dynamic.jsp";
	}
	
	/**
	 * 船舶动态列表（船舶作业父表）
	 * @Title: getShipDynamicOp 
	 * @param @param page
	 * @param @param strip
	 * @param @param model
	 * @param @return 
	 * @return String
	 */
	@RequestMapping("/list_o")
	public String getShipDynamicOp(@RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="strip", defaultValue="10")int strip, @RequestParam(value="shipForecastId")int shipForecastId, Model model) {
		List<ShipDynamic> list = shipDynamicService.getShipDynamicListByShipForecastId(page, strip, shipForecastId);
		int total = shipDynamicService.countByShipForecastId(shipForecastId);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", total);
		model.addAttribute("shipDynamicId", shipForecastId);
		return "ship_predition/ship_dynamic_opertaion.jsp";
	}
	
	/**
	 * 船舶动态列表
	 * @Title: getShipDynamicListByForecast 
	 * @param @param page
	 * @param @param strip
	 * @param @param shipForecastId
	 * @param @param model
	 * @param @return 
	 * @return String
	 */
	@RequestMapping("/shipdynamic")
	public String getShipDynamicListByForecast(@RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="strip", defaultValue="10")int strip,@RequestParam(value="shipForecastId")int shipForecastId , Model model) {
		List<ShipDynamic> list = shipDynamicService.getShipDynamicListByForecast(page, strip, shipForecastId);
		int total = shipDynamicService.countByShipForecastId(shipForecastId);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", total);
		model.addAttribute("shipForecastId", shipForecastId);
		return "ship_predition/ship_dynamic_child.jsp";
	}
	
	/**
	 * 插入船舶动态记录
	 * @Title: insert 
	 * @param @param record
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST)
	public String insert(ShipDynamic record) {
		Integer shipForecastId = record.getShipForecastId();
		if(1 == shipDynamicService.insert(record)){
			return "redirect:/ship_dynamic/shipdynamic?shipForecastId=" + shipForecastId;
		}else{
			return "redirect:/ship_dynamic/shipdynamic?shipForecastId=" + shipForecastId;
		}
	}
	
	/**
	 * 跳转到船舶动态添加页面
	 * @Title: insertBefore 
	 * @param shipForecastId
	 * @param model
	 * @return String
	 */
	@RequestMapping("/insertbefore")
	public String insertBefore(@RequestParam(value="shipForecastId")Integer shipForecastId, Model model) {
		
		//添加获取菜单
		List<Storagecode> StoragecodeList = storagecodeDao.queryStorageCode();
		model.addAttribute("StoragecodeList", StoragecodeList);
		//添加码头菜单
		List<Wharfcode> WharfcodeList = wharfcodeDao.queryWharfCode();
		model.addAttribute("WharfcodeList", WharfcodeList);
		
		model.addAttribute("shipForecastId", shipForecastId);
		return "ship_predition/add_ship_dynamic.jsp";
	}
	
	/**
	 * 删除船舶动态记录
	 * @Title: delete 
	 * @param @param id
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	@ResponseBody
	public String delete(Integer id ) {
		if(1 == shipDynamicService.deleteByPrimaryKey(id)){
			return "redirect:/ship_dynamic/shipdynamic";
		}else{
			return "redirect:/ship_dynamic/shipdynamic";
		}
	}
	
	/**
	 * 修改船舶动态信息
	 * @Title: updateByPrimaryKey 
	 * @param @param record
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String updateByPrimaryKey(ShipDynamic record){
		Integer shipForecastId = record.getShipForecastId();
		if(1 == shipDynamicService.updateByPrimaryKey(record)){
			return "redirect:/ship_dynamic/shipdynamic?shipForecastId=" + shipForecastId;
		}else{
			return "redirect:/ship_dynamic/shipdynamic?shipForecastId=" + shipForecastId;
		}
	}
	
	/**
	 * 跳转船舶动态修改页面
	 * @Title: updateBefore 
	 * @param @param id
	 * @param @param model
	 * @param @return 
	 * @return String
	 */
	@RequestMapping("/updatebefore")
	public String updateBefore(@RequestParam(value="id")Integer id, Model model){
		ShipDynamic shipDynamic = shipDynamicService.selectByPrimaryKey(id);
		model.addAttribute("shipDynamic", shipDynamic);
		
		//添加获取菜单
		List<Storagecode> StoragecodeList = storagecodeDao.queryStorageCode();
		model.addAttribute("StoragecodeList", StoragecodeList);
		//添加码头菜单
		List<Wharfcode> WharfcodeList = wharfcodeDao.queryWharfCode();
		model.addAttribute("WharfcodeList", WharfcodeList);
		return "/ship_predition/update_ship_dynamic.jsp";
		
	}
	
	
	
	
	
}
