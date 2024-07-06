package com.example.TeacherInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TeacherInfo.Entity.TeacherEntity;
@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer> {

}
