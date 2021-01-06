package com.cell.course.repositories;


import com.cell.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
