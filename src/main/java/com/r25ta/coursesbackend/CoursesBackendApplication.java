package com.r25ta.coursesbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.r25ta.coursesbackend.model.Course;
import com.r25ta.coursesbackend.repository.CourseRepository;

@SpringBootApplication
public class CoursesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesBackendApplication.class, args);
	}

	/* A form to population data base for quick test*/
	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository){
		return args -> {
			//First of all delete all registry of base 
			courseRepository.deleteAll();

			//Reg 1
			Course c = new Course();
			c.setName("Angular");
			c.setCategory("Front-End");

			courseRepository.save(c);

			//Reg 2
			Course c1 = new Course();
			c1.setName("Spring Boot");
			c1.setCategory("Back-End");

			courseRepository.save(c1);

			//Reg 3
			Course c2 = new Course();
			c2.setName("Python");
			c2.setCategory("Back-End");

			courseRepository.save(c2);

			//Reg 4
			Course c3 = new Course();
			c3.setName("C#");
			c3.setCategory("Full Stack");

			courseRepository.save(c3);

			//Reg 5
			Course c4 = new Course();
			c4.setName("React");
			c4.setCategory("Front-end");

			courseRepository.save(c4);

		};
	}
}
