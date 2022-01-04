<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.memo
	  파일명: memocheck.jsp
-->

<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contents = request.getParameter("visit");
	String sid = (String) session.getAttribute("id");
	
	
	MemoDAO dao = new MemoDAO();
	
	if (dao.insert(sid, contents)){
		
		response.sendRedirect("/main.jsp");
		
	}
	
	
	
	
	
	
	
%>