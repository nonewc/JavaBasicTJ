package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {

	public boolean insert(String sid, String ume)
		throws NamingException, SQLException {
		
		Connection conn = null;         // DB연결
		PreparedStatement stmt = null;  // SQL구문
		
		
		conn = ConnectionPool.get();
		
		String sql = "INSERT id FROM user WHERE id = ?";
		stmt = conn.prepareStatement(sql);
			stmt.setNString(1, ume);
			
		int result = stmt.executeUpdate();
			
		return result == 1;
	}
	
	

}
