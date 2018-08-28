
<%
	if (request.getParameter("username").equalsIgnoreCase(request.getParameter("password"))) {
		request.setAttribute("msg", "Login Successfull!!!");
%>
<jsp:forward page="profile.jsp" />
<%
	} else {
		request.setAttribute("msg", "Login Failed!!!");
		response.sendRedirect("login.jsp?msg=Login%20Failed!!!");
	}
%>