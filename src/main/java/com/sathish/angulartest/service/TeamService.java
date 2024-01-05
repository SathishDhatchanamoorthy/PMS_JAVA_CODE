package com.sathish.angulartest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.entity.TeamMaster;
import com.sathish.angulartest.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository tr;
	
	public List<TeamMaster> getAllTeam(){
		return tr.findAll();
	}
	
	public TeamMaster getTeamById(int id) {
		return tr.getById(id);
	}
	
	public TeamMaster addTeam(TeamMaster team) {
		return tr.save(team);
	}
	
	public TeamMaster updateTeam(TeamMaster team) {
		return tr.save(team);
	}
	
	public void deleteTeam(int id) {
		tr.deleteById(id);
	}

}
