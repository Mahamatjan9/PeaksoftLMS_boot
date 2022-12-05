package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Instructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface InstructorService {


    List<Instructor> getInstructorList();

    List<Instructor> getAllInstructors(Long courseId);

    void addInstructor(Long id, Instructor instructor);

    Instructor getInstructorById(Long id);

    void updateInstructor(Instructor instructor, Long id);

    void deleteInstructor(Long id);

    void assignInstructor(Long courseId, Long instruct) throws IOException;
}
