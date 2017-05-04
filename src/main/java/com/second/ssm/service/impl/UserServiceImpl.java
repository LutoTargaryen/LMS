package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.UserMapper;
import com.second.ssm.pojo.User;
import com.second.ssm.service.UserService;
import com.second.ssm.vp.VUser;

/**
 * 用户service接口实现
 * 
 * @author luto
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		return userMapper.login(user);
	}

	@Override
	public List<VUser> getAllUsers() {
		
		return userMapper.getAllUsers();
	}

	@Override
	public VUser getUserById(Integer userid) {
		return userMapper.getUserById(userid);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}
	
	@Override
	public int deleteUser(Integer userId){
		userMapper.deleteByPrimaryKey(userId);
		return userMapper.deleteByPrimaryKey(userId);
	}
	

}
