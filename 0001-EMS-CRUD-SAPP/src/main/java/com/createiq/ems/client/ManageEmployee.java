package com.createiq.ems.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.ems.controller.EmployeeController;
import com.createiq.ems.model.Address;
import com.createiq.ems.model.Employee;

public class ManageEmployee {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.cfg.xml");
		
		Employee employee1 = new Employee(53922, "Pulendar Vemula", 50000.00);
		Employee employee2 = new Employee(53922, "Pulendar Vemula", 86000.00, new Address(500031, "Madhapur"));
		
		EmployeeController controller = applicationContext.getBean("empController",EmployeeController.class);
		controller.add(employee1);
		System.out.println();
		controller.add(employee2);
		
		
	}
}
