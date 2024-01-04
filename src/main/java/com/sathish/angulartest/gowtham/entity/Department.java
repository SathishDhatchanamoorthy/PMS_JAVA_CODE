package com.sathish.angulartest.gowtham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_master")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int dept_id;
	
	public String dept_name;
	
	public String grade;
	
	public int manager_id;

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public Department(int dept_id, String dept_name, String grade, int manager_id) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.grade = grade;
		this.manager_id = manager_id;
	}
	
	

}
