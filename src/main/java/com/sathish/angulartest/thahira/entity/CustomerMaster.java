package com.sathish.angulartest.thahira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerMaster {

    @Id
    private Long customerId;
    
    @Column
    private String customerName;
    
    @Column
    private String customerLocation;
    
    @Column
    private int noOfProjectCompleted;
    
    @Column
    private String partner;
    
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
	
	public int getNoOfProjectCompleted() {
		return noOfProjectCompleted;
	}
	public void setNoOfProjectCompleted(int noOfProjectCompleted) {
		this.noOfProjectCompleted = noOfProjectCompleted;
	}
	
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", customerName=" + customerName + ", customerLocation="
				+ customerLocation + ", noOfProjectCompleted=" + noOfProjectCompleted + ", partner=" + partner
				+ ", status=" + status + "]";
	}

    }