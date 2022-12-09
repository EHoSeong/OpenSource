<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
<style>
        body{
            width:1100px;
            margin-left:500px;
            padding-top:20px;
        }
        .header{
            border-bottom:1px solid gainsboro;
            opacity: 0.8;
        }
        .hallym{
            width:100px;
            height:100px;
            padding-right:50px;
        }
        .head{
            line-height: 150px;
            display : flex;
            justify-content: center;
            align-items: center;
            font-size: 50px;
        }
        .head>a{
            text-decoration:none;
            color:darkturquoise;
        }
        .check{
            width:50%;
            height:500px;
            margin-top: 100px;
            margin-left:25%;
        }
        table{
            font-size:30px;
            width:100%;
            height: 80%;
            text-align: center;
            margin-bottom: 20px;
        }
        input[type="button"]{
            margin: auto;
            display: block;
            width:150px;
            height:45px;
            font-size: 25px;
            background-color:beige;
        }
</style>
</head>
<body>
<div class="header">
        <div class = "menu">
            <div class = "mainhead">
                <div class = "head"><img class = "hallym" src="data:image/png;base64,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">
                <a href = "/home">물품 대여</a></div>
            </div>
        </div>
    </div>

    <div class = "check">
        <table border="1">
        
            <tr>
                <td>학번</td>
                <td>${std.stdnum }</td>
            </tr>
    
            <tr>
                <td>이름</td>
                <td>${std.name}</td>
            </tr>
    
            <tr>
                <td>빌린물품</td>
                <td>${std.itemname}</td>
            </tr>
    
            <tr>
                <td>빌린날짜</td>
                <td>${std.date }</td>
            </tr>
    
        </table>
    
         <input type="button" value="돌아가기" onclick="history.back(-1)">
    </div>
</body>
</html>