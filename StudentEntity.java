package com.example.StudentInfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_entity")
public class StudentEntity {

  

	public StudentEntity() {
		super();
	}

	public StudentEntity(int studentId, String name, String grade, String gender, String mail,int course_id) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.mail = mail;
		this.course_id=course_id;
		
	}

	@Id
  
    private int studentId;
    private String name;
    private String grade;
    private String gender;
    private String mail;
    private int course_id;
   

 

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
}



