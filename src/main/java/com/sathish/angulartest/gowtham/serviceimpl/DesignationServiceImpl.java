package com.sathish.angulartest.gowtham.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.gowtham.entity.Designation;
import com.sathish.angulartest.gowtham.repository.DesignationRepository;
import com.sathish.angulartest.gowtham.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	private DesignationRepository desrepo;

	@Override
	public List<Designation> getall() {
		return desrepo.findAll();
	}

	@Override
	public Optional<Designation> getbyid(int desg_id) {
		return desrepo.findById(desg_id);
	}

	@Override
	public String adddesg(Designation desg_body) {
		desrepo.save(desg_body);
		return "Designation added successfully";
	}

	@Override
	public String updatedesg(Designation desg_body) {
		desrepo.save(desg_body);
		return "Designation added successfully";
	}

	@Override
	public String deletedesg(int desg_id) {
		desrepo.deleteById(desg_id);
		return "Designation deleted successfully";
	}

}
