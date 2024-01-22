package com.afviriatofilho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afviriatofilho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
