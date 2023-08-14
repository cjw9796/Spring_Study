<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_updateItem.jsp</title>
</head>
<body>
07_updateItem.jsp
<table>
		<tr>
			<td><jsp:include page="00_topMenu.jsp" /></td>
		</tr>

	</table>
	<div align="center">
	
		<h2>상품 수정/삭제</h2>
	
		<table width="700" border="1">
		
			<tr height="40" align="right">
				<td width="50" align="center">번호</td>
				<td width="320" align="center">카테고리</td>
				<td width="100" align="center">상품명</td>
				<td width="150" align="center">가격</td>
				<td width="80" align="center">재고</td>
				<td width="80" align="center">이미지</td>
				<td width="80" align="center">상품정보</td>
				<td width="80" align="center">할인률</td>
				<td width="80" align="center">등록일</td>
				<td width="80" align="center">판매량</td>
				<td width="80" align="center"><button onclick="location.href='08_updateItemPro.jsp'">상품수정</button></td>
				<td width="80" align="center"><button onclick="location.href='09_deleteItemPro.jsp'">상품삭제</button></td>
			</tr>

			<c:set var="number" value="${number}" />
			<c:forEach var="bean" items="${list}">
				<tr height ="40">
					<td width="50" align="center">${number}</td>
					<td width="320" align="center">
						<c:if test="${bean.re_step > 1}">
							<c:forEach var ="j" begin="1" end="">
							&nbsp;
							
							</c:forEach>
						</c:if>
					<a href="InfoAction?num=${bean.num}">${bean.subject}</a>
					</td>
					<td width="100" align="center">${bean.writer}</td>
					<td width="150" align="center">${bean.reg_date}</td>
					<td width="80" align="center">${bean.readcount}</td>
					
				</tr>
				<c:set var ="number" value ="${number -1}"/>
			</c:forEach>

		</table>
	<c:if test="${ count> 0}">
	<c:set var="pageCount" value="${ count / pageSize + (count % pageSize == 0 ? 0 : 1)}"/>
	<fmt:parseNumber var="pageCount" value="${pageCount} " integerOnly="true"></fmt:parseNumber>
	<fmt:parseNumber var="result" value="${currentPage/10} " integerOnly="true"></fmt:parseNumber>
	
		
		
		<c:if test="${ currentPage % 10  ne 0 }">
			<c:set var="startPage" value="${(result) * 10 + 1 }"></c:set> 
		</c:if>
			
		<c:if test="${currentPage % 10 eq 0}">				
			 	<c:set var="startPage" value="${(result-1) * 10 + 1 }"></c:set> 
				
		</c:if> 
	
		<!-- 화면에 보여질 페이지 숫자를 표현 -->	
		<c:set var="endPage" value="${ startPage + 10 - 1 }"></c:set>
		<c:if test="${ endPage >  pageCount}">
			<c:set var="endPage" value="${ pageCount }"></c:set>
		</c:if>
		
		<!--  이전 링크를 갈지 파악 -->
		<c:if test="${startPage >10 }">
			<a href="BoardListAction?pageNum=${startPage-10 }">[이전]</a>
		</c:if>
		 
		 <!-- 페이징 처리 -->
		 <c:forEach var="i" begin="${startPage }" end="${endPage}">
			<a href="BoardListAction?pageNum=${i }">[${i}]</a>
		</c:forEach> 
		 
		<!-- 다음 -->
		<c:if test="${endPage < pageCount }">
			<a href="BoardListAction?pageNum=${startPage+10 }">[다음]</a>
		</c:if>  
		 
	</c:if>
	</div>
</body>
</html>