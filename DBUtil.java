package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	private static Connection con=null;
	public static Connection getMyConnection() 
	{
		if(con==null)
		{
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				String url="jdbc:oracle:thin:@10.232.71.29:1521:INATP02";
				con=DriverManager.getConnection(url, "shobana", "shobana");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
				
		
		
		return con;
		
	}
	

}
