package com.second.ssm.service;

import java.util.List;

import com.second.ssm.pojo.Truck;

public interface TruckService {
	int add(Truck truck);

	List<Truck> getAllTrucks();

}
