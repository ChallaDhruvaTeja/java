package com.example.StudentInfo.Controller;


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

import com.example.StudentInfo.Entity.StudentEntity;
import com.example.StudentInfo.Service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/students")
    public List<StudentEntity> getAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Optional<StudentEntity> getOneStudent(@PathVariable Integer studentId) {
        return service.getStudent(studentId);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        service.deleteStudent(studentId);
    }

    @PutMapping("/students/{studentId}")
    public StudentEntity updateStudent(@RequestBody StudentEntity update) {
        return service.updateStudent(update);
    }

    @PostMapping("/students")
    public StudentEntity insertStudent(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

//    @GetMapping("/teachers/{teacherId}")
//    
//    public Object getTeacher(@PathVariable Integer teacherId) throws RestClientException {
//        String url = "http://localhost:8098/teachers/" + teacherId; 
//        try {
//			return RestTemplate.getForObject(url, TeacherEntity.class);
//		} catch (RestClientException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
}
