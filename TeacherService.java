package com.example.TeacherInfo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TeacherInfo.Entity.TeacherEntity;
import com.example.TeacherInfo.Repository.TeacherRepo;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo repo;

    public List<TeacherEntity> getTeachers() {
        return repo.findAll();
    }

    public Optional<TeacherEntity> getTeacher(Integer teacherId) {
        return repo.findById(teacherId);
    }

    public void deleteTeacher(Integer teacherId) {
        repo.deleteById(teacherId);
    }

    public TeacherEntity updateTeacher(TeacherEntity entity, Integer teacherid) {
        return repo.save(entity);
    }

    public TeacherEntity addTeacher(TeacherEntity entity) {
        return repo.save(entity);
    }
}