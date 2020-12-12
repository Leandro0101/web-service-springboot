package com.devstudent.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudent.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
