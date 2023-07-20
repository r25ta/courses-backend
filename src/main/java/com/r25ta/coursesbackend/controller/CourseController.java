package com.r25ta.coursesbackend.controller;

import java.text.MessageFormat;
import java.util.List;

import org.aspectj.bridge.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.r25ta.coursesbackend.model.Course;
import com.r25ta.coursesbackend.service.CourseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
//The Lombok annotation AllArgsConstructor get CourseService, doesn't need use @autowired
@AllArgsConstructor
public class CourseController {
    
    private final static Logger LOGGER = LoggerFactory.getLogger(CourseController.class);
    private CourseService courseService;

    @GetMapping
    public @ResponseBody List<Course>listAllCourses(){
        return courseService.getAllCourses();
    }

    //Using annotation PostMapping, replace RequestMapping(Method=RequestMethod.POST)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE
                 , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course){
        LOGGER.info("Request Result: "+course.toString());
        return courseService.saveCourse(course);
    }
}
