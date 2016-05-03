<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Jsp</title>
</head>
<body>
	<form:form action="addProduct.htm" method="post" commandName="prod">
		<table border="1">
			<tr>
				<td><spring:message code="product.productName" /></td>
				<td><form:input path="productName" /></td>
				<td><form:errors path="productName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="product.productCost" /></td>
				<td><form:input path="productCost" /></td>
				<td><form:errors path="productCost" cssStyle="color:blue" /></td>
			</tr>
			<tr>
				<td><spring:message code="product.quantity" /></td>
				<td><form:input path="quantity" /></td>
				<td><form:errors path="quantity" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Store>>>" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>