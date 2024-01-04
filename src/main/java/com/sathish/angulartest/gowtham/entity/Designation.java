package com.sathish.angulartest.gowtham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="designation_master")
public class Designation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int designation_id;
	
	public String designation_name;
	
	public String job_role;

	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	public Designation(int designation_id, String designation_name, String job_role) {
		super();
		this.designation_id = designation_id;
		this.designation_name = designation_name;
		this.job_role = job_role;
	}
	
	

}
