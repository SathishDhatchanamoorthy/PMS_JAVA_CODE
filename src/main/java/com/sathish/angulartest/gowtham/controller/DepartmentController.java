package com.sathish.angulartest.gowtham.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.angulartest.gowtham.entity.Department;
import com.sathish.angulartest.gowtham.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService depserv;
	
	
	
	@GetMapping("/getall")
	public List<Department> getall(){
		return depserv.getall();
	}
	
	@GetMapping("/getbyid/{dep_id}")
	public Optional<Department> getbyid(@PathVariable int dep_id) {
		return depserv.getbyid(dep_id);
	}
	
	@PostMapping("/add")
	public String adddep(@RequestBody Department dep_body) {
		return depserv.adddep(dep_body);
	}
	
	@PutMapping("/update")
	public String updatedep(@RequestBody Department dep_body) {
		return depserv.updatedep(dep_body);
	}
	
	@DeleteMapping("/delete/{dep_id}")
	public String deletedep(@PathVariable int dep_id) {
		return depserv.deletedep(dep_id);
	}

}
