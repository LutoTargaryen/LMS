package com.second.ssm.service;

import java.util.List;

import com.second.ssm.pojo.Role;

public interface RoleService {
	List<Role> selectRoles();

	void addRole(Role role);
}
