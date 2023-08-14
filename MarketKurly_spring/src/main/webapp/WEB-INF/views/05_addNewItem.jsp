<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_addNewItem.jsp</title>
</head>
<body>
05_addNewItem.jsp
<table>
		<tr>
			<td><jsp:include page="00_topMenu.jsp" /></td>
		</tr>

	</table>
<div align="center">
		<h2> 신상품 등록 </h2>
		<form action="${cp}/06_addNewItemPro" method="post">
			<table border="1">
				<tr height="40">
					<td align="center" width="150"> 상품카테고리 </td>
					<td width="450"> <input type="text" name="subject" size="60" /></td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 상품명 </td>
					<td width="450"> <input type="text" name="subject" size="60" /></td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 상품가격 </td>
					<td width="450"> <input type="text" name="subject" size="60" /></td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 상품재고 </td>
					<td width="450"> <input type="text" name="subject" size="60" /></td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 이미지 </td>
					<td width="450"> <input type="file" name="writer" size="60"></textarea> </td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 상품정보 </td>
					<td width="450"> <textarea rows="10" cols="50" name="content"></textarea> </td>
				</tr>
				<tr height="40">
					<td align="center" width="150"> 할인율 </td>
					<td width="450"> <input type="text" name="subject" size="60" /> % </td>
				</tr>
				
				<tr height="40">
					<td align="center" colspan="2">
						<input type="submit" value="상품 추가하기" /> &nbsp;&nbsp;
						<input type="reset" value="다시작성" /> &nbsp;&nbsp;
					</td>				
				</tr>
			</table>
		</form>
		
	</div>
</body>
</html>