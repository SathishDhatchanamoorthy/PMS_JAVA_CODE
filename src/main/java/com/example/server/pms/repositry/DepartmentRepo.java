package com.example.server.pms.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.server.pms.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
