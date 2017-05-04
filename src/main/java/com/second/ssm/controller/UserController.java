package com.second.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.second.ssm.common.constant.RoleConstant;
import com.second.ssm.pojo.Role;
import com.second.ssm.pojo.User;
import com.second.ssm.service.RoleService;
import com.second.ssm.service.UserService;

/**
 * 用户控制层
 * 
 * @author luto
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;

	/**
	 * 用户登录方法
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public String login(User user, HttpServletRequest request) {
		String result = "";
		// ModeAndView 内部使用 HttpServletRequest的Attribute传值到页面
		User rUser = userService.login(user);
		if (rUser != null) {
			// 根据角色跳转到具体jsp
			Role role = roleService.selectRoleById(rUser.getFkRoleid());
			if (role != null) {
				result = getPath(request, rUser);
			}
		} else {
			result = "login_error";
		}
		return result;
	}

	@RequestMapping("role")
	public ModelAndView toRole(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			// 根据角色跳转到具体jsp
			Role role = roleService.selectRoleById(user.getFkRoleid());
			switch (role.getRolename()) {
			// 系统管理员界面
			case RoleConstant.SADMIN:
				mv.setViewName(RoleConstant.SADMIN + "/index");
				break;
			// 运输管理员
			case RoleConstant.TADMIN:
				mv.setViewName(RoleConstant.TADMIN + "/index");
				break;
			// 调度员
			case RoleConstant.ISPATCHER:
				mv.setViewName(RoleConstant.ISPATCHER + "/index");
				break;
			// 财务人员
			case RoleConstant.ACCOUNTANT:
				mv.setViewName(RoleConstant.ACCOUNTANT + "/index");
				break;
			// 承运业务员
			case RoleConstant.DRIVER:
				mv.setViewName(RoleConstant.DRIVER + "/index");
				break;
			default:
				mv.setViewName("login_error");
				break;
			}
		}
		return mv;
	}

	private String getPath(HttpServletRequest request, User user) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		String res = "forward:/WEB-INF/views/role.jsp";
		return res;
	}
}
