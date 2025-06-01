package com.chaitanya.spring.springhibernate2.businessLayer;

import java.util.List;

import com.chaitanya.spring.springhibernate2.entites.Student;

public interface StudentLayer {
	
	public void insert(Student student);
	
	public void delete(String id);
	
	public void update(String id);
	
	public List<Student> getDetails();
	
	public Student getDetailsById(String id);

}
