<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	// POST 방식에서의 한글 처리
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
%>



<h3>User ID : <%=uid %></h3>
<h5>User PS : <%=ups %></h5>
<h6>현재 시간은 <%=(new Date()).toString() %></h6>

</body>
</html>