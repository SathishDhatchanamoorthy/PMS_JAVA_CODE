package com.example.server.pms.entity;

import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employeemaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "date_of_birth")
	private String date_of_birth;

	@Column(name = "hire_date")
	private String hire_date;

	@Column(name = "email")
	private String email;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone_number")
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "designation_id")
	private Designation designation;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Manager manager;
	
//	@ManyToOne
//    @JoinColumn(name = "exp_id")
//    private Experience experience;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

//	public Experience getExperience() {
//		return experience;
//	}
//
//	public void setExperience(Experience experience) {
//		this.experience = experience;
//	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Employeemaster(int emp_id, String first_name, String last_name, String date_of_birth, String hire_date,
			String email, String gender, Designation designation, Department department, Manager manager,
			String phoneNumber, Team team) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.hire_date = hire_date;
		this.email = email;
		this.gender = gender;
		this.designation = designation;
		this.department = department;
		this.manager = manager;
		this.phoneNumber = phoneNumber;
//		this.experience = experience;
		this.team= team;
	}

	public Employeemaster() {
		super();
	}

	@Override
	public String toString() {
		return "Employeemaster [emp_id=" + emp_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", date_of_birth=" + date_of_birth + ", hire_date=" + hire_date + ", email=" + email + ", gender="
				+ gender + ", designation=" + designation + ", department=" + department + ", manager=" + manager
				+ ", phoneNumber=" + phoneNumber +", team=" + team + "]";
	}

}
