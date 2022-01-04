/*
	 프로젝트명 : project1
	  패키지명 : src.dao
	  파일명: MemoDAO.java
*/

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {

	public boolean insert(String uid, String contents) throws NamingException, SQLException {

		Connection conn = null; // DB연결
		PreparedStatement stmt = null; // SQL구문

		conn = ConnectionPool.get();

		String sql = "INSERT INTO tbvisit(id,contents) VALUES(?,?)";

		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);
		stmt.setNString(2, contents);
	

		int result = stmt.executeUpdate();

// 결과를 성공했을때는 숫자 1 실패하면 숫자0

		return result == 1;
	}

	
	
	
}


