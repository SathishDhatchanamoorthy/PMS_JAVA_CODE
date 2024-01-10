package com.example.server.pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "manager_id")
	private int managerId;
	
	@Column(name = "manager_name")
	private String managerName;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Manager(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
	
	
	

}
