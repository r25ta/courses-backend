package com.r25ta.coursesbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.r25ta.coursesbackend.model.Course;
import com.r25ta.coursesbackend.service.CourseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
//The Lombok annotation AllArgsConstructor get CourseService, doesn't need use @autowired
@AllArgsConstructor
public class CourseController {
 
    private CourseService courseService;

    @GetMapping
    public @ResponseBody List<Course>listAllCourses(){
        return courseService.getAllCourses();
    }
}
