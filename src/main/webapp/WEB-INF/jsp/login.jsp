<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
</head>
<body>
	<h1 align="center">Welcome to Product Management System Website</h1>
	<form:form action="login.htm" method="post" commandName="login">
	

		<table border="2" align="center">
			<tr>
				<td><spring:message code="userName" /></td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="password" /></td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssStyle="color:red" /></td>
			</tr>

			<tr>
			<td><input type="submit" value="LogIn"/></td>
			<td><input type="reset" value="reset"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>