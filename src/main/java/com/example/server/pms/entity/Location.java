package com.example.server.pms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "location_master")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "location_id")
	private int locationId;
	
	@Column(name = "location_name")
	private String locationName;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	 @ManyToOne
	 @JsonIgnore
	 @JoinColumn(name = "dept_id")
	 private Department department;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Location(int locationId, String locationName, String city, String state, String country, String postalCode,
			Department department) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.department = department;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", city=" + city + ", state="
				+ state + ", country=" + country + ", postalCode=" + postalCode + ", department=" + department + "]";
	}
	 
	 
	 
	 

}
