<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블(student) 스키마 생성</title>
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

String url = "jdbc:mariadb://localhost:3306/";
String id = "root";
String pw = "0000";



try {
	conn = DriverManager.getConnection(url,id,pw);
	out.println("MariaDB 서버 연결 성공!<br>");
			
}catch (SQLException sqlerr) {
	out.println("MariaDB 서버 연결 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
}

// SQL 질의어 처리
// 학생 테이블 스키마 생성

try {
	String sql = "CREATE TABLE univ.student ("
						+ "hakbun int not null,"
						+ "name		char(5),"
						+ "year		tinyint,"
						+ "dept 	varchar(10),"
						+ "addr 	varchar(50),"
						+ "primary key(hakbun))";
	pstmt = conn.prepareStatement(sql);
	pstmt.executeUpdate();
	out.println("학생 테이블(student) 생성 성공!<Br>");
		
} catch (SQLException sqlerr) {
	out.println("학생 테이블(student) 생성 실패!!<Br>");
	out.println(sqlerr.getMessage() + "<Br>");
	
} finally {
	// 데이터베이스 연결 종료
	if (pstmt != null) {
		try {
			pstmt.close();
			out.println("Statement_close!<Br>");
		} catch (SQLException sqlerr) {}
	}
	
	if (conn != null) {
		try {
			conn.close();
			out.println("MariaDB 서버 연결 종료!<Br>");
		} catch (Exception conerr) {}
	}
}






%>



</body>
</html>