package com.createiq.ems.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.createiq.ems.config.SpringConfig;
import com.createiq.ems.controller.EmployeeController;
import com.createiq.ems.model.Employee;

public class DML_Operations_Employee {
	
	public static void main(String[] args) {
		
        ApplicationContext applicationContext  = new AnnotationConfigApplicationContext(SpringConfig.class);		
		EmployeeController  employeeController = applicationContext.getBean("empController" , EmployeeController.class);
		
		Employee employee1 = new Employee(56854, "Basha", 50000.00);
		Employee employee2 = new Employee(53922, "Dhamu", 50000.00);
		Employee employee3 = new Employee(52368, "Akbar", 50000.00);
		Employee employee4 = new Employee(52458, "Ramu", 50000.00);
		Employee employee5 = new Employee(54568, "Somu", 50000.00);
		Employee employee6 = new Employee(56666, "Rahimu", 50000.00);
		Employee employee7 = new Employee(57777, "Sahimu", 50000.00);
		Employee employee8 = new Employee(58888, "Kaimu", 50000.00);
		
//		employeeController.add(employee1);
//		employeeController.add(employee2);
//		employeeController.add(employee3);
//		employeeController.add(employee4);
//		employeeController.add(employee5);
//		employeeController.add(employee6);
//		employeeController.add(employee7);
//		employeeController.add(employee8);
		
		System.out.println();
		
//		Employee employee10 = new Employee();
//		employee10.setEid(3);
//		employee10.setEname("Pulendar Vemula");
//		employee10.setEsalary(80000.00);
//		employeeController.update(employee10);
//		
//		System.out.println();
//		
//		employeeController.deleteById(1);
		
		List<Employee> employees = employeeController.findAll();
		
		employees.forEach(System.out::println);
	}
	

}
