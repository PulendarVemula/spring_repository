package com.createiq.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	@Override
	public void add(Employee employee) {
  
		hibernateTemplate.save(employee);
		
		System.out.println("employee added");
	
	}

	@Override
	public void update(Employee employee) {

		hibernateTemplate.update(employee);
		
		System.out.println("employee updated");
	}

	@Override
	public void deleteById(Integer eid) {
		
		Employee entity = new Employee();
		entity.setEid(eid);

		hibernateTemplate.delete(entity);
		
		System.out.println("employee deleted with id : "+eid);
	}

	@Override
	public List<Employee> findAll() {

		
		return null;
	}

}
