<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 목록 보기</title>
</head>
<body>

<%@ include file="_header.jsp" %>

<div class="alert alert-primary" role="alert">

<%
	String uid = (String)session.getAttribute("id");

	if (uid == null){
		
		out.print("로그인 정보가 없습니다.");
		response.sendRedirect("login.html");
		
	}




%>

</div>

<%@ include file="_footer.jsp" %>

</body>
</html>