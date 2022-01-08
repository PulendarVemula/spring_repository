package com.createiq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

@Controller("empController")
public class EmployeeController{
	
	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
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

	public List<Employee> findAll() {

		return employeeService.findAll();
	}
	
	
}
