<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	
<%@ include file = "_header.jsp" %>
	
	<%!String greeting = "Weclome to Web Shopping Mall";
	String tagline = "Welcome to WEBMALL";%>
	
	
	<div class="alert alert-secondary" role="alert">
		<div class="container">

			<h1 class="display-3"><%=greeting%></h1>

		</div>
	</div>

	<div class="container">
		<div class="text-center">
			<h3><%=tagline%></h3>
		</div>
	</div>
	
	<footer class = "container">
	
	<p>&copy; WebMall by LEE</p>
	
	</footer>

<%@ include file = "_footer.jsp" %>

</body>
</html>