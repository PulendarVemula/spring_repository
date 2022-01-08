import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConnectionWithSpring {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("connection.cfg.xml");
		
	   DataSource basicDataSource = (BasicDataSource) applicationContext.getBean("dbcp");
		
		try {
			System.out.println(basicDataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DataSource dataSource = (DataSource) applicationContext.getBean("c3p0");
		
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DataSource dataSource2 = (DataSource) applicationContext.getBean("spring_db");
		
		try {
			System.out.println(dataSource2.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
