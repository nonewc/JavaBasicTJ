<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 드라이버 로딩</title>
</head>
<body>
<%

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

Connection conn = null;

try {
	conn = DriverManager.getConnection(url, id, pw);
	out.println("MariaDB 서버 연결 성공<Br>");
} catch (SQLException sqlerr) {
	out.println("MariaDB 서버 연결 실패<Br>");	
} finally {
	if (conn !=null){
		try{
			conn.close();
			out.println("MariaDB 서버 연결 종료!<Br>");
		} catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
}

%>

</body>
</html>