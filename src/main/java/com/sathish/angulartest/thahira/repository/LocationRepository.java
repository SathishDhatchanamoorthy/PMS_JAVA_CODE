package com.sathish.angulartest.thahira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.angulartest.thahira.entity.LocationMaster;

@Repository
public interface LocationRepository extends JpaRepository<LocationMaster,Long>{

}
