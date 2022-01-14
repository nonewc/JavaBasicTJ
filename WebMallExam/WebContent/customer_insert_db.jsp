<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.sql.*" %>
<%@ page import = "java.time.*" %>
    
    
<%@ page import = "dbconnclose.*" %>

<% // 전송 한글 데이터 처리
	request.setCharacterEncoding("UTF-8");%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객테이블 개인 고객정보 DB 삽입</title>
</head>



<body>

<%
	// 전송 데이터 확인 및 변수 할당

	String cust_id = request.getParameter("cust_id");
	
	if (cust_id.isEmpty()) {
		out.print("<script>alert('아이디를 입력하시오!!');"
						+ "history.back();"
					+ "</script>");
	}

	// 객체 참조 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	// JDBC 드라이버 로딩
	conn = DbConnClose.getConnection();
	
	
	try {
		// 아이디 중복 확인
		String sql = "SELECT * FROM customer WHERE (cust_id = ?)";
		pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cust_id);
		rset = pstmt.executeQuery();
		
		if (rset.next()) { // 중복
			out.print("<script>alert('사용할 수 없는 아이디입니다.');"
							+"history.back();"
						+"</script>");
		} else {
			
			
			
			String cust_pw = request.getParameter("cust_pw");
	String cust_name = request.getParameter("cust_name");
	
	// 전화번호 처리
	String tel_no_gubun = request.getParameter("tel_no_gubun");
	String tel_no_guk = request.getParameter("tel_no_guk");
	String tel_no_seq = request.getParameter("tel_no_seq");
	String cust_tel_no = tel_no_gubun + "-"
						+ tel_no_guk + "-" + tel_no_seq;
	
	String cust_addr = request.getParameter("cust_addr");
	String cust_gender = request.getParameter("cust_gender"); //null
	
	// 이메일 처리
	String cust_email;
	String cust_email_1 = request.getParameter("cust_email_1"); 
	String cust_email_2 = request.getParameter("cust_email_2"); 
	
	if ((cust_email_1.length() == 0) && (cust_email_2.length() == 0)) {
		cust_email = "";				//empty
	} else {
		cust_email = cust_email_1 + "@" + cust_email_2; 
	}
			
			
			// SQL 질의어 처리
			// 고객테이블 튜플 삽입
			sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, cust_id);
				pstmt.setString(2, cust_pw);
				pstmt.setString(3, cust_name);
				pstmt.setString(4, cust_tel_no);
				pstmt.setString(5, cust_addr);
				pstmt.setString(6, cust_gender);
				pstmt.setString(7, cust_email);
				pstmt.setString(8, LocalDate.now().toString());
			pstmt.executeUpdate();
			
		}
		
	} catch (SQLException sqlerr){
		
		out.println("SQL 질의처리 오류!" + sqlerr.getMessage());
			
			
	} finally {
		// 데이터베이스 연결 종료
		DbConnClose.resourceClose(rset, pstmt, conn);
	}
	
	// 튜플 삽입 후 고객정보 관리 메뉴
	out.print("고객테이블 튜플 저장 성공!" + "<Br>");
	out.print("<script>alert('회원 가입을 환영합니다!!');"
					+ "location.href = 'customer_maintenance.jsp';"
				+"</script>");
	%>
</body>
</html>