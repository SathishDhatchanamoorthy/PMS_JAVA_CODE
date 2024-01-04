package com.sathish.angulartest.thahira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExperienceMaster {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expId;

    @Column
    private String expLevel;

    @Column
    private String noOfYears;

    @Column
    private String designationId;

	public Long getExpId() {
		return expId;
	}

	public void setExpId(Long expId) {
		this.expId = expId;
	}

	public String getExpLevel() {
		return expLevel;
	}

	public void setExpLevel(String expLevel) {
		this.expLevel = expLevel;
	}

	public String getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(String noOfYears) {
		this.noOfYears = noOfYears;
	}

	public String getDesignationId() {
		return designationId;
	}

	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}

	@Override
	public String toString() {
		return "ExperienceMaster [expId=" + expId + ", expLevel=" + expLevel + ", noOfYears=" + noOfYears
				+ ", designationId=" + designationId + "]";
	}
    
    
}
