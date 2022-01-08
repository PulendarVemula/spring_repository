package com.createiq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO  employeeDAO;

	@Override
	public void add(Employee employee) {

		employeeDAO.add(employee);
	}

	@Override
	public void update(Employee employee) {

		employeeDAO.update(employee);
	}

	@Override
	public void deleteById(Integer eid) {

		employeeDAO.deleteById(eid);
	}

	@Override
	public List<Employee> findAll() {

		return null;
	}

}
