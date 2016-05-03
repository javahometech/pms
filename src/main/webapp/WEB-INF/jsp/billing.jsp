<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Billing form jsp</title>
</head>
<body>
	<form:form action="billing.htm" commandName="bill" method="post">

		<table align="center" border="3">
			<tr>
				<th>Hero Honda Products Bill</th>
			</tr>
			<tr>
				<td><spring:message code="billing.customerName" /></td>
				<td><form:input path="custmerName" /></td>
				<td><form:errors path="custmerName" cssStyle="color:red"/></td>
			</tr>

			<tr>
				<td><spring:message code="billing.productName" /></td>
				<td><form:input path="productName" /></td>
				<td><form:errors path="productName" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><spring:message code="billing.price" /></td>
				<td><form:input path="price" /></td>
				<td><form:errors path="price" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><spring:message code="billing.quantity" /></td>
				<td><form:input path="quantity" /></td>
				<td><form:errors path="quantity" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"/> </td>
				<td><input type="submit" value="GenerateBill"/></td>
				</tr>																							
		</table>
	</form:form>
</body>
</html>