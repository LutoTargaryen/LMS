package com.second.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.ssm.mapper.TruckteamMapper;
import com.second.ssm.pojo.Truckteam;
import com.second.ssm.pojo.TruckteamExample;
import com.second.ssm.service.TruckTeamService;

@Service("truckTeamService")
public class TruckTeamServiceImpl implements TruckTeamService {

	@Autowired
	private TruckteamMapper truckTeaMMapper;

	@Override
	public int add(Truckteam truckteam) {

		return truckTeaMMapper.insert(truckteam);
	}

	@Override
	public int update(Truckteam truckteam) {
		return truckTeaMMapper.updateByPrimaryKey(truckteam);
	}

	@Override
	public int delete(Integer id) {
		return truckTeaMMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Truckteam> getTruckteams() {
		return truckTeaMMapper.selectByExample(null);
	}

	@Override
	public List<Truckteam> getTruckTeamsBySY(TruckteamExample truckteamExample) {

		return truckTeaMMapper.selectByExample(truckteamExample);
	}

	@Override
	public String getTruckTeamName(Integer id) {
		Truckteam truckteam = truckTeaMMapper.selectByPrimaryKey(Integer
				.valueOf(id));
		if (truckteam != null) {
			return truckteam.getTeamname();
		}
		return "暂无";
	}

}
