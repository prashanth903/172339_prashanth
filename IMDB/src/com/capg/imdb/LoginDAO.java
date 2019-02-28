package com.capg.imdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	public static boolean status=false;
	public static boolean validate(String Username,String password) throws ClassNotFoundException {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
			
			PreparedStatement ps=conn.prepareStatement("select * from imdb where Name=? and password=?");
			ps.setString(1,Username);
			ps.setString(2,password);
			
			ResultSet rs=ps.executeQuery();
		  status = rs.next();
			
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(Username);
		return status;
		
	}
}
