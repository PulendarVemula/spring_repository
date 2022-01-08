package com.createiq.ems.controller;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

public class EmployeeController implements EmployeeDAO{

	private EmployeeService employeeService;
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void add(Employee employee) {

		System.out.println("Employee Controller add method >>> "+employee);
		employeeService.add(employee);
	}
	

	
}
