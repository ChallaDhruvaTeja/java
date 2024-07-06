package com.example.StudentInfo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentInfo.Entity.CourseEntity;
import com.example.StudentInfo.Repository.CourseRepo;

@Service
public class CourseService {

    @Autowired
    private CourseRepo repo; 

    public List<CourseEntity> getCourses() {
        return repo.findAll();
    }

    public Optional<CourseEntity> getCourse(Integer courseId) {
        return repo.findById(courseId);
    }

    public void deleteCourse(Integer courseId) {
        repo.deleteById(courseId);
    }

    public CourseEntity updateCourse(CourseEntity entity) {
        return repo.save(entity);
    }

    public CourseEntity addCourse(CourseEntity entity) {
        return repo.save(entity);
    }
}
