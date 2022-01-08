import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestConnection {

	
	public static void main(String[] args) {
		
        BasicDataSource basicDataSource = new BasicDataSource();
        
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/spring_framework");
        basicDataSource.setUsername("vemula5");
        basicDataSource.setPassword("1234");
        System.out.println("-----------------------DBCP-Connection----------------------");
        
        try {
			System.out.println(basicDataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        
        try {
			comboPooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring_framework");
			comboPooledDataSource.setUser("vemula5");
			comboPooledDataSource.setPassword("1234");
			
			try {
				System.out.println("-----------------------C3p0-Connection----------------------");
				System.out.println(comboPooledDataSource.getConnection());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
        
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_framework");
        driverManagerDataSource.setUsername("vemula5");
        driverManagerDataSource.setPassword("1234");
        
        System.out.println("-----------------------Spring-Connection----------------------");
        try {
			System.out.println(driverManagerDataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
}
