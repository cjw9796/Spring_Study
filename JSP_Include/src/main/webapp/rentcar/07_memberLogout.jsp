<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그 아웃</title>
</head>
<body>
<%
	session.invalidate();
	response.sendRedirect("01_main.jsp"); //페이지이동 
	
%>
</body>
</html>