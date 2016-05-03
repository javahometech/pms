<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill print</title>
</head>
<body>
	<form>
		<c:choose>
			<c:when test="${!empty Bill}">
				<table align="center">
					<tr>

						<td colspan="2" width=50% align="center"><h1>PMS BILLING</h1></td>
					<tr>
						<td align="left">BillNo : ${bill.billNo}</td>
						<td align="right"><%=new java.util.Date()%></h4></td>
					</tr>
					<tr>
						<td>Customer Name :</td>
						<td>${bill.custmerName}</td>
					</tr>
					<tr>
						<td>Product Name :</td>
						<td>${bill.productName}</td>
					</tr>
					<tr>
						<td>Price :</td>
						<td>${bill.price}</td>
					</tr>
					<tr>
						<td>Quantity :</td>
						<td>${bill.quantity}</td>
					</tr>
					<tr>
						<td>Total :</td>
						<td>${bill.price *   bill.quantity}</td>
					</tr>
					<tr>
					<td align="right"><input type="button" value="print" onclick="window.print()"> </td>
					</tr>
				</table>
			</c:when>
		</c:choose>

	</form>
</body>
</html>