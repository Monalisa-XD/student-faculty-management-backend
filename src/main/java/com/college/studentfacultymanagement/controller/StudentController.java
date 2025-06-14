package com.college.studentfacultymanagement.controller;

import com.college.studentfacultymanagement.model.Student;
import com.college.studentfacultymanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // GET student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable UUID id) {
        return studentRepository.findById(id).orElse(null);
    }

    // POST - Add new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // PUT - Update existing student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable UUID id, @RequestBody Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setPhone(updatedStudent.getPhone());
            student.setDepartment(updatedStudent.getDepartment());
            student.setRollNumber(updatedStudent.getRollNumber());
            student.setAdmissionDate(updatedStudent.getAdmissionDate());
            student.setSemester(updatedStudent.getSemester());
            student.setDob(updatedStudent.getDob());
            student.setGender(updatedStudent.getGender());
            student.setAddress(updatedStudent.getAddress());
            student.setGuardianName(updatedStudent.getGuardianName());
            student.setGuardianPhone(updatedStudent.getGuardianPhone());
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    // DELETE student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable UUID id) {
        studentRepository.deleteById(id);
    }
}
