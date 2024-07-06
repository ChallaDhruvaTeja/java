package com.example.StudentInfo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentInfo.Entity.StudentEntity;
import com.example.StudentInfo.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

 
    public List<StudentEntity> getStudents() {
        return repo.findAll();
    }


    public Optional<StudentEntity> getStudent(Integer studentId) {
        return repo.findById(studentId);
    }


    public void deleteStudent(Integer studentId) {
        repo.deleteById(studentId);
    }


    public StudentEntity updateStudent(StudentEntity entity) {
        return repo.save(entity);
    }

    public StudentEntity addStudent(StudentEntity entity) {
        return repo.save(entity);
    }
}
