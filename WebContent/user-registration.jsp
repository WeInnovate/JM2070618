<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration page!!!</title>
</head>
<body>
	<form action="process-user-registration.jsp" method="post">
		<input type="text" name="name" placeholder="Enter your name" /><br />
		<input type="email" name="email" placeholder="Enter your email" /><br />
		<input type="number" name="age" placeholder="Enter your age" /><br />

		Gender: <br /> Male: <input type="radio" name="gender" value="Male" />
		&nbsp; Female: <input type="radio" name="gender" value="Female" /><br />

		<input type="submit" value="Register">
	</form>
</body>
</html>