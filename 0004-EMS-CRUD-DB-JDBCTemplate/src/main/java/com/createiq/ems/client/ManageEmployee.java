package com.createiq.ems.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.ems.controller.EmployeeController;
import com.createiq.ems.model.Employee;

public class ManageEmployee {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.cfg.xml");
		
//		Employee employee1 = new Employee(56854, "Basha", 50000.00);
//		Employee employee3 = new Employee(52368, "Akbar", 50000.00);
//		Employee employee4 = new Employee(52458, "Ramu", 50000.00);
//		Employee employee5 = new Employee(54568, "Somu", 50000.00);
		Employee employee2 = new Employee(53689, "Dhamu", 50000.00);
		
		EmployeeController controller = applicationContext.getBean("empController",EmployeeController.class);
//		controller.add(employee1);
		controller.add(employee2);
//		controller.add(employee3);
//		controller.add(employee4);
//		controller.add(employee5);
		
		System.out.println();
//		Employee  employee2 = new Employee();
//		employee2.setEid(53922);
//		employee2.setEname("V Pulendar Sagar");
//		employee2.setEsalary(60000.00);
//		controller.update(employee2);
//		controller.delelte(52368);
		
	}
}
