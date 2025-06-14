package com.college.studentfacultymanagement.repository;

import com.college.studentfacultymanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
