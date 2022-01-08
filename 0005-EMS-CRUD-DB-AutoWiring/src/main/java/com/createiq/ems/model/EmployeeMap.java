package com.createiq.ems.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMap implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Employee employee = new Employee();
		employee.setEid(resultSet.getInt("EID"));
		employee.setEname(resultSet.getString("ENAME"));
		employee.setEsalary(resultSet.getDouble("ESALARY"));
		
		return employee;
	}

}
