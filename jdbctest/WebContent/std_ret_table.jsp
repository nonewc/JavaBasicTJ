<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.*" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 학생 정보 저장</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
// 객체 참조 변수
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rset = null;


// 드라이버 로딩
String driverClass = "org.mariadb.jdbc.Driver";

try {
	
	Class.forName(driverClass);
	out.println("JDBC DRiver Loading 성공!<BR>");
	
} catch (ClassNotFoundException err) {
	out.println("JDBC Driver 실패!!");
	
}

// 마리아 서버 연결

String url = "jdbc:mariadb://localhost:3306/univ";
String id = "root";
String pw = "0000";



try {
	conn = DriverManager.getConnection(url,id,pw);
	out.println("MariaDB 서버 연결 성공!<br>");
	
	// SQL 질의어 처리 
	// 대학 데이터베이스 univ 생성
	
	
	String sql = "SELECT * FROM student ORDER BY hakbun ASC";
	pstmt = conn.prepareStatement(sql);
	rset = pstmt.executeQuery();
	
	//학생 정보 검색 출력
%>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">이름</th>
      <th scope="col">학번</th>
      <th scope="col">전공</th>
      <th scope="col">주소</th>
    </tr>
  </thead>
  <tbody>
  
  
  <%
  int count = 1;
  	while (rset.next()){ // 다음 데이터가 있는지 확인
  	
  		String hakbun = rset.getString("hakbun");
  		String name = rset.getString("name");
  		String year = rset.getString("year");
  			   year = year + "학년";
  		String dept = rset.getString("dept");
  		String addr = rset.getString("addr");
  		
  	    
  %>
    <tr>
      <th scope="row"><%=count %></th>
      <td><%=hakbun %></td>
      <td><%=name %></td>
      <td><%=year %></td>
      <td><%=dept %></td>
      <td><%=addr %></td>
    </tr>
 
<%		
count++;
}
}catch (SQLException sqlerr) {
	out.println("대학 데이터베이스 생성 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
}finally {
	if (pstmt != null) {
		try {
			pstmt.close();
			out.println("Statement_close!<br>");
			
		}catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
	if (conn != null) {
		try {
			conn.close();
			out.println("Maria DB 서버 연결 종료 !<br>");
			
		}catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
}


%>

   
  </tbody>
</table>


</body>
</html>