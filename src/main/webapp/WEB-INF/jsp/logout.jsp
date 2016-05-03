<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>logout page</title>
</head>
<body>
<%session.invalidate(); %>
<h1>you have logout from PMS</h1>
<h3><a href="login.htm">log in</a></h3>
</body>
</html>