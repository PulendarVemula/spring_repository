package com.createiq.ems.ciqtemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CreateIqTemplate {
	
private DataSource dataSource ;

public CreateIqTemplate(DataSource dataSource) {
	super();
	this.dataSource = dataSource;
}

public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
} 

  public void executeUpdate(String query , Object[] params) {
	  
	  Connection connection = null;
	  PreparedStatement preparedStatement = null;
	  
	  try {
		connection = dataSource.getConnection();
		connection.setAutoCommit(false);
		preparedStatement = connection.prepareStatement(query);
		for (int i = 0; i < params.length; i++) {
			preparedStatement.setObject(i+1, params[i]);
		}
		preparedStatement.executeUpdate();
		connection.commit();
	} catch (SQLException e) {

		e.printStackTrace();
		try {
			connection.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
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
