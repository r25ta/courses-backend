package com.r25ta.coursesbackend.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
//The Lombok Data annotation doesn't need to use getters, setters, constructor with all arguments and toString
@Data
public class Course  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(length = 200, nullable = false)
    public String name;

    @Column(length = 50, nullable = false)
    public String category;
}
