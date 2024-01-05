package com.sathish.angulartest.praveen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employeemaster {
//	
//	@Id
//	  //@GeneratedValue(strategy = GenerationType.IDENTITY)
//	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")

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
	@Column(name = "designation_id")
	private Integer designation_id;
	@Column(name = "dept_id")
	private int dept_id;
	@Column(name = "manager_id")
	private int manager_id;
	@Column(name = "location_id")
	private int location_id;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "experience_id")
	private int experience_id;
	@Column(name = "team_id")
	private int team_id;
	@Column(name = "email")
	private String email;
	@Column(name = "gender")
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}

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

	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public int getExperience_id() {
		return experience_id;
	}

	public void setExperience_id(int experience_id) {
		this.experience_id = experience_id;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employeemaster() {
		super();
	}

	public Employeemaster(int emp_id, String first_name, String last_name, String date_of_birth, String hire_date,
			Integer designation_id, int dept_id, int manager_id, int location_id, String phone_number,
			int experience_id, int team_id, String email, String gender) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.hire_date = hire_date;
		this.designation_id = designation_id;
		this.dept_id = dept_id;
		this.manager_id = manager_id;
		this.location_id = location_id;
		this.phone_number = phone_number;
		this.experience_id = experience_id;
		this.team_id = team_id;
		this.email = email;
		this.gender = gender;
	}

}
