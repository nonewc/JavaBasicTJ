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

String driverClass = "org.mariadb.jdbc.Driver";

try {
	
	Class.forName(driverClass);
	out.println("JDBC DRiver Loading 성공!<BR>");
	
} catch (ClassNotFoundException err) {
	out.println("JDBC Driver 실패!!");
	
}

%>

</body>
</html>