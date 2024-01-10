package com.example.server.pms.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.server.pms.entity.Designation;

@Repository
public interface DesignationRepo extends JpaRepository<Designation, Integer>{

}
