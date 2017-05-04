package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.RoleMapper;
import com.second.ssm.pojo.Role;
import com.second.ssm.service.RoleService;

/**
 * 角色service接口实现
 * 
 * @author luto
 *
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public Role selectRoleById(Integer Id) {
		return roleMapper.selectByPrimaryKey(Id);
	}

	@Override
	public List<Role> getAllRoles() {
		return roleMapper.selectByExample(null);
	}

}
