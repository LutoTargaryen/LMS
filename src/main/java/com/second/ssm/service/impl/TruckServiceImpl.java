package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.TruckMapper;
import com.second.ssm.pojo.Truck;
import com.second.ssm.service.TruckService;

@Service("truckService")
public class TruckServiceImpl implements TruckService {

	@Autowired
	private TruckMapper truckMapper;

	@Override
	public int add(Truck truck) {
		return truckMapper.insert(truck);
	}

	@Override
	public List<Truck> getAllTrucks() {
		return truckMapper.selectByExample(null);
	}

}
