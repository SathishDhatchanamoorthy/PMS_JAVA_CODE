package com.hyundai.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hyundai.pms.entity.ProjectMaster;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectMaster, Integer>{

}
