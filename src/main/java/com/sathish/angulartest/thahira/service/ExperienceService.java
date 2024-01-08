package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.ExperienceMaster;

import com.sathish.angulartest.thahira.repository.ExperienceRepository;
import com.sathish.angulartest.thahira.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class ExperienceService {
	
	private static final Logger logger = LoggerFactory.getLogger(ExperienceService.class);



	@Autowired
	ExperienceRepository experienceRepository;
	
	public Response saveExperience(ExperienceMaster experience) {
		experienceRepository.save(experience);
		 logger.info("Experience saved successfully: {}", experience);
        return new Response(1,"success",experience,true);
		}
		
		
	
		public List<ExperienceMaster> getAllExperiences() {
	        return (List<ExperienceMaster>) experienceRepository.findAll();
		}
		
		
		public Optional<ExperienceMaster> getExperienceById(Long locationId) {
	        return experienceRepository.findById(locationId);
		}
		
		
		public Response updateExperience(Long experienceId, ExperienceMaster updatedExperience) {
	        if (experienceRepository.existsById(experienceId)) {
	        	updatedExperience.setExperienceId(experienceId);
	        	updatedExperience=  experienceRepository.save(updatedExperience);
	        	logger.info("Experience updated successfully: {}", updatedExperience);
	            return new Response(1,"success",updatedExperience,true);
	        } else {
	            // Handle not found scenario
	        	 logger.error("Experience with ID {} not found during update.", experienceId);
	            return new Response(2,"error",updatedExperience,false);
	        }
		}

	  
		public Response deleteExperience(Long experienceId) {
			 if (experienceRepository.existsById(experienceId)) {
				 experienceRepository.deleteById(experienceId);
		        return new Response(1,"success",null,true);
		        }
			 else {
				 return new Response(2,"error",null,false);
			 }
		}
}
