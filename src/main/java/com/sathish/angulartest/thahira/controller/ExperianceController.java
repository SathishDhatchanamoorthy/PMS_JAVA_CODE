package com.sathish.angulartest.thahira.controller;

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

import com.sathish.angulartest.thahira.entity.ExperienceMaster;
import com.sathish.angulartest.thahira.response.Response;
import com.sathish.angulartest.thahira.service.ExperienceService;

@RestController
@RequestMapping("/Experience")
public class ExperianceController {

	@Autowired
	ExperienceService experienceService;
	
	@PostMapping
    public Response addExperience(@RequestBody ExperienceMaster experience) {
        return experienceService.saveExperience(experience);
    }
	
	 @GetMapping
	    public List<ExperienceMaster> getAllExperiences() {
	        return experienceService.getAllExperiences();
	 }
	 
	 @GetMapping("/{id}")
	    public Optional<ExperienceMaster> getExperienceById(@PathVariable Long id) {
	        return experienceService.getExperienceById(id);
	    }
	 
	 @PutMapping("/{id}")
	    public Response updateExperience(@PathVariable Long id, @RequestBody ExperienceMaster updatedExperience) {
	        return experienceService.updateExperience(id, updatedExperience);
	    }

	 @DeleteMapping("/{id}")
	    public String deleteExperience(@PathVariable Long id) {
	       return experienceService.deleteExperience(id);
	    }
}
