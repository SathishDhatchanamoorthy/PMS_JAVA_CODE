package com.example.server.pms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_master")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "dept_id")
	private int deptId;
	
	@Column(name = "dept_name")
	private String deptName;
	
	@Column(name = "grade")
	private int grade;
	
	@OneToMany(mappedBy = "department") 
	private List<Location> location;

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


	public Department(int deptId, String deptName, int grade, List<Location> location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.grade = grade;
		this.location = location;
	}

	public Department(int deptId, String deptName, int grade) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.grade = grade;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", grade=" + grade + ", location=" + location
				+ "]";
	}

	
	
	
	
	 
	 

}
