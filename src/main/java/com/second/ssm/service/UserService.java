package com.second.ssm.service;

import java.util.List;

import com.second.ssm.pojo.User;
import com.second.ssm.vp.VUser;

/**
 * 用户业务层接口
 * 
 * @author luto
 *
 */
public interface UserService {
	/**
	 * 用户登录方法
	 * 
	 * @param user
	 * @return
	 */
	User login(User user);
	/**
	 * 查询所有用户
	 * @return
	 */
	List<VUser> getAllUsers();
	
	/**
	 * 根据Id 查询用户
	 */
	VUser getUserById(Integer userid);
	
	/**
	 * 修改用户
	 * @param user
	 */
	void updateUser(User user);
	
	/**
	 * 添加用户
	 */
	int addUser(User user);
	/**
	 * 根据Id删除用户
	 * @param userId
	 * @return
	 */
	int deleteUser(Integer userId);
}
