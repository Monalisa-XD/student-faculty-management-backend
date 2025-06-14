package com.college.studentfacultymanagement.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "faculty",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email"),
                @UniqueConstraint(columnNames = "phone")
        })
public class Faculty {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String education;

    @Column(nullable = false)
    private boolean isHod = false;

    @Column(name = "joining_date", nullable = false)
    private LocalDate joiningDate;

    // Constructors
    public Faculty() {}

    // Getters and setters
    public UUID getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    public String getSpecialization() { return specialization; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEducation() { return education; }

    public void setEducation(String education) { this.education = education; }

    public boolean getIsHod() { return isHod; }

    public void setHod(boolean hod) { isHod = hod; }

    public LocalDate getJoiningDate() { return joiningDate; }

    public void setJoiningDate(LocalDate joiningDate) { this.joiningDate = joiningDate; }
}
