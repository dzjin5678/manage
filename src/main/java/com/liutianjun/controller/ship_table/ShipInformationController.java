package com.liutianjun.controller.ship_table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liutianjun.pojo.ShipInformation;
import com.liutianjun.service.ShipInformationService;

/**
 * 船舶信息管理
 *
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/ship_information")
public class ShipInformationController {

	@Autowired
	private ShipInformationService shipInformationService;
	
	/**
	 * 船舶信息列表
	 * @Title: getShipInformation 
	 * @param page
	 * @param strip
	 * @param model
	 * @return String
	 */
	@RequestMapping("/list")
	public String getShipInformation(@RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="strip", defaultValue="10")int strip, Model model) {
		List<ShipInformation> list = shipInformationService.getShipInformationList(page, strip);
		int total = shipInformationService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", total);
		return "ship_table/ship_information.jsp";
	}
	
	/**
	 * 外贸船舶信息列表
	 * @Title: getShipInformatioForeignTrade 
	 * @param  page
	 * @param  strip
	 * @param  iFTrade
	 * @param  model
	 * @param 
	 * @return String
	 */
	@RequestMapping("/list_f")
	public String getShipInformatioForeignTrade(@RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="strip", defaultValue="10")int strip, Model model) {
		List<ShipInformation> list = shipInformationService.getShipInformationByFTradeList(page, strip);
		int total = shipInformationService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", total);
		return "ship_table/ship_information_foreign_trade_bill.jsp";
	}
	
	/**
	 * 通过主键删除船舶信息
	 * @Title: deleteByPrimaryKey 
	 * @param @param id
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	@ResponseBody
	public String deleteByPrimaryKey(Integer id) {
		if(1 == shipInformationService.deleteByPrimaryKey(id)){
			return "redirect:/ship_information/list";
		}else{
			return "redirect:/ship_information/list";
		}
	}
	
	/**
	 * 插入船舶信息
	 * @Title: insert 
	 * @param @param record
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST)
	public String insert(ShipInformation record) {
		if(1 == shipInformationService.insert(record)){
			return "redirect:/ship_information/list";
		}else{
			return "redirect:/ship_information/list";
		}
	}
	/**
	 * 修改船舶信息
	 * @Title: updateByPrimaryKeySelective 
	 * @param @param record
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String updateByPrimaryKeySelective(ShipInformation record) {
		if(1 == shipInformationService.updateByPrimaryKey(record)){
			System.out.println("正确");
			return "redirect:/ship_information/list";
		}else{
			System.out.println("错误");
			return "redirect:/ship_information/list";
		}
	}
	
	/**
	 * 跳转船舶信息修改界面
	 * @Title: updateBefore 
	 * @param @param id
	 * @param @param model
	 * @param @return 
	 * @return String
	 */
	@RequestMapping("/updatebefore")
	public String updateBefore(@RequestParam(value="id")Integer id, Model model) {
		ShipInformation shipInformation = shipInformationService.selectByPrimaryKey(id);
		model.addAttribute("shipInformation", shipInformation);
		return "ship_table/update_ship_information.jsp";
	}
	
}
