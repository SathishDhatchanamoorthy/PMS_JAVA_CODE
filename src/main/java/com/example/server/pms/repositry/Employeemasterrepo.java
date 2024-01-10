package com.example.server.pms.repositry;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.server.pms.entity.Employeemaster;

@Repository
public interface Employeemasterrepo extends JpaRepository<Employeemaster, Integer>{
	
	
	 Optional<Employeemaster> findByEmail(String email);

}
