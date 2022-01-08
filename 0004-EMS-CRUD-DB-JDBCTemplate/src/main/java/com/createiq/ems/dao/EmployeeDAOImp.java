package com.createiq.ems.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.createiq.ems.model.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	

	public EmployeeDAOImp(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void add(Employee employee) {

		jdbcTemplate.update("INSERT INTO EMPLOYEE_03 VALUES (?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsalary() });
System.out.println("Inserted");
	}

	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_03 SET ENAME = ? , ESALARY = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsalary(), employee.getEid() });
System.out.println("updated");
	}

	public void delelte(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_03 WHERE EID = ?", new Object[] {eid});
		System.out.println("deleted");
	}
}
