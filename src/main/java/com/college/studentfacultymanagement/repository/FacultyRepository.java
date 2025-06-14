package com.college.studentfacultymanagement.repository;

import com.college.studentfacultymanagement.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FacultyRepository extends JpaRepository<Faculty, UUID> {
}
