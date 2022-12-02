<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>전체 리스트 화면</h1>
<table border = 1>
<tr><th>물품</th><th>개수</th>

<c:forEach var = "ad_n" items="${ad}">
<tr>
<td><input type="checkbox">
<td>${ad_n.item}</td>
<td>${ad_n.itemcount}</td>
<td>${ad_n.date }</td>
</tr>
</c:forEach>
</table>
</body>
