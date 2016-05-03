<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/jsp/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload file</title>
</head>
<body>
	<form:form method="post" action="excelRead.htm" modelAttribute="upload"
		enctype="multipart/form-data">
		<h1>welcome to file upload jsp</h1>
		<input type="file" name="file"/>
		<input type="submit" value="Upload"/>

	</form:form>
</body>
</html>