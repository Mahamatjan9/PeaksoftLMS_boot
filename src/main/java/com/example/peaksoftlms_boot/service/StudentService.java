package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Student;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface StudentService {

    List<Student> getStudentList();

    List<Student> getAllStudents(Long id);

    void addStudent(Long id, Student student) throws IOException;

    Student getStudentById(Long id);

    void updateStudent(Student student, Long id);

    void deleteStudent(Long id);

    void assignStudent(Long groupId, Long studentId) throws IOException;
}
