package com.jiangjin.controller.car;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.messaging.simp.user.UserDestinationResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ange.model.User;
import com.jiangjin.model.CarRelease;
import com.jiangjin.model.CarWeigh;
import com.jiangjin.service.CarReleaseService;
import com.jiangjin.service.CarWeighService;

@Controller
@RequestMapping("/car_weight")
public class CarWeighController {

	@Autowired
	private CarWeighService carWeighService;
	@Autowired
	private CarReleaseService carReleaseService;
	
	@RequestMapping("/list")
	public String getCarReleaseList(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "strip", defaultValue = "10") int strip, Model model) {
		List<CarRelease> list = carReleaseService.selectByExample(page, strip);
		int totall = carReleaseService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", totall);
		model.addAttribute("type","weigh");
		return "car/car_release.jsp";
	}
	
	@RequestMapping("/weightlist")
	public String getCarWeighList(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "strip", defaultValue = "10") int strip,CarWeigh carWeigh,
			HttpServletRequest request,Model model) {
		User user=(User) request.getSession().getAttribute("user");
		carWeigh.setCreator(user.getId());
		List<CarWeigh> list = carWeighService.selectByExample(page, strip,carWeigh);
		int totall = carWeighService.countAll();
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("strip", strip);
		model.addAttribute("total", totall);
		return "car/car_weigh.jsp";
	}

	@RequestMapping("/editCarWeigh")
	public String editCarWeigh(CarWeigh carWeigh, Model model, @RequestParam(value = "type") String type) {
		Integer releaseId=carWeigh.getReleaseId();
		carWeigh = carWeighService.findCarWeighById(carWeigh);
		if (carWeigh == null) {
			carWeigh = new CarWeigh();
			CarRelease release=new CarRelease();
			release.setId(releaseId);
			release=carReleaseService.findCarReleaseById(release);
			carWeigh.setCarCode(release.getCarCode());
		}
		carWeigh.setReleaseId(releaseId);
		
		model.addAttribute("carWeigh", carWeigh);
		model.addAttribute("type", type);
		
		
		return "car/edit_car_weigh.jsp";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public int deleteById(Integer id) {
		int i = carWeighService.deletCarWeigh(id);
		return i;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String insert(CarWeigh record,@RequestParam(value = "type") String type,HttpServletRequest request) {
		try {
			int i = 0;
			if (record.getId() != null) {
				i = carWeighService.updateCarWeigh(record);
			} else {
				User user=(User) request.getSession().getAttribute("user");
				record.setCreator(user.getId());
				i = carWeighService.insert(record);
				carWeighService.saveCargoCar(record.getReleaseId(),record.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:editCarWeigh?id="+record.getId()+"&type="+type;
		}
		return "redirect:weightlist?type=add&releaseId="+record.getReleaseId();
	}

}
