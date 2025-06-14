package com.college.studentfacultymanagement.controller;

import com.college.studentfacultymanagement.model.Faculty;
import com.college.studentfacultymanagement.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    @Autowired
    private FacultyRepository facultyRepository;

    @GetMapping
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Faculty getFaculty(@PathVariable UUID id) {
        return facultyRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @PutMapping("/{id}")
    public Faculty updateFaculty(@PathVariable UUID id, @RequestBody Faculty updated) {
        return facultyRepository.findById(id).map(faculty -> {
            faculty.setName(updated.getName());
            faculty.setDepartment(updated.getDepartment());
            faculty.setSpecialization(updated.getSpecialization());
            faculty.setEmail(updated.getEmail());
            faculty.setPhone(updated.getPhone());
            faculty.setEducation(updated.getEducation());
            faculty.setHod(updated.getIsHod());
            faculty.setJoiningDate(updated.getJoiningDate());
            return facultyRepository.save(faculty);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable UUID id) {
        facultyRepository.deleteById(id);
    }
}
