package com.createiq.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;
import com.createiq.ems.model.EmployeeMap;

@Repository("empDAO")
public class EmployeeDAOImp implements EmployeeDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public EmployeeDAOImp(JdbcTemplate jdbcTemplate) {
          super();
          this.jdbcTemplate = jdbcTemplate;
	}
	


public EmployeeDAOImp() {
	// TODO Auto-generated constructor stub
}

	public void add(Employee employee) {

		jdbcTemplate.update("INSERT INTO EMPLOYEE_05 VALUES (?,?,?)",new Object[] {employee.getEid(),employee.getEname(),employee.getEsalary()});
	
		System.out.println("inserted");
	}

	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_05 SET ENAME = ? , ESALARY = ? WHERE EID = ?",new Object[] {employee.getEname(),employee.getEsalary(),employee.getEid()});
	
	  System.out.println("updated");
	}

	public void deleteById(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_05 WHERE EID = ?",new Object[] {eid});
		
		System.out.println("deleted");
	}



	public List<Employee> findAll() {

		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE_05", new EmployeeMap());
		return employees;
	}

}
