<!-- 
	 프로젝트명 : project1
	  패키지명 : WebContent.member
	  파일명: join.jsp
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <%@ include file="/_header.jsp" %>
<div class="alert alert-dark" role="alert">
  회원 가입
</div>

<div class ="container">
<form action = "joincheck.jsp">
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">아이디</label>
    <div class="col-sm-10">
      <input type="text" name="id" class="form-control" id="inputEmail3">
    </div>
  </div>
    <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">이름</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputEmail3">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">이메일</label>
    <div class="col-sm-10">
      <input type="email" name="email" class="form-control" id="inputEmail3">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">비밀번호</label>
    <div class="col-sm-10">
      <input type="password" name="ps" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  
  <button type="submit" class="btn btn-primary">회원 가입</button>
</form>
</div>

  
  <%@ include file="/_footer.jsp" %>
  
</body>
</html>