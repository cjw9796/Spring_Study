<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2>MAIN</h2>
<a href="webapp\WEB-INF\views\member\joinForm.jsp"> 회원가입</a>
<a href="loginForm.jsp"> 로그인</a>


</body>
</html>
