<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.member
	  파일명: login.jsp
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<<body class="text-center">
  <%@ include file="/_header.jsp" %>
<div class="alert alert-dark" role="alert">
  로그인
</div>

<div class ="container" >
<main class="form-signin">
  <form action="logincheck.jsp">
    <img class="mb-4" src="https://mblogthumb-phinf.pstatic.net/MjAxODA2MDZfMjYy/MDAxNTI4MjE1ODI5MzU5.OooitXcdv2a5iWr0vtrSQZKMHN5tSKhyrlVU88z7KYsg.ZOsBLSqWUt4Fg9jCpaAtXM9sDiS84D-Ye3kmb402XF4g.PNG.jtyoung24/BTS_LOGO_O.png?type=w800" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">로그인</h1>

    <div class="form-floating">
      <input type="text" name = "id" class="form-control" id="floatingInput" placeholder="아이디를 입력하세요">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" name = "ps" class="form-control" id="floatingPassword" placeholder="암호를 입력하세요">
      <label for="floatingPassword">암호</label>
    </div>

    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; by LEE 2017–2022</p>
  </form>
  </div>
    <%@ include file="/_footer.jsp" %>
  
</body>
</html>