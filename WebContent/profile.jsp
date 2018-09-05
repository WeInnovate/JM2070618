<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile!!!</title>
</head>
<body>
	<span>Hi, ${param.username}</span>
	<br />
	<c:out value="${requestScope.msg}" />
	<br /> ${param.trainee}
	<hr />
	Before Remove:
	<c:out value="${requestScope.age}" />
	<br />

	<hr />
	<c:choose>
		<c:when test="${requestScope.age gt 0 and requestScope.age lt 18}">
			<c:out value="You are teen." />
		</c:when>
		<c:when test="${requestScope.age gt 18 and requestScope.age lt 100}">
			<c:out value="You are adult." />
		</c:when>
		<c:otherwise>
			<c:out value="You are not human." />
		</c:otherwise>
	</c:choose>

	<br />

	<c:remove var="age" />
	After Remove:
	<c:out value="${requestScope.age}" />

	<br />
	<%
		List fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pine Apple");
		fruits.add("Guava");
		request.setAttribute("fruits", fruits);
	%>
	<c:forEach var="fruit" items="${requestScope.fruits}">
		<c:out value="${fruit}" />
		<br />
	</c:forEach>
	<c:forEach var="i" begin="0" step="1" end="10">
		<c:out value="${i}" />
	</c:forEach>

	<br />
	<%-- <c:import url="https://www.google.com" /> --%>

	<c:url var="helloPrateek" value="hello.jsp">
		<c:param name="name" value="Prateek Kumar%" />
		<c:param name="age" value="20" />
	</c:url>
	<a href="<c:out value="${helloPrateek}" />">My Custome URL</a>
</body>
</html>