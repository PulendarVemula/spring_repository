package com.createiq.ems.dao;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {
	
	public void add(Employee  employee);
	public void update(Employee employee);
	public void delelte(Integer eid);

}
