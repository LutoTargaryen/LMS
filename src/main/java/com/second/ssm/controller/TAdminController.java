package com.second.ssm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.second.ssm.pojo.Truck;
import com.second.ssm.pojo.Truckteam;
import com.second.ssm.pojo.TruckteamExample;
import com.second.ssm.service.DriverService;
import com.second.ssm.service.TruckService;
import com.second.ssm.service.TruckTeamService;

@Controller
@RequestMapping("tadmin")
public class TAdminController {

	@Autowired
	private TruckTeamService truckTeamService;
	@Autowired
	private TruckService truckService;
	@Autowired
	private DriverService driverService;

	/**
	 * 查询所有车队
	 */
	@RequestMapping("list")
	@ResponseBody
	public List<Truckteam> getTruckTeams() {
		List<Truckteam> truckteams = truckTeamService.getTruckteams();
		return truckteams;
	}

	/**
	 * 根据条件查询车队
	 */
	@RequestMapping("sy")
	@ResponseBody
	public List<Truckteam> getTruckTeamsBySY(String ttname, String ttleader) {
		System.err.println(ttname + "----" + ttleader);
		TruckteamExample example = new TruckteamExample();
		com.second.ssm.pojo.TruckteamExample.Criteria criteria = example
				.createCriteria();
		if (!ttname.trim().equals("")) {
			criteria.andTeamnameLike("%" + ttname + "%");
		}
		if (!ttleader.trim().equals("")) {
			criteria.andLeaderLike("%" + ttleader + "%");
		}
		List<Truckteam> truckteams = truckTeamService
				.getTruckTeamsBySY(example);
		System.err.println(truckteams.size());
		return truckteams;
	}

	/**
	 * 添加车队
	 * 
	 * @param truckteam
	 * @return
	 */
	@RequestMapping("addTeam")
	public ModelAndView add(Truckteam truckteam) {
		if (truckteam == null || truckteam.getTeamname().trim().equals("")) {
			return new ModelAndView("redirect:/tadmin/relay.action?path=list");
		}
		Date date = new Date();
		truckteam.setIsdelete(1);
		truckteam.setAltertime(date);
		truckteam.setCheckintime(date);
		int i = truckTeamService.add(truckteam);
		if (i > 0) {
			System.out.println("车队添加成功");
		} else {
			System.out.println("车队添加失败");
		}
		ModelAndView mv = new ModelAndView(
				"redirect:/tadmin/relay.action?path=list");
		return mv;
	}

	/**
	 * 删除车队
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping("delete")
	public ModelAndView delete(Integer id) {
		ModelAndView mv = new ModelAndView(
				"redirect:/tadmin/relay.action?path=list");
		int i = truckTeamService.delete(id);
		System.err.println(i);
		if (i > 0) {
			System.out.println("删除失败");
		} else {
			System.out.println("删除成功");
		}
		return mv;
	}

	/**
	 * 初始化添加车辆
	 * 
	 * @return
	 */
	@RequestMapping("initadd")
	public ModelAndView initAdd() {
		ModelAndView mv = new ModelAndView("tadmin/addcar");
		List<Truckteam> truckteams = truckTeamService.getTruckteams();
		mv.addObject("truckteams", truckteams);
		return mv;
	}

	@RequestMapping("addcar")
	public ModelAndView addCar(Truck truck) {
		ModelAndView mv = new ModelAndView(
				"redirect:/tadmin/relay.action?path=carlist");
		truck.setState(1);
		Date date = new Date();
		truck.setAltertime(date);
		truck.setCheckintime(date);
		truck.setState(1);
		truckService.add(truck);
		return mv;
	}

	@RequestMapping("carlist")
	@ResponseBody
	public List<Truck> getAllTrucks() {
		List<Truck> allTrucks = truckService.getAllTrucks();
		return allTrucks;
	}

	@RequestMapping("driverlist")
	@ResponseBody
	public List<com.second.ssm.pojo.Driver> getAllDriver() {
		return driverService.getAllDrivers();
	}

	@RequestMapping(value = "gettn", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getTeamNameById(Integer id, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		System.out.println("---------" + truckTeamService.getTruckTeamName(id)
				+ "----------");
		return truckTeamService.getTruckTeamName(id);
	}

	@RequestMapping("relay")
	public ModelAndView Relay(String path) {
		path = "forward:/WEB-INF/views/tadmin/" + path + ".jsp";
		return new ModelAndView(path);
	}
}
