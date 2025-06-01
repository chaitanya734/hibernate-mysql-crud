package com.chaitanya.spring.springhibernate2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitanya.spring.springhibernate2.businessLayer.StudentLayer;
import com.chaitanya.spring.springhibernate2.businessLayer.StudentLayerImp;
import com.chaitanya.spring.springhibernate2.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/chaitanya/spring/springhibernate2/metadata.xml");
    	
    	StudentLayer student = (StudentLayerImp)context.getBean("studentLayerImp");
    	
    	Student stu = new Student(4,"gopi","20AP1A0507","7858554565",50);
    	Student stu1 = new Student(8,"gopi","20AP1A0507","7858554565",50);
    	 student.insert(stu1);
    	
    
    	
    }
}
