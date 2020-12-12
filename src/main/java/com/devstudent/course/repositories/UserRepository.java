package com.devstudent.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudent.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
