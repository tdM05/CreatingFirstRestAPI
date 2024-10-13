package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This basically performs crud operations on student entity
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}