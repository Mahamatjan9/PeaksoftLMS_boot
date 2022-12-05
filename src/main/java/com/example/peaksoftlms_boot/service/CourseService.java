package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    List<Course> getAllCourses(Long id);

    void addCourse(Long id, Course course);

    Course getCourseById(Long id);

    void updateCourse(Course course, Long id);

    void deleteCourse(Long id);
}
