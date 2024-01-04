package com.sathish.angulartest.gowtham.service;

import java.util.List;
import java.util.Optional;

import com.sathish.angulartest.gowtham.entity.Skill;

public interface SkillService {
	
	public List<Skill> getall();
	
    public Optional<Skill> getbyid(int ski_id);
	
	public String addski(Skill ski_body);
	
	public String updateski(Skill ski_body);

	public String deleteski(int ski_id);

}
