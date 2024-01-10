package com.example.server.pms.entity;

import java.util.List;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "designation_master")
public class Designation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "designation_id")
	private int id;
	
	@Column(name = "designation_name")
	private String designationName;
	
	@Column(name = "job_role")
	private String jobRole;
	
	@OneToMany
	@JoinColumn(name = "designation_id")
	private List<Employeemaster> employees;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Designation(int id, String designationName, String jobRole) {
		super();
		this.id = id;
		this.designationName = designationName;
		this.jobRole = jobRole;
	}

	public Designation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Designation [id=" + id + ", designationName=" + designationName + ", jobRole=" + jobRole + "]";
	}
	
	
	
	
	
	

}
