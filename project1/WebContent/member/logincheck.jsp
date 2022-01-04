<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.member
	  파일명: logincheck.jsp
-->

<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");

	MemberDAO dao = new MemberDAO();
	
	int code = dao.login(uid, ups);
	
	if (code == 1) { //회원 아이디가 아예 존재하지 않는 경우
		response.sendRedirect("join.jsp");
	} else if ( code == 2 ) { // 아이디는 디비에 존재하는데 비번이 일치하지 않는 경우
		response.sendRedirect("login.jsp");
	} else {
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	}

%>    
    
    