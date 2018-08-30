<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile!!!</title>
</head>
<body>
<%= "Hello, "+request.getParameter("username") %><br />
<%= request.getAttribute("msg") %>
<%= request.getParameter("trainee") %>
</body>
</html>