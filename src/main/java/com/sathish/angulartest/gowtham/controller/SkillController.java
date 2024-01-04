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

import com.sathish.angulartest.gowtham.entity.Skill;
import com.sathish.angulartest.gowtham.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
	
	@Autowired
	private SkillService skiser;
	
	@GetMapping("/getall")
	public List<Skill> getall(){
		return skiser.getall();
	}
	
	@GetMapping("/getbyid/{dep_id}")
	public Optional<Skill> getbyid(@PathVariable int dep_id) {
		return skiser.getbyid(dep_id);
	}
	
	@PostMapping("/add")
	public String adddep(@RequestBody Skill dep_body) {
		return skiser.addski(dep_body);
	}
	
	@PutMapping("/update")
	public String updatedep(@RequestBody Skill dep_body) {
		return skiser.updateski(dep_body);
	}
	
	@DeleteMapping("/delete/{dep_id}")
	public String deletedep(@PathVariable int dep_id) {
		return skiser.deleteski(dep_id);
	}

}
