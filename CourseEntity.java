package com.example.StudentInfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseEntity {

	public CourseEntity() {
		super();
	}

	@Id
	public int course_id;
	public String course_name;
	public String description;
	private int teacherid;

	
	@ManyToOne
	private StudentEntity st;
public CourseEntity(int course_id, String course_name, String description, int studentId,int teacherid) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.description = description;
		this.st = new StudentEntity(studentId," ","","","",0);
		this.teacherid=teacherid;
			
		
	}

	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name; 
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	public StudentEntity getSt() {
		return st;
	}

	public void setSt(StudentEntity st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "CourseEntity [course_id=" + course_id + ", course_name=" + course_name + ", description=" + description
				+ ", st=" + st + "]";
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
}

