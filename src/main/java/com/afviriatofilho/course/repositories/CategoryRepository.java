package com.afviriatofilho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afviriatofilho.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
