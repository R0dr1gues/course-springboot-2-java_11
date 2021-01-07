package com.cell.course.repositories;


import com.cell.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
