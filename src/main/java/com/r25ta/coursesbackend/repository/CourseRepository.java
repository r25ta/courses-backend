package com.r25ta.coursesbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.r25ta.coursesbackend.model.Course;


public interface CourseRepository extends JpaRepository<Course, Long>{    
}
