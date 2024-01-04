package com.sathish.angulartest.gowtham.service;

import java.util.List;
import java.util.Optional;

import com.sathish.angulartest.gowtham.entity.Designation;

public interface DesignationService {
	
    public List<Designation> getall();
	
    public Optional<Designation> getbyid(int desg_id);
	
	public String adddesg(Designation desg_body);
	
	public String updatedesg(Designation desg_body);

	public String deletedesg(int desg_id);

}
