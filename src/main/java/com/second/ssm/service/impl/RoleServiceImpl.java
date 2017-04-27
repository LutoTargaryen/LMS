package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.RoleMapper;
import com.second.ssm.pojo.Role;
import com.second.ssm.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper rolemapper;

	@Override
	public List<Role> selectRoles() {

		return rolemapper.selectByExample(null);
	}

	@Override
	public void addRole(Role role) {
		rolemapper.insert(role);
	}

}
