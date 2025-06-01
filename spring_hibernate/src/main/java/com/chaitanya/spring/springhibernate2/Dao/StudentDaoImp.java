package com.chaitanya.spring.springhibernate2.Dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.chaitanya.spring.springhibernate2.entites.Student;
@Component
public class StudentDaoImp implements StudentDao {
  @Autowired 
private	HibernateTemplate hibernateTemplate;

@Override
@Transactional(readOnly=false)
public void insert(Student student) {
	// TODO Auto-generated method stub
	hibernateTemplate.save(student);
	
}

@Override
@Transactional(readOnly=false)
public void delete(String id) {
	// TODO Auto-generated method stub
	hibernateTemplate.delete(id);
}

@Override
@Transactional(readOnly=false)
public void update(String id) {
	// TODO Auto-generated method stub
	hibernateTemplate.update(id);
}

@Override
@Transactional(readOnly=false)
public List<Student> getDetails() {
	// TODO Auto-generated method stub
	return hibernateTemplate.loadAll(Student.class);
}

@Override
@Transactional(readOnly=false)
public Student getDetailsById(String id) {
	// TODO Auto-generated method stub
	return hibernateTemplate.get(Student.class, id);
}

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
	
	}
