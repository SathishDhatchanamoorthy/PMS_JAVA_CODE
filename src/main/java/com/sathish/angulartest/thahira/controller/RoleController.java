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

import com.sathish.angulartest.thahira.entity.RoleMaster;
import com.sathish.angulartest.thahira.response.Response;
import com.sathish.angulartest.thahira.service.RoleService;

@RestController
@RequestMapping("/Role")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@PostMapping
    public Response addRole(@RequestBody RoleMaster role) {
        return roleService.saveRole(role);
    }
	
	@GetMapping
    public List<RoleMaster> getAllRoles() {
        return roleService.getAllRoles();
    }
	
	@GetMapping("/{id}")
	public Optional<RoleMaster> getRoleById(@PathVariable Long id) {
	     return roleService.getRoleById(id);
	 }
	
	 @PutMapping("/{id}")
	 public Response updateRole(@PathVariable Long id, @RequestBody RoleMaster updatedRole) {
	      return roleService.updateRole(id, updatedRole);
	 }
	 
	 @DeleteMapping("/{id}")
	 public String deleteRole(@PathVariable Long id) {
	       return roleService.deleteRole(id);
	 }
}
