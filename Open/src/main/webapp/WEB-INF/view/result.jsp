<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록된 내용</title>
</head>
<body>
 <form name="DeleteForm" method="post" action="delete.do">
<table border="1" summary="게시판 삭제 폼"> 
 <caption><b>게시판 삭제 폼</b></caption>
<tr height="1" bgcolor="#dddddd"></tr>
     <tr height="1" bgcolor="#82B5DF"></tr>
     <tr align="center">
 <tbody>
  <tr>
   <th align="center">비밀번호</th>
   <td><input type="password" name="password" size="20" maxlength="50"></td>
  </tr>
 </tbody>
</table>



<p>
<a href="/itemlist">삭제</a>
 <input type="button" value="취소" onclick="history.back(-1)">
</p>
</form>
</body>
</html>