package com.ange.controller.cabin;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ange.model.Goods;
import com.ange.model.GoodsTask;
import com.ange.model.Shipoperation;
import com.ange.service.cabin.TackService;
import com.ange.tool.Result;

/**
 * 船舱——船舶作业、舱单货物管理
 * 
 * @author ange
 *
 */
@RestController
@RequestMapping("/tack")
public class TackController {
	@Autowired
	private TackService tackService;

	/**
	 * 添加船舶作业
	 * 
	 * @param request
	 * @param response
	 * @param dynamicId
	 * @param number
	 * @param operation
	 * @param connectionTime
	 * @param startPump
	 * @param stopTime
	 * @param disconnectTime
	 * @param unberthingTime
	 * @param operationTime
	 * @param weight
	 * @param volume
	 * @param speed
	 * @param inBerthTime
	 * @param remarks
	 * @param realName
	 * @return
	 */
	@RequestMapping("/addShipOperation")
	@ResponseBody
	public Result addShipOperation(HttpServletRequest request, HttpServletResponse response, Integer dynamicId,
			String number, String operation, String connectionTime, String startPump, String stopTime,
			String disconnectTime, String unberthingTime, String operationTime, String weight, String volume,
			String speed, String inBerthTime, String remarks, String realName, Integer userid) {
		Result res = tackService.addShipOperation(dynamicId, number, operation, connectionTime, startPump, stopTime,
				disconnectTime, unberthingTime, operationTime, weight, volume, speed, inBerthTime, remarks, realName,
				userid);
		return res;
	}

	/**
	 * 获取添加船舶货物页面
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param forecastId
	 *            船舶预报id
	 * @return 舱单货物页面
	 * @throws IOException
	 */
	@RequestMapping("/getAddGoodsPage")
	public void getAddGoodsPage(HttpServletRequest request, HttpServletResponse response, Integer forecastId)
			throws IOException {
		request.getSession().setAttribute("forecastId", forecastId);
		response.sendRedirect("../tackPage/addGoods.jsp");
		return;
	}

	/**
	 * 获取添加船舶作业页面
	 * 
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @param dynamicId
	 *            船舶动态id
	 * @return 添加船舶作业页面
	 * @throws IOException
	 */
	@RequestMapping("/getAddShipOperationPage")
	public void getAddShipOperationPage(HttpServletRequest request, HttpServletResponse response, Integer dynamicId)
			throws IOException {
		request.getSession().setAttribute("dynamicId", dynamicId);
		response.sendRedirect("../tackPage/addShipOperation.jsp");
		return;
	}

	/**
	 * 添加船舶货物
	 * 
	 * @param request
	 * @param response
	 * @param forecastId
	 * @param number
	 * @param shipper
	 * @param freightForwarding
	 * @param carryOrder
	 * @param goodsName
	 * @param goodType
	 * @param weight
	 * @param volume
	 * @param uninstallWeight
	 * @param uninstallVolume
	 * @param signName
	 * @param releaseTime
	 * @param extractDate
	 * @param remarks
	 * @param realName
	 * @param userid
	 * @return
	 */
	@RequestMapping("/addGoods")
	@ResponseBody
	public Result addGoods(HttpServletRequest request, HttpServletResponse response, Integer forecastId, String number,
			String shipper, String freightForwarding, String carryOrder, String goodsName, String goodType,
			String weight, String volume, String uninstallWeight, String uninstallVolume, String signName,
			String releaseTime, String extractDate, String remarks, String realName, String userid) {
		Result res = tackService.addGoods(forecastId, number, shipper, freightForwarding, carryOrder, goodsName,
				goodType, weight, volume, uninstallWeight, uninstallVolume, signName, releaseTime, extractDate, remarks,
				realName, userid);
		return res;
	}

