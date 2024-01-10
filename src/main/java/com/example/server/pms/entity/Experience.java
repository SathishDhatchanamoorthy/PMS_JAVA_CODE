package com.example.server.pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "experience_master")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exp_id")
	private int experienceId;
	
	@Column(name = "exp_level")
	private int expLevel;
	
	@Column(name = "no_of_years")
	private int noOfYears;

	public int getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}

	public int getExpLevel() {
		return expLevel;
	}

	public void setExpLevel(int expLevel) {
		this.expLevel = expLevel;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public Experience(int experienceId, int expLevel, int noOfYears) {
		super();
		this.experienceId = experienceId;
		this.expLevel = expLevel;
		this.noOfYears = noOfYears;
	}

	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Experience [experienceId=" + experienceId + ", expLevel=" + expLevel + ", noOfYears=" + noOfYears + "]";
	}
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 

}
