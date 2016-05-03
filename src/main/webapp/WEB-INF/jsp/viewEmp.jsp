<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View employee</title>
</head>
<body>
	<h1 align="center">Employee Details</h1>

	<form>
		<c:choose>
			<c:when test="${!empty employeeList}">

				<table border="3" align="center">
					<tr>
						<th>EmpId</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Qualification</th>
						<th>Experience</th>
						<th>Mobile</th>
						<th>Address</th>
					</tr>
					<c:forEach items="${employeeList}" var="emp">
						<tr>
							<td>${emp.empid}</td>
							<td>${emp.firstName}</td>
							<td>${emp.lastName}</td>
							<td>${emp.qualification}</td>
							<td>${emp.experience}</td>
							<td>${emp.mobile}</td>
							<td>${emp.address}</td>
							<td><a href="updateEmp.htm?empId=${emp.empid}">Update</a></td>
							<td><a href="deleteEmp.htm?empId=${emp.empid}">Delete</a></td>
						</tr>
					</c:forEach>

				</table>

			</c:when>
			<c:when test="${empty employeeLst}">
				<h2>There is no records</h2>
			</c:when>
		</c:choose>
	</form>
</body>
</html>