package com.createiq.ems.service;

import com.createiq.ems.model.Employee;

public interface EmployeeService {

	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer eid);
}
