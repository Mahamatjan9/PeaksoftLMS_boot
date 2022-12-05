package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Lesson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {

    List<Lesson> getAllLessons(Long id);

    void addLesson(Long id, Lesson lesson);

    Lesson getLessonById(Long id);

    void updateLesson(Lesson lesson, Long id);

    void deleteLesson(Long id);
}
