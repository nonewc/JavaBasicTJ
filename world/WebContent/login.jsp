<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%  %> <!-- 스크립틀릿 scriptlet, 일반 자바 코드 삽입 -->
   <%@ %> <!-- 지시어 directive -->
   <%= %> <!-- 표현식 expression -->
   <%! %> <!-- 선언문 declaration -->
   <%-- --%> <!-- 주석 --> 
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>User ID : <%= request.getParameter("id") %></h3>
<h3>User PS : <%= request.getParameter("ps") %></h3>


</body>
</html>