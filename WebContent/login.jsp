<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
</head>
<body>
<%= request.getParameter("msg") != null ? request.getParameter("msg") : "" %>
<form action="process-login.jsp" method="post">
		<input type="text" name="username" placeholder="Enter your username" /><br />
		<input type="password" name="password" placeholder="Enter your password" /><br />
		<input type="submit" value="Login">
	</form>
</body>
</html>