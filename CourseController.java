package com.example.StudentInfo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.StudentInfo.Entity.CourseEntity;
import com.example.StudentInfo.Entity.StudentEntity;
import com.example.StudentInfo.Service.CourseService;

@RestController

public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/student/{studentId}/course")
    public List<CourseEntity> getAllCourses() {
        return service.getCourses();
    }

    @GetMapping("/student/{studentId}/{courseId}") 
    public Optional<CourseEntity> getOneCourse(@PathVariable Integer courseId) {
        return service.getCourse(courseId);
    }

    @DeleteMapping("/student/{studentId}/{courseId}") 
    public void deleteCourse(@PathVariable Integer courseId) {
        service.deleteCourse(courseId);
    }

    @PutMapping("/student/{studentId}/{courseId}") 
    public CourseEntity updateCourse( @RequestBody CourseEntity update) {
     
        return service.updateCourse(update);
    }

    @PostMapping ("/students/{studentId}/course")
    
    public CourseEntity insertCourse(@RequestBody CourseEntity course) {
    	course.setSt(new StudentEntity(0,"","","","",0));
 
        return service.addCourse(course);
    }
}
