package com.sathish.angulartest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.angulartest.entity.MenuMaster;

@Repository
public interface MenuRepository extends JpaRepository<MenuMaster, Integer>{

}
