package com.createiq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

@Controller("empController")
public class EmployeeController{
	
	private EmployeeService employeeService;
	
    @Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}
	

	public void add(Employee employee) {

		employeeService.add(employee);
	}

	public void update(Employee employee) {

		employeeService.update(employee);
	}

	public void deleteById(Integer eid) {

		employeeService.deleteById(eid);
	}

	public List<Employee> findAll(){
		
		return employeeService.findAll();
	}
}
