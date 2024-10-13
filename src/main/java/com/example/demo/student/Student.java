package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

/**
 * This class is a model class that represents a student
 * So it is purely data and has no logic
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    private String name;

    public Student() {
    }
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(String name, String email, Integer age, LocalDate dob) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
