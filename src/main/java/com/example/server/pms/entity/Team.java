package com.example.server.pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_master")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "team_id")
	private int teamId;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "team_grade")
	private int teamGrade;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamGrade() {
		return teamGrade;
	}

	public void setTeamGrade(int teamGrade) {
		this.teamGrade = teamGrade;
	}

	public Team(int teamId, String teamName, int teamGrade) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamGrade = teamGrade;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamGrade=" + teamGrade + "]";
	}
	

}
