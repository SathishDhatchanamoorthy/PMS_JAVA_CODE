package com.sathish.angulartest.thahira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocationMaster {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long locationId;
		@Column
	    private String locationName;
		
		@Column
	    private String city;
		
		@Column
	    private String state;
		
		@Column
	    private String country;
		
		@Column
		private String postalCode;
	    
	    @Override
		public String toString() {
			return "LocationMaster [locationId=" + locationId + ", locationName=" + locationName + ", city=" + city
					+ ", state=" + state + ", country=" + country + ", postalCode=" + postalCode + "]";
		}
		
		public Long getLocationId() {
			return locationId;
		}
		public void setLocationId(Long locationId) {
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
}
