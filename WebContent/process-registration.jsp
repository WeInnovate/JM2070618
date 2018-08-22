<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Registration!!!</title>
</head>
<body>

	<table border="1px">
		<tr>
			<td>Name</td>
			<td><%= request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><%= request.getParameter("mobile") %></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%= request.getParameter("email") %></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><%= request.getParameter("gender") %></td>
		</tr>
	</table>



</body>
</html>