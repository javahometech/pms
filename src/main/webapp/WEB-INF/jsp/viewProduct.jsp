<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>viewProduct jsp</title>
</head>
<body>
<body bgcolor="green">
	<h1 align="center">Product details</h1>
	<core:if test="${empty productlist}">
	<h3 align="center">There is no product details</h3>
	</core:if>
	<core:if test="${!empty productlist}">
		<table border="2" cellpadding="4" height="3" align="center">
			<tr>
				<th>ProductId</th>
				<th>ProductName</th>
				<th>ProductCost</th>
				<th>Quantity</th>
			</tr>
			<core:forEach items="${productlist}" var="product">
				<tr> 

					<td>${product.productId}</td>
					<td>${product.productName}</td>
					<td>${product.productCost}</td>
					<td>${product.quantity}</td>
					<td><a href="deleteEmp.htm?id=${product.productId}">delete</a></td>
				</tr>
			</core:forEach>
		</table>
	</core:if>
</body>
</html>