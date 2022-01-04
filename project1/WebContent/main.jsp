
<!-- 
	 프로젝트명 : project1
	  패키지명 : WEB-INF
	  파일명: main.jsp
-->


<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>

	<%@ include file="_header.jsp"%>

	<%
		String uid = (String) session.getAttribute("id");

	if (uid == null) {
		response.sendRedirect("/member/login.jsp");
	}

	session.setAttribute("id", uid);
	%>
	<div class="container"> <!-- 입력창 구성 -->
		<form action="/memo/memocheck.jsp">
			<div class="form-floating">
				<textarea class="form-control" name="visit"
					placeholder="Leave a comment here" id="floatingTextarea2"
					style="height: 100px"></textarea>
				<label for="floatingTextarea2">방명록</label>
			</div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">등록</button>
		</form>

		<%
			// 1. JDBC 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = null; // DBMS와 Java연결객체
		Statement stmt = null; // SQL구문을 실행
		ResultSet rs = null; // SQL구문의 실행결과를 저장

		String jdbcDriver = "jdbc:mysql://localhost:3306/visitdb?serverTimezone=UTC";
		String dbUser = "root";
		String dbPass = "0000";

		String query = "select * from tbvisit ORDER BY no DESC";

		// 2. 데이터베이스 커넥션 생성
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);

		// 3. Statement 생성
		stmt = conn.createStatement();

		// 4. 쿼리 실행
		rs = stmt.executeQuery(query);

		// 5. 쿼리 실행 결과 출력
		while (rs.next()) {
		%>
		
		<p>-------------------------------</p>  <!-- 구분선 출력 -->
		<p><%=rs.getString("no")%>&nbsp;<%=rs.getString("contents")%></p>

		<%
			}
		%>

	</div>
	<%@ include file="_footer.jsp"%>

</body>
</html>