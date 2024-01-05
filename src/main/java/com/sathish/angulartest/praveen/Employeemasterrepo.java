package com.sathish.angulartest.praveen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Employeemasterrepo extends JpaRepository<Employeemaster, Integer>{
	

}
