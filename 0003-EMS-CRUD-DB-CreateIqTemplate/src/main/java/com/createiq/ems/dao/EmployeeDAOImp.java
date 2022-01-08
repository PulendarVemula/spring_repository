package com.createiq.ems.dao;

import com.createiq.ems.ciqtemplate.CreateIqTemplate;
import com.createiq.ems.model.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	private CreateIqTemplate createIqTemplate;

	public void setCreateIqTemplate(CreateIqTemplate createIqTemplate) {
		this.createIqTemplate = createIqTemplate;
	}

	public EmployeeDAOImp(CreateIqTemplate createIqTemplate) {
		super();
		this.createIqTemplate = createIqTemplate;
	}

	public void add(Employee employee) {

		createIqTemplate.executeUpdate("INSERT INTO EMPLOYEE_02 VALUES (?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsalary() });
System.out.println("Inserted");
	}

	public void update(Employee employee) {

		createIqTemplate.executeUpdate("UPDATE EMPLOYEE_02 SET ENAME = ? , ESALARY = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsalary(), employee.getEid() });
System.out.println("updated");
	}

	public void delelte(Integer eid) {

		createIqTemplate.executeUpdate("DELETE FROM EMPLOYEE_02 WHERE EID = ?", new Object[] {eid});
		System.out.println("deleted");
	}
}
