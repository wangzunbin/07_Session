<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>登陆页面</h2>
	<h2 style="color: red;">${errorMsg}</h2>
	<form action="/login">
		用户名: <input type="text" name="username">
		密码: <input type="password" name="password">
		<input type="submit" value="登陆">
	</form>
</body>
</html>