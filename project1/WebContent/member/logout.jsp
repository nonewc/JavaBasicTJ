<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.member
	  파일명: logout.jsp
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	session.invalidate();
    
		response.sendRedirect("/member/login.jsp");
    
    %>
    
    