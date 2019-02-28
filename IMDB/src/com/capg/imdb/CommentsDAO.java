package com.capg.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommentsDAO {

	public void  insertComments(Comments comm) throws SQLException
	{
		String query="insert into CommentStar values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, comm.getComments());
	     pStatement.executeUpdate();
		
	}	
	
}
