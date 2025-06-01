package com.chaitanya.spring.springhibernate2.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
     @Id
	 private int id;
     @Column(name="Studentname")
	 private String studentname;
	 private String StudentId;
	 private String StudentNumber;
	 private int StudentMarks;
	 
	 public Student() {}
	public Student(int id, String studentname, String studentId, String studentNumber, int studentMarks) {
		super();
		this.id = id;
		this.studentname = studentname;
		StudentId = studentId;
		StudentNumber = studentNumber;
		StudentMarks = studentMarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
	public int getStudentMarks() {
		return StudentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		StudentMarks = studentMarks;
	}
	 
}
