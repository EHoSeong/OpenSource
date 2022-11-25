<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form id="opensource" action = "/bookinfo.do" method="post">
        <table border="1">
            <tr>
                <td>학번</td>
                <td><input type = "text" name="stdnum" id="stdnum"></td>
            </tr>

            <tr>
                <td>이름</td>
                <td><input type = "text" name="name" id="name"></td>
            </tr>

            <tr>
                <td>전화번호</td>
                <td><input type = "text" name="phonenum" id="phonenum"></td>
            </tr>
        </table>

        <input type = submit value="예약" id="openenye">
    </form>
</body>
</html>
