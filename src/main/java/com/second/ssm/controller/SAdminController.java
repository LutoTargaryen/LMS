package com.second.ssm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.second.ssm.pojo.User;
import com.second.ssm.service.RoleService;
import com.second.ssm.service.UserService;
import com.second.ssm.vp.VUser;

/**
 * 
 * 系统管理员控制层
 * 
 * @author luto
 *
 */
@Controller
@RequestMapping("sadmin")
public class SAdminController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	/**
	 * 查看所有用户
	 * 
	 * @return
	 */
	@RequestMapping("list")
	@ResponseBody
	public List<VUser> getAllUsers() {
		List<VUser> allUsers = userService.getAllUsers();
		return allUsers;
	}

	/**
	 * 初始化添加用户
	 * 
	 * @return
	 */
	@RequestMapping("initAddUser")
	public ModelAndView initAddUser() {
		ModelAndView mv = new ModelAndView("sadmin/add");
		mv.addObject("roles", roleService.getAllRoles());
		return mv;
	}

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	@RequestMapping("addUser")
	public ModelAndView addUsers(User user) {
		ModelAndView mv = new ModelAndView(
				"redirect:/sadmin/relay.action?path=list");
		Date date = new Date();
		user.setIsdelete(1);
		user.setPassword("123");
		user.setAltertime(date);
		user.setCheckintime(date);
		int i = userService.addUser(user);
		if (i > 0) {
			System.out.println("添加用户成功");
		} else {
			System.out.println("添加用户失败");
		}
		return mv;
	}

	/**
	 * 初始化修改用户
	 * 
	 * @return
	 */
	@RequestMapping("initUpdateUser")
	public ModelAndView initUpdateUser(Integer userid) {
		ModelAndView mv = new ModelAndView("sadmin/update");
		mv.addObject("vuser", userService.getUserById(userid));
		mv.addObject("roles", roleService.getAllRoles());

		return mv;
	}

	/**
	 * 修改用户
	 * 
	 * @return
	 */
	@RequestMapping("updateUser")
	public ModelAndView updateUser(User user) {
		ModelAndView mv = new ModelAndView(
				"redirect:/sadmin/relay.action?path=list");
		VUser auser = userService.getUserById(user.getUserid());
		user.setPassword(auser.getPassword());
		user.setAltertime(auser.getAltertime());
		user.setIsdelete(1);
		user.setCheckintime(new Date());
		userService.updateUser(user);
		return mv;
	}

	/**
	 * 删除用户
	 * 
	 * @return
	 */
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(Integer userid) {
		ModelAndView mv = new ModelAndView(
				"redirect:/sadmin/relay.action?path=list");
		int i = userService.deleteUser(userid);
		System.err.println(i);
		if (i > 0) {
			System.out.println("删除用户失败");
		} else {
			System.out.println("删除用户成功");
		}
		return mv;
	}

	@RequestMapping("relay")
	public ModelAndView Relay(String path) {
		path = "forward:/WEB-INF/views/sadmin/" + path + ".jsp";
		return new ModelAndView(path);
	}
}
