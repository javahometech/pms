<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search customer</title>
</head>
<body>
	<h1 align="center">Customer details</h1>
	<form:form action="searchcustomer.htm" commandName="customer"  method="post">
	Customer Name:<input type="text" name="custName"/>
		<input type="submit" value="Search" />
	<c:choose>
	<c:when test="${!empty customersList}">
	<table border="3">
			<tr>
				<th>Customer Name</th>
				<th>Mobile NO</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${customersList}" var="customer">
				<tr>
					<td>${customer.custName}</td>
					<td>${customer.phoneNo}</td>
					<td>${customer.address}</td>
				</tr>

			</c:forEach>
		</table>
		
	</c:when>
	<c:when test="${empty customersList}">
	</c:when>
<c:otherwise>
No results
</c:otherwise>	
	</c:choose>
		

</form:form>
</body>
</html>