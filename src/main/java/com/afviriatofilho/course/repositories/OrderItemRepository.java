package com.afviriatofilho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afviriatofilho.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
