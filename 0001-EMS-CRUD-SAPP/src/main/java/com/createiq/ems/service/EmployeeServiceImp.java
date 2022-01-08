package com.createiq.ems.service;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.model.Employee;

public class EmployeeServiceImp implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeServiceImp(EmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}
	
	



	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}





	public void add(Employee employee) {
		
		System.out.println("Employee Service add method >>> "+employee);
		employeeDAO.add(employee);
	}

}
