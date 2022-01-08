package com.createiq.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentService;

@Controller("stdController")
public class StudentController{
	
	@Autowired
	private StudentService  studentService;

	public void add(Student student) {

		studentService.add(student);
	}

}
