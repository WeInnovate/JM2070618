<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${param.username eq param.password}">
	<c:set var="msg" value="Login Successfull!!" scope="request" />
	<c:set var="age" value="22" scope="request" />
	<jsp:forward page="profile.jsp">
		<jsp:param value="Prateek" name="trainee" />
	</jsp:forward>
</c:if>

<c:if test="${param.username ne param.password}">
	<c:set var="msg" value="Login Failed!!!" scope="request" />
	<c:redirect url="login.jsp?msg=Login%20Failed!!!" />
</c:if>
