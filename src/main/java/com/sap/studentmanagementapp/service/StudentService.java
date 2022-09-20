package com.sap.studentmanagementapp.service;

import com.sap.studentmanagementapp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    void save(Student student);

    Student getStudentById(Long id);

    Student update(Student student);

    void delete(Long id);
}
