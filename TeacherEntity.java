package com.example.StudentInfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TeacherEntity {

public TeacherEntity() {
		super();
	}
public TeacherEntity(int teacherid, int studentId, float studentattendence) {
		super();
		this.teacherid = teacherid;
		this.studentId = studentId;
		this.studentattendence = studentattendence;
	}
@Id
	public int teacherid;
	public int studentId;
	public float studentattendence;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getStudentattendence() {
		return studentattendence;
	}
	public void setStudentattendence(float studentattendence) {
		this.studentattendence = studentattendence;
	}
	
	



}

	
	

