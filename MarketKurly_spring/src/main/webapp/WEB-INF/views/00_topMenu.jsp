<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>00_topMenu.jsp</title>
</head>
<body>
00_topMenu.jsp
<%
		// 세션 영역에서 데이터를 가지고 온다. 
		String id = (String)session.getAttribute("id");
		
		// 세션 영역에 데이터가 null -> GUEST 저장한다.
		if(id == null){
			id = "GUEST";
		}
		
	%>
	
	<table>
		<tr height="70">
			<td align="center"  colspan="4">
				<a href="01_carMain.jsp" style="text-decoration: none">
				<img alt="" src="_09_imgCar/rent_logo.jpg" height="120">
				<img alt="" src="resources/img/logo.png" height="120" align="center">
				
				</a>
			</td>
			<td align="center" width="200">
				<!--  로그인 할 때 채워야되는 부분 -->
				<%=id %>님 
				<%
					if(id.equals("GUEST")){
				%>
				<button onclick="location.href='02_managerLogin'">로그인</button>
				<%
					}else{
				%>
				<button onclick="location.href='04_managerLogout'">로그아웃</button>
				<%
					}
				%>
				
			</td>
		</tr>
		<tr height="50">
			<td align="center" width="200" bgcolor="white">
				<font color="black" size="5">
				<a href="${cp}/01_managerMain" style="text-decoration: none">관리자 메인</a></font>
			</td>
			<td align="center" width="200" bgcolor="white">
				<font color="black" size="5">
				<a href="${cp}/05_addNewItem" style="text-decoration: none">신상품등록</a></font>
			</td>
			<td align="center" width="200" bgcolor="white">
				<font color="black" size="5">
				<a href="${cp}/07_updateItem" style="text-decoration: none">상품수정/삭제</a></font>
			</td>
			<td align="center" width="200" bgcolor="white">
				<font color="black" size="5">
				<a href="${cp}/10_checkOrderList" style="text-decoration: none">주문현황</a></font>
			</td>
			<td align="center" width="200" bgcolor="white">
				<font color="black" size="5">
				<a href="${cp}/11_itemListForManager" style="text-decoration: none">Q&A</a></font>
			</td>
		</tr>
	</table>
</body>
</html>