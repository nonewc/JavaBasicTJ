<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 학생 정보 입력</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div align = "center">
<h2> 학생 정보 입력 </h2>
</div>

<form action = "std_ins_db.jsp" method="post" class="row g-3">
  <div class="col-12">
    <label for="inputEmail4" class="form-label">학번</label>
    <input type="text" name="hakbun" class="form-control" id="inputEmail4">
  </div>
  <div class="col-12">
    <label for="inputPassword4" class="form-label">이름</label>
    <input type="text" name="name" class="form-control" id="inputPassword4">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">학년</label>
   <div>
  <input class="form-check-input" type="radio" name="year" id="inlineRadio1" value="1">
  <label class="form-check-label" for="inlineRadio1">1학년</label>
  <input class="form-check-input" type="radio" name="year" id="inlineRadio2" value="2">
  <label class="form-check-label" for="inlineRadio2">2학년</label>
  <input class="form-check-input" type="radio" name="year" id="inlineRadio3" value="3">
  <label class="form-check-label" for="inlineRadio3">3학년</label>
  <input class="form-check-input" type="radio" name="year" id="inlineRadio4" value="4">
  <label class="form-check-label" for="inlineRadio4">4학년</label>
  </div>
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">학과</label>
    <input type="text" name="dept" class="form-control" id="inputAddress2">
  </div>
  <div class="col-12">
    <label for="inputCity" class="form-label">주소</label>
    <input type="text" name="addr" class="form-control" id="inputCity">
  </div>
  
  <div align ="center">
  <div class="col-12">
    <input type="submit" class="btn btn-primary" value="전송">
  </div>
  </div>
</form>


</body>
</html>