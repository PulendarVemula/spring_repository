package com.createiq.ems.client;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.ems.controller.EmployeeController;
import com.createiq.ems.model.Employee;

public class AddUpdateDeleteEmployee {

	
	public static void main(String[] args) {
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee1 = new Employee(56854, "Basha", 50000.00);
		Employee employee3 = new Employee(52368, "Akbar", 50000.00);
		Employee employee4 = new Employee(52458, "Ramu", 50000.00);
		Employee employee5 = new Employee(54568, "Somu", 50000.00);
		Employee employee2 = new Employee(53922, "Dhamu", 50000.00);
		
		EmployeeController employeeController = applicationContext.getBean("empController" , EmployeeController.class);
		
//		employeeController.add(employee1);
//		employeeController.add(employee2);
//		employeeController.add(employee3);
//		employeeController.add(employee4);
//		employeeController.add(employee5);
		System.out.println();
//		Employee employee6 = new Employee();
//		employee6.setEid(53922);
//		employee6.setEname("Pulendar Vemula");;
//		employee6.setEsalary(80000.00);
//		employeeController.update(employee6);
//		employeeController.deleteById(56854);
		
		List<Employee> employees = employeeController.findAll();
		
		for (Employee employee : employees) {
			System.out.println(employee.getEid()+"  "+employee.getEname()+"  "+employee.getEsalary());
		}
		
	}
}
