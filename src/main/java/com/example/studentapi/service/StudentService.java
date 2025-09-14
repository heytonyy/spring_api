package com.example.studentapi.service;

import com.example.studentapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    // In-memory storage for demo purposes
    private List<Student> students;

    public StudentService() {
        // Initialize with some sample data
        students = new ArrayList<>();
        students.add(new Student(1L, "John", "Doe", "john.doe@email.com", 20));
        students.add(new Student(2L, "Jane", "Smith", "jane.smith@email.com", 22));
        students.add(new Student(3L, "Mike", "Johnson", "mike.johnson@email.com", 19));
        students.add(new Student(4L, "Emily", "Davis", "emily.davis@email.com", 21));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students); // Return a copy to avoid external modification
    }
}