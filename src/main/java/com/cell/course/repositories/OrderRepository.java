package com.cell.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cell.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
