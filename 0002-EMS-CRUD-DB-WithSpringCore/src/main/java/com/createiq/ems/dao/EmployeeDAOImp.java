package com.createiq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.createiq.ems.model.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	

	public EmployeeDAOImp(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}



	public void add(Employee employee) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE_01 VALUES(?,?,?)");
			preparedStatement.setInt(1, employee.getEid());
			preparedStatement.setString(2, employee.getEname());
			preparedStatement.setDouble(3, employee.getEsalary());
			preparedStatement.executeUpdate();
			System.out.println("successfully added");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void update(Employee employee) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection
					.prepareStatement("UPDATE EMPLOYEE_01 SET ENAME = ? , ESALARY = ? WHERE EID = ?");
			preparedStatement.setInt(3, employee.getEid());
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setDouble(2, employee.getEsalary());
			preparedStatement.executeUpdate();
			System.out.println("updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void delelte(Integer eid) {

		Connection connection = null;

		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE_01 WHERE EID =? ");
			preparedStatement.setInt(1, eid);
			preparedStatement.executeUpdate();
			System.out.println("deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}

	}
	
	

}
