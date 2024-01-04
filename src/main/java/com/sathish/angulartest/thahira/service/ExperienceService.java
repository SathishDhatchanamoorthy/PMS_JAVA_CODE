package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.ExperienceMaster;
import com.sathish.angulartest.thahira.repository.ExperianceRepository;
import com.sathish.angulartest.thahira.response.Response;

@Service
public class ExperienceService {

	@Autowired
	ExperianceRepository experienceRepository;
	
	 public Response saveExperience(ExperienceMaster experience) {
	         experienceRepository.save(experience);
	         return  new Response(1, "success", experience, true);
	 }
	 
	 public List<ExperienceMaster> getAllExperiences() {
	        return (List<ExperienceMaster>) experienceRepository.findAll();
	  }
	 
	 public Optional<ExperienceMaster> getExperienceById(Long expId) {
	        return experienceRepository.findById(expId);
	    }
	 
	 public Response updateExperience(Long expId, ExperienceMaster updatedExperience) {
	        if (experienceRepository.existsById(expId)) {
	            updatedExperience.setExpId(expId);
	            return new Response(1, "success", updatedExperience, true);
	        } else {
	            // Handle not found scenario
	            return new Response(2, "error", updatedExperience, false);
	        }
	    }
	 
	 public String deleteExperience(Long locationId) {
		 if (experienceRepository.existsById(locationId)) {
			 experienceRepository.deleteById(locationId);
	        return "Deleted Successfully";
	        }
		 else {
			 return "Failed To Delete";
		 }
	}
	 
}
