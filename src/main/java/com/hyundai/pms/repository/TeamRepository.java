package com.hyundai.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hyundai.pms.entity.TeamMaster;

@Repository
public interface TeamRepository extends JpaRepository<TeamMaster, Integer>{

}
