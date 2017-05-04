package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.DriverMapper;
import com.second.ssm.pojo.Driver;
import com.second.ssm.service.DriverService;

@Service("driverService")
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverMapper driverMapper;

	@Override
	public List<Driver> getAllDrivers() {

		return driverMapper.selectByExample(null);
	}

}
