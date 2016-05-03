<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
function update(){
	alert('hi');
	document.forms[0].action = "updateEmp.htm";
	alert(document.forms[0].action);
	document.forms[0].submit();
	alert("end");
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h2 align="center">New Employee Registration Form</h2>
	<form:form action="addEmployee.htm" method="post" commandName="emp">
		<table border="3" bordercolor="green" align="center">
			<tr>
				<td><spring:message code="employee.firstName" /></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="employee.lastName" /></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="employee.qualification" /></td>
				<td><form:input path="qualification" /></td>
				<td><form:errors path="qualification" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="employee.experience" /></td>
				<td><form:input path="experience" /></td>
				<td><form:errors path="experience" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="employee.mobile" /></td>
				<td><form:input path="mobile" /></td>
				<td><form:errors path="mobile" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="employee.address" /></td>
				<td><form:textarea path="address" /></td>
				<td><form:errors path="address" cssStyle="color:red" /></td>
			</tr>
			<form:hidden path="empid"/>
			<tr>
				<td><c:if test="${operation eq 'save' }">
						<input type="submit" value="Save" />
					</c:if> <c:if test="${operation eq 'update' }">
						<input type="button" value="Update" onclick="update();"/>
					</c:if></td>
					<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form:form>


</body>

</html>