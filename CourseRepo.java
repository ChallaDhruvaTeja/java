package com.example.StudentInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentInfo.Entity.CourseEntity;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
