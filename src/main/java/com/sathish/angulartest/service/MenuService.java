package com.sathish.angulartest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.entity.MenuMaster;
import com.sathish.angulartest.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository mr;
	
	public List<MenuMaster> getAllMenu(){
		return mr.findAll();
	}
	
	public MenuMaster getMenuById(int id) {
		return mr.getById(id);
	}
	
	public MenuMaster addMenu(MenuMaster menu) {
		return mr.save(menu);
	}
	
	public MenuMaster updateMenu(MenuMaster menu) {
		return mr.save(menu);
	}
	
	public void deleteMenu(int id) {
		mr.deleteById(id);
	}

}
