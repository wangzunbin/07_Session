<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>商品列表</h2>
	<form action="/productlist">
		商品: <select name="name">
			<option value="电脑">电脑</option>
			<option value="手机">手机</option>
			<option value="PAD">PAD</option>
		</select><br> 数量: <input name="num"><br>
		<input type="submit" value="任性买">
	</form>
</body>
</html>