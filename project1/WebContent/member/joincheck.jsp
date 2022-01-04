
<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.member
	  파일명: joincheck.jsp
-->

<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String una = request.getParameter("name");
	String uem = request.getParameter("email");
	String ups = request.getParameter("ps");
	

	 MemberDAO dao = new MemberDAO();
	
	if(dao.exist(uid)){
		response.sendRedirect("/member/join.jsp");
	}
	
	if(dao.insert(uid, ups, una, uem)) {
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	} 

%>
    
    
    