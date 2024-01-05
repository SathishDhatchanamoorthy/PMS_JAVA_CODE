package com.sathish.angulartest.gowtham.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.gowtham.entity.Skill;
import com.sathish.angulartest.gowtham.repository.SkillRepository;
import com.sathish.angulartest.gowtham.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	private SkillRepository skirepo;
	

	@Override
	public List<Skill> getall() {
		return skirepo.findAll();
	}

	@Override
	public Optional<Skill> getbyid(int ski_id) {
		return skirepo.findById(ski_id);
	}

	@Override
	public String addski(Skill ski_body) {
		skirepo.save(ski_body);
		return "Skill updated successfully";
	}

	@Override
	public String updateski(Skill ski_body) {
		skirepo.save(ski_body);
		return "Skill updated successfully";
	}

	@Override
	public String deleteski(int ski_id) {
		skirepo.deleteById(ski_id);
		return "Skill updated successfully";
	}

}
