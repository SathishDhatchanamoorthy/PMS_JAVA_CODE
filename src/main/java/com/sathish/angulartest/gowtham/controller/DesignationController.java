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

import com.sathish.angulartest.gowtham.entity.Designation;
import com.sathish.angulartest.gowtham.service.DesignationService;

@RestController
@RequestMapping("/designation")
public class DesignationController {
	
	@Autowired
	private DesignationService desgser;
	
	@GetMapping("/getall")
	public List<Designation> getall(){
		return desgser.getall();
	}
	
	@GetMapping("/getbyid/{dep_id}")
	public Optional<Designation> getbyid(@PathVariable int desg_id) {
		return desgser.getbyid(desg_id);
	}
	
	@PostMapping("/add")
	public String adddep(@RequestBody Designation desg_body) {
		return desgser.adddesg(desg_body);
	}
	
	@PutMapping("/update")
	public String updatedep(@RequestBody Designation desg_body) {
		return desgser.updatedesg(desg_body);
	}
	
	@DeleteMapping("/delete/{dep_id}")
	public String deletedep(@PathVariable int dep_id) {
		return desgser.deletedesg(dep_id);
	}

}
