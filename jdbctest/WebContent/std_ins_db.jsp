<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.*" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 학생 정보 저장</title>
</head>
<body>
<%
// 객체 참조 변수
Connection conn = null;
PreparedStatement pstmt = null;


// 드라이버 로딩
String driverClass = "org.mariadb.jdbc.Driver";

try {
	
	Class.forName(driverClass);
	out.println("JDBC DRiver Loading 성공!<BR>");
	
} catch (ClassNotFoundException err) {
	out.println("JDBC Driver 실패!!");
	
}

// 마리아 서버 연결

String url = "jdbc:mariadb://localhost:3306/univ";
String id = "root";
String pw = "0000";



try {
	conn = DriverManager.getConnection(url,id,pw);
	out.println("MariaDB 서버 연결 성공!<br>");
	
	// SQL 질의어 처리 
	// 대학 데이터베이스 univ 생성
	
	String hakbun = request.getParameter("hakbun");
	String name = request.getParameter("name");
	String year = request.getParameter("year");
	String dept = request.getParameter("dept");
	String addr = request.getParameter("addr");
	
	
	String sql = "INSERT INTO student values(?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.setString(2, name);
		pstmt.setString(3, year);
		pstmt.setString(4, dept);
		pstmt.setString(5, addr);
			
	pstmt.executeUpdate();
	out.println("대학 데이터베이스 생성 성공!<br>");
		
}catch (SQLException sqlerr) {
	out.println("대학 데이터베이스 생성 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
}finally {
	if (pstmt != null) {
		try {
			pstmt.close();
			out.println("Statement_close!<br>");
			
		}catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
	if (conn != null) {
		try {
			conn.close();
			out.println("Maria DB 서버 연결 종료 !<br>");
			
		}catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
}


%>



</body>
</html>