package com.sathish.angulartest.thahira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.angulartest.thahira.entity.CustomerMaster;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerMaster,Long> {

}
