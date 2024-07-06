package com.example.StudentInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentInfo.Entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
   
}
