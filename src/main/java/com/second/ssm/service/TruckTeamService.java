package com.second.ssm.service;

import java.util.List;

import com.second.ssm.pojo.Truckteam;
import com.second.ssm.pojo.TruckteamExample;

/**
 * 车队业务层
 * 
 * @author luto
 *
 */
public interface TruckTeamService {
	List<Truckteam> getTruckteams();

	int add(Truckteam truckteam);

	int update(Truckteam truckteam);

	int delete(Integer id);

	List<Truckteam> getTruckTeamsBySY(TruckteamExample truckteamExample);

	String getTruckTeamName(Integer id);
}
