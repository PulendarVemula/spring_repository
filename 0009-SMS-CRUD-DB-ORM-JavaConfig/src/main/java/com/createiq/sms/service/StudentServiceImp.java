package com.createiq.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createiq.sms.dao.StudentDAO;
import com.createiq.sms.model.Student;

@Service("stdService")
@Transactional
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;

	public void add(Student student) {

		studentDAO.add(student);
	}
	
	

}