	/**
	 * 添加货物作业信息
	 * @param request
	 * @param response
	 * @param shift
	 * @param amount
	 * @param startTime
	 * @param stopTime
	 * @param goodsId
	 * @param userid
	 * @param realName
	 * @return
	 */
	@RequestMapping("/addGoodsTask")
	@ResponseBody
	public Result addGoodsTask(HttpServletRequest request, HttpServletResponse response,String shift,
			Double amount,String startTime,String stopTime,Integer goodsId,Integer userid,String realName,String operation,String reservoirArea) {
		Result res=tackService.addGoodsTask(shift,amount,startTime,stopTime,goodsId,userid,realName,operation,reservoirArea);
		return res;
	}
	/**
	 * 更新货物作业信息
	 * @param request
	 * @param response
	 * @param shift
	 * @param amount
	 * @param startTime
	 * @param stopTime
	 * @param goodsId
	 * @param userid
	 * @param realName
	 * @return
	 */
	@RequestMapping("/updateGoodsTask")
	@ResponseBody
	public Result updateGoodsTask(HttpServletRequest request, HttpServletResponse response,String shift,
			Double amount,String startTime,String stopTime,Integer id,Integer userid,String realName,String operation,String reservoirArea) {
		Result res=tackService.updateGoodsTask(shift,amount,startTime,stopTime,id,userid,realName,operation,reservoirArea);
		return res;
	}

	
	/**
	 * 更新舱单货物
	 * 
	 * @param request
	 * @param response
	 * @param forecastId
	 * @param number
	 * @param shipper
	 * @param freightForwarding
	 * @param carryOrder
	 * @param goodsName
	 * @param goodType
	 * @param weight
	 * @param volume
	 * @param uninstallWeight
	 * @param uninstallVolume
	 * @param signName
	 * @param releaseTime
	 * @param extractDate
	 * @param remarks
	 * @param realName
	 * @param userid
	 * @return
	 */
	@RequestMapping("/updateGoods")
	@ResponseBody
	public Result updateGoods(HttpServletRequest request, HttpServletResponse response, Integer id, String number,
			String shipper, String freightForwarding, String carryOrder, String goodsName, String goodType,
			String weight, String volume, String uninstallWeight, String uninstallVolume, String signName,
			String releaseTime, String extractDate, String remarks, String realName, String userid) {
		Result res = tackService.updateGoods(id, number, shipper, freightForwarding, carryOrder, goodsName, goodType,
				weight, volume, uninstallWeight, uninstallVolume, signName, releaseTime, extractDate, remarks, realName,
				userid);
		return res;
	}

	/**
	 * 删除舱单货物
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            舱单货物id
	 * @return
	 */
	@RequestMapping("/deleteGoods")
	@ResponseBody
	public Result deleteGoods(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Result res = tackService.deleteGoods(id);
		return res;
	}

	/**
	 * 更新船舶作业信息
	 * 
	 * @param request
	 * @param response
	 * @param id
	 * @param number
	 * @param operation
	 * @param connectionTime
	 * @param startPump
	 * @param stopTime
	 * @param disconnectTime
	 * @param unberthingTime
	 * @param operationTime
	 * @param weight
	 * @param volume
	 * @param speed
	 * @param inBerthTime
	 * @param remarks
	 * @param realName
	 * @param userid
	 * @return
	 */

	@RequestMapping("/updateShipOperation")
	@ResponseBody
	public Result updateShipOperation(HttpServletRequest request, HttpServletResponse response, Integer id,
			String number, String operation, String connectionTime, String startPump, String stopTime,
			String disconnectTime, String unberthingTime, String operationTime, String weight, String volume,
			String speed, String inBerthTime, String remarks, String realName, Integer userid) {
		Result res = tackService.updateShipOperation(id, number, operation, connectionTime, startPump, stopTime,
				disconnectTime, unberthingTime, operationTime, weight, volume, speed, inBerthTime, remarks, realName,
				userid);
		return res;
	}

