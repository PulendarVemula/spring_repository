package com.createiq.ems.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;
import com.createiq.ems.model.EmployeeMap;

@Repository("empDAO")
public class EmployeeDAOImp implements EmployeeDAO{
	
@Autowired	
private JdbcTemplate  jdbcTemplate;

public EmployeeDAOImp() {

}

	@Override
	public void add(Employee employee) {

		jdbcTemplate.update("INSERT INTO EMPLOYEE_06 VALUES (?,?,?)" , new Object[] {employee.getEid() , employee.getEname() , employee.getEsalary()});
		
	System.out.println("employee added");	
	}

	@Override
	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_06 SET ENAME = ? , ESALARY = ? WHERE EID = ?" , new Object[] {employee.getEname() , employee.getEsalary() , employee.getEid()});
		
		System.out.println("Employee updated");
	}

	@Override
	public void deleteById(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_06 WHERE EID = ?" , new Object[] {eid});
		
		System.out.println("employee deleted");
	}

	@Override
	public List<Employee> findAll() {
      
		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE_06", new EmployeeMap());
		
		return employees;
	}

}
