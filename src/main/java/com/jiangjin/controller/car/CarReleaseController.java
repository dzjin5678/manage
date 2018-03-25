package com.jiangjin.controller.car;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzjin.service.code.CargoTypeCodeService;
import com.jiangjin.model.CarRelease;
import com.jiangjin.service.CarReleaseService;
import com.jiangjin.service.impl.CarReleaseServiceImpl;
import com.liutianjun.pojo.ShipForecast;

@Controller
@RequestMapping("/car_release")
public class CarReleaseController {

	@Autowired
	private CarReleaseService carReleaseService;
	@Autowired
	private CargoTypeCodeService cargoTypeCodeService;
	@RequestMapping("/list")
	public String getCarReleaseList(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "strip", defaultValue = "10") int strip, Model model) {
		List<CarRelease> list = carReleaseService.selectByExample(page, strip);
		int totall = carReleaseService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", totall);
		return "car/car_release.jsp";
	}

	@RequestMapping("/editCarRelease")
	public String editCarRelease(CarRelease carRelease, Model model, @RequestParam(value = "type") String type) {
		carRelease = carReleaseService.findCarReleaseById(carRelease);
		if (carRelease == null) {
			carRelease = new CarRelease();
		}
		model.addAttribute("carRelease", carRelease);
		model.addAttribute("type", type);
		model.addAttribute("cargoTypeList", cargoTypeCodeService.queryCargoTypeCode(1, 100).get("list"));
		return "car/edit_car_release.jsp";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public int deleteById(Integer id) {
		int i = carReleaseService.deletCarRelease(id);
		return i;
	}
	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	@ResponseBody
	public int cancel(Integer id) {
		CarRelease record=new CarRelease();
		record.setId(id);
		record.setIsCancel(1);
		int i = carReleaseService.updateCarRelease(record);
		return i;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String insert(CarRelease record,@RequestParam(value = "type") String type) {
		try {
			int i = 0;
			if (record.getId() != null) {
				i = carReleaseService.updateCarRelease(record);
			} else {
				record.setCreateTime(new Date());
				record.setIsCancel(0);
				record.setReleaseType(1);
				i = carReleaseService.insert(record);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:editCarRelease?id="+record.getId()+"&type="+type;
		}
		return "redirect:list";
	}

}
