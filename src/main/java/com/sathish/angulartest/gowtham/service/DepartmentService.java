package com.sathish.angulartest.gowtham.service;

import java.util.List;
import java.util.Optional;

import com.sathish.angulartest.gowtham.entity.Department;

public interface DepartmentService {
	
	public List<Department> getall();
	
    public Optional<Department> getbyid(int dep_id);
	
	public String addReq(Department dep_body);
	
	public String updatereq(Department dep_body);

	public String deletereq(int dep_id);

}
