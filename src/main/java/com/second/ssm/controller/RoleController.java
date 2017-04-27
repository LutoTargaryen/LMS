package com.second.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.second.ssm.pojo.Role;
import com.second.ssm.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/select")
	public ModelAndView selectRoles() {
		ModelAndView mv = new ModelAndView("listRoles");
		List<Role> roles = roleService.selectRoles();
		roles.forEach(r -> {
			System.err.println(r.getRoleid());
		});
		mv.addObject("roles", roles);
		return mv;
	}

	@RequestMapping("/initadd")
	public String initAdd() {

		return "initadd";
	}

	@RequestMapping("/add")
	public String Add(Integer roleId, String roleName, String rolePurview) {
		Role role = new Role();
		role.setRoleid(roleId);
		role.setRolename(roleName);
		role.setRolepurview(rolePurview);
		roleService.addRole(role);
		return "redirect:/role/select.action";
	}
}
