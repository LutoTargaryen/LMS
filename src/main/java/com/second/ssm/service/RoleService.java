package com.second.ssm.service;

import java.util.List;

import com.second.ssm.pojo.Role;

/**
 * 角色业务层接口
 * 
 * @author luto
 *
 */
public interface RoleService {
	/**
	 * 根据角色Id查询角色
	 * 
	 * @param Id
	 * @return
	 */
	Role selectRoleById(Integer Id);
	
	List<Role> getAllRoles();
}
