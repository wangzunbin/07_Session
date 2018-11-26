<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>我的购物车</h1>
	<table cellspacing="0" cellpadding="0" border="1" width="80%">
		<tr>
			<td>名称</td>
			<td>价格</td>
			<td>数量</td>
			<td>操作</td>
		</tr>
		<c:forEach items="sessionScope.SHOPPINGCART_IN_SESSION.items"
			var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.price}</td>
				<td>${item.num}</td>
				<td><a href="/shoppingCart?cmd=delete&id=${item.id}">删除</a></td>
			</tr>
		</c:forEach> 
		<c:if test="${empty SHOPPINGCART_IN_SESSION.items}">
			<tr>
				<td colspan="4">购物车空空如也, 赶快去购物.....</td>
			</tr>
		</c:if>
		<c:if test="${!empty SHOPPINGCART_IN_SESSION.items}">
			<tr>
				<td colspan="4" style="text-align: right;">商品的总价: ${sessionScope.SHOPPINGCART_IN_SESSION.totalPrice}</td>
			</tr>
		</c:if>
	</table>
	<a href="/shoppingcart/shopping.jsp">继续购物</a>
</body>
</html>