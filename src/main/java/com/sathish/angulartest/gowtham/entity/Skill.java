package com.sathish.angulartest.gowtham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill_master")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int skill_id;
	
	public String skill_name;
	
	public String skill_category;
	
	public String pro_lvl;

	public int getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	public String getSkill_name() {
		return skill_name;
	}

	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}

	public String getSkill_category() {
		return skill_category;
	}

	public void setSkill_category(String skill_category) {
		this.skill_category = skill_category;
	}

	public String getPro_lvl() {
		return pro_lvl;
	}

	public void setPro_lvl(String pro_lvl) {
		this.pro_lvl = pro_lvl;
	}

	public Skill(int skill_id, String skill_name, String skill_category, String pro_lvl) {
		super();
		this.skill_id = skill_id;
		this.skill_name = skill_name;
		this.skill_category = skill_category;
		this.pro_lvl = pro_lvl;
	}
	
	

}
