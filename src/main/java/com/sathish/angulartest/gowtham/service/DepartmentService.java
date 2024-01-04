package com.sathish.angulartest.gowtham.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sathish.angulartest.gowtham.entity.Department;

public interface DepartmentService {
	
	public List<Department> getall();
	
    public Optional<Department> getbyid(int dep_id);
	
	public String adddep(Department dep_body);
	
	public String updatedep(Department dep_body);

	public String deletedep(int dep_id);

}