	/**
	 * 删除船舶作业
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            信息id
	 * @return
	 */
	@RequestMapping("/deleteShipOperation")
	@ResponseBody
	public Result deleteShipOperation(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Result res = tackService.deleteShipOperation(id);
		return res;
	}
	/**
	 * 删货物作业
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            id
	 * @return
	 */
	@RequestMapping("/deleteGoodsTask")
	@ResponseBody
	public Result deleteGoodsTask(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Result res = tackService.deleteGoodsTask(id);
		return res;
	}

	/**
	 * 获取船舶作业单条详细信息
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            id
	 * @return
	 */
	@RequestMapping("/getUpdateShipOperationPage")
	public String getUpdateShipOperationPage(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Shipoperation shipoperation = tackService.getShipOperationInfo(id);
		request.getSession().setAttribute("shipoperationId", id);
		request.getSession().setAttribute("shipoperationInfo", shipoperation);
		return "tackPage/updateShipOperation.jsp";
	}

	/**
	 * 获取船舶作业列表
	 * 
	 * @param request
	 * @param response
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return
	 */
	@RequestMapping("/getShipOperationList")
	public String getShipOperationList(HttpServletRequest request, HttpServletResponse response, Integer page,
			Integer strip, Integer dynamicId) {
		Map<String, Object> map = tackService.getShipOperationList(page, strip,dynamicId);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("shipOperationList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "tackPage/shipOperationList.jsp";
	}

	/**
	 * 获取货物作业列表
	 * 
	 * @param request
	 * @param response
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return
	 */
	@RequestMapping("/getGoodsTaskList")
	public String getGoodsTaskList(HttpServletRequest request, HttpServletResponse response, Integer page,
			Integer goodsId, Integer strip) {
		Map<String, Object> map = tackService.getGoodsTaskList(page, strip, goodsId);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("goodsId", goodsId);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("goodsTaskList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "tackPage/goodsTaskList.jsp";
	}

	/**
	 * 获取舱单列表
	 * 
	 * @param request
	 * @param response
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return
	 */
	@RequestMapping("/getGoodsList")
	public String getGoodsList(HttpServletRequest request, HttpServletResponse response, Integer page, Integer strip,Integer forecastId) {
		Map<String, Object> map = tackService.getGoodsList(page, strip,forecastId);
		request.getSession().setAttribute("forecastId", forecastId);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("strip", strip);
		request.getSession().setAttribute("goodsList", map.get("list"));
		request.getSession().setAttribute("total", map.get("total"));
		return "tackPage/goodsList.jsp";
	}

	/**
	 * 获取更新舱单货物页面
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            舱单货物id
	 * 
	 * @return
	 */
	@RequestMapping("/getUpdateGoodsPage")
	public String getUpdateGoodsPage(HttpServletRequest request, HttpServletResponse response, Integer id) {
		Goods goodsInfo = tackService.getGoodsInfo(id);
		request.getSession().setAttribute("goodsId", id);
		request.getSession().setAttribute("goodsInfo", goodsInfo);
		return "tackPage/updateGoods.jsp";
	}

	/**
	 * 获取添加货物作业页面
	 * 
	 * @param request
	 * @param response
	 * @param goodsId
	 * @return
	 */
	@RequestMapping("/getAddGoodsTaskPage")
	public String getAddGoodsTaskPage(HttpServletRequest request, HttpServletResponse response, Integer goodsId) {
		request.getSession().setAttribute("goodsId", goodsId);
		return "tackPage/addGoodsTask.jsp";
	}
	
	/**
	 * 获取添加货物作业页面
	 * 
	 * @param request
	 * @param response
	 * @param goodsId
	 * @return
	 */
	@RequestMapping("/getUpdateGoodsTaskPage")
	public String getUpdateGoodsTaskPage(HttpServletRequest request, HttpServletResponse response, Integer goodsTaskId) {
		request.getSession().setAttribute("goodsTaskId", goodsTaskId);
		GoodsTask goodsTask=tackService.getGoodsTaskInfo(goodsTaskId);
		request.getSession().setAttribute("goodsTaskInfo", goodsTask);
		return "tackPage/updateGoodsTask.jsp";
	}

}
