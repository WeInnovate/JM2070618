<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>
<body>
<%-- <%@ include file="header.jsp" %> --%>
<jsp:include page="header.jsp"></jsp:include>


<h1>This is JSP page!!!</h1>
<a href="learn-jsp-scripting-tags.jsp">Learn JSP Scripting Tags</a><br />
<a href="learn-jsp-scripting-tags-with-html.jsp">Learn JSP Scripting Tags with HTML</a><br />
<a href="registration.jsp">Register Me</a><br />

<h1>JSP Magic</h1>
<a href="impObj">Implicit Object</a> <br />
<a href="intentional-exception.jsp">Intentional Exception for errorPage and isErrorPage directive</a><br />
<a href="login.jsp">Login via JSP</a><br />
<a href="registration.jsp">Register via JSP</a><br />
<a href="user-registration.jsp">Register User via JSP</a><br />
<%-- <%@ include file="footer.jsp" %> --%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>