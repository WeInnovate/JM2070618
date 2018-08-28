<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="default-error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Intentionally throwing the exception.</title>
</head>
<body>
	<%
		out.print(10 / 0);
	%>
</body>
</html>