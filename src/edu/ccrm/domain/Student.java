package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

// The 'extends' keyword shows inheritance
public class Student extends Person {

    private String regNo;
    private StudentStatus status;
    private List<Course> enrolledCourses;

    public Student(int id, String fullName, String email, String regNo) {
        // 'super()' calls the constructor of the parent class (Person)
        super(id, fullName, email);
        this.regNo = regNo;
        this.status = StudentStatus.ACTIVE;
        this.enrolledCourses = new ArrayList<>();
    }

    // This provides the implementation for the abstract method in Person
    @Override
    public String getProfile() {
        return "Student Profile: " + getFullName() + " | Reg No: " + regNo;
    }
    public String getRegNo() {
        return regNo;
    }
}

// You can create this enum in its own file later,
// but for now, you can define it here to resolve the error.
enum StudentStatus {
    ACTIVE,
    INACTIVE,
    GRADUATED;
}