package com.sathish.angulartest.thahira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerMaster {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long customerId;

	    @Column
	    private String customerName;

	    @Column
	    private String customerLocation;

	    @Column
	    private int noOfProjectsCompleted;

	    @Column
	    private boolean partner;

	    @Column
	    private String status;

    
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	
	
	public String getStatus() {
		return status;
	}
	
	public int getNoOfProjectsCompleted() {
		return noOfProjectsCompleted;
	}
	public void setNoOfProjectsCompleted(int noOfProjectsCompleted) {
		this.noOfProjectsCompleted = noOfProjectsCompleted;
	}
	public boolean isPartner() {
		return partner;
	}
	public void setPartner(boolean partner) {
		this.partner = partner;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", customerName=" + customerName + ", customerLocation="
				+ customerLocation + ", noOfProjectsCompleted=" + noOfProjectsCompleted + ", partner=" + partner
				+ ", status=" + status + "]";
	}
    }