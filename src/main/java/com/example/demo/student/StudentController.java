package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //will handle http requests and return json bodies
@RequestMapping(path = "api/v1/student") // This is the URL path that will be used to access the methods in this class
//The full URL will be http://localhost:8080/api/v1/student

// * This is the api layer
public class StudentController {
    private final StudentService studentService;

    @Autowired //this creates new StudentService object automatically
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
