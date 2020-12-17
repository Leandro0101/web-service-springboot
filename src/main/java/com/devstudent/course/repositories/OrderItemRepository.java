package com.devstudent.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudent.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
