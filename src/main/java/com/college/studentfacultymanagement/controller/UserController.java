package com.college.studentfacultymanagement.controller;

import com.college.studentfacultymanagement.model.User;
import com.college.studentfacultymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Sign up
    @PostMapping("/signup")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Get all users (for testing)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
