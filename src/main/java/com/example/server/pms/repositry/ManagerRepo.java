package com.example.server.pms.repositry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.server.pms.entity.Manager;


@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {
	
	
	

}
