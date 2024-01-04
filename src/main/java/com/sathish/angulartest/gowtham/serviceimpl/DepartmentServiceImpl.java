package com.sathish.angulartest.gowtham.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.gowtham.entity.Department;
import com.sathish.angulartest.gowtham.repository.DepartmentRepository;
import com.sathish.angulartest.gowtham.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository deprepo;
	

	@Override
	public List<Department> getall() {
		return deprepo.findAll();
	}

	@Override
	public Optional<Department> getbyid(int dep_id) {
		return deprepo.findById(dep_id);
	}

	@Override
	public String adddep(Department dep_body) {
		deprepo.save(dep_body);
		return "Department added successfully";
	}

	@Override
	public String updatedep(Department dep_body) {
		deprepo.save(dep_body);
		return "Department updated successfully";
	}

	@Override
	public String deletedep(int dep_id) {
		deprepo.deleteById(dep_id);
		return "Department deleted successfully";
	}

}
