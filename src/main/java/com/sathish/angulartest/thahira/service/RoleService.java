package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.RoleMaster;
import com.sathish.angulartest.thahira.repository.RoleRepository;
import com.sathish.angulartest.thahira.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class RoleService {
	private static final Logger logger = LoggerFactory.getLogger(ExperienceService.class);

	
	@Autowired
	RoleRepository roleRepository;
	
	 public Response saveRole(RoleMaster role) {
	         roleRepository.save(role);
	         logger.info("Experience saved successfully: {}", role);
	         return new Response(1, "success", role, true);
	    }
	 
	 public List<RoleMaster> getAllRoles() {
	        return (List<RoleMaster>) roleRepository.findAll();
	 	}

	 public Optional<RoleMaster> getRoleById(Long roleId) {
	        return roleRepository.findById(roleId);
	    }
	 
	 public Response updateRole(Long roleId, RoleMaster updatedRole) {
	        if (roleRepository.existsById(roleId)) {
	            updatedRole.setRoleId(roleId);
	             roleRepository.save(updatedRole);
	             logger.info("Experience updated successfully: {}", updatedRole);
	             return new Response(1, "success", updatedRole, true);
	        } else {
	            // Handle not found scenario
	        	logger.error("Experience with ID {} not found during update.", roleId);
	            return new Response(2, "Error", updatedRole, false);
	        }
	    }
	 
	 public String deleteRole(Long roleId) {
		 if (roleRepository.existsById(roleId)) {
			 roleRepository.deleteById(roleId);
	        return "Deleted Successfully";
	        }
		 else {
			 return "Failed To Delete";
		 }
	}
}
