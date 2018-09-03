<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile!!!</title>
</head>
<body>
<span>Hi, ${param.username}</span><br />
${requestScope.msg}<br />
${param.trainee}
</body>
</html>