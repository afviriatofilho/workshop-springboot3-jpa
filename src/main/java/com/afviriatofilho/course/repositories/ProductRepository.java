package com.afviriatofilho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afviriatofilho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
