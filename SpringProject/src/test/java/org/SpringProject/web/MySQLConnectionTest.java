package org.SpringProject.web;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;
public class MySQLConnectionTest {
	private static final String DRIVER =
			//MySQL DRIVER 5
			//"com.mysql.jdbc.Driver"
			//MySQL Driver 6
			"com.mysql.cj.jdbc.Driver";
	
	private static final String URL = 
			//MySQL 5.6
			//"jdbc:mysql://127.0.0.1:3306/book_ex";
			//MySQL 5.7
			"jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=UTC";
	
	private static final String USER = "root";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
				System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
