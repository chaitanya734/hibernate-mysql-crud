package com.chaitanya.spring.springhibernate2.businessLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chaitanya.spring.springhibernate2.Dao.StudentDao;
import com.chaitanya.spring.springhibernate2.entites.Student;
@Component
public class StudentLayerImp implements StudentLayer {
	@Autowired
  private StudentDao studentDao;
	@Override
	public void insert(Student student) {
		// insert the values into the database
		studentDao.insert(student);

	}

	@Override
	public void delete(String id) {
		// delete the values from database by using id
          studentDao.delete(id);
	}

	@Override
	public void update(String id) {
		//update the values by using strig id
		studentDao.update(id);
	}

	@Override
	public List<Student> getDetails() {
		// retervi the data from database all details
		
		return studentDao.getDetails();
	}

	@Override
	public Student getDetailsById(String id) {
		// retervi the data from database by using the id
		return studentDao.getDetailsById(id);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
