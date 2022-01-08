package com.createiq.sms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.sms.model.Student;

@Repository("stdDAO")
public class StudentDAOImp implements StudentDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public void add(Student student) {

		hibernateTemplate.save(student);
		
		System.out.println("student added");
	}

}
