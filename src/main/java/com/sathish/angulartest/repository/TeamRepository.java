package com.sathish.angulartest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.angulartest.entity.TeamMaster;

@Repository
public interface TeamRepository extends JpaRepository<TeamMaster, Integer>{

}
