<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects</title>
</head>
<body>
ServletConfig(config): <%= config.getInitParameter("allImpObj") %> <br />
ServletContext(application): <%= application.getInitParameter("institute") %> <br />
</body>
</html>