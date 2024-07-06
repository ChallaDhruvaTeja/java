package com.example.TeacherInfo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeacherInfo.Entity.TeacherEntity;
import com.example.TeacherInfo.Service.TeacherService;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/teachers")
    public List<TeacherEntity> getAllTeachers() {
        return service.getTeachers();
    }

    @GetMapping("/teachers/{teacherid}")
    public Optional<TeacherEntity> getOneTeacher(@PathVariable Integer teacherid) {
        return service.getTeacher(teacherid);
    }

    @DeleteMapping("/teachers/{teacherid}")
    public void deleteTeacher(@PathVariable Integer teacherid) {
        service.deleteTeacher(teacherid);
    }

    @PutMapping("/teachers/{teacherid}")
    public TeacherEntity updateTeacher(@RequestBody TeacherEntity update,@PathVariable int teacherid) {
        return service.updateTeacher(update,teacherid);
    }

    @PostMapping("/teachers")
    public TeacherEntity insertTeacher(@RequestBody TeacherEntity teacher) {
        return service.addTeacher(teacher);
    }
}
