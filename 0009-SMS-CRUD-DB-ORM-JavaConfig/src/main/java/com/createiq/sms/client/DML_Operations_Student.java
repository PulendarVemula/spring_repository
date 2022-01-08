package com.createiq.sms.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.createiq.sms.config.SpringConfig;
import com.createiq.sms.controller.StudentController;
import com.createiq.sms.model.Student;

public class DML_Operations_Student {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentController studentController = applicationContext.getBean("stdController" , StudentController.class);
		
		Student student1 = new Student(0, "Dhamu", "Sanath Nagar");
		Student student2 = new Student(0, "Rahimu", "Bharath Nagar");
		
		studentController.add(student1);
		studentController.add(student2);
		
	}
}
