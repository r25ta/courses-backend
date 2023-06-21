package com.r25ta.coursesbackend.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.r25ta.coursesbackend.model.Course;
import com.r25ta.coursesbackend.repository.CourseRepository;


@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}
