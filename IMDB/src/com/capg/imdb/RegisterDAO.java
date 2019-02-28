package com.capg.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

	public boolean insert(String Name,String Email,String password,int Phone_NO) throws SQLException
	{
		System.out.println(Name+" "+Email+" "+password+" "+Phone_NO);
		String query="insert into imdb values(?,?,?,?)";
		Connection conn=ConnectionFactory.getConnection();
		//System.out.println(conn);
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1,Name);
		ps.setString(2, Email);
		ps.setString(3, password);
		ps.setInt(4, Phone_NO);
		ps.executeUpdate();
		return true;
		
	}
	
//	public static void main(String[] args) throws SQLException {
//		System.out.println(new RegisterDAO().insert("abc", "abc@gmail.com", "123", 6536));
//	}
//	
	
}
