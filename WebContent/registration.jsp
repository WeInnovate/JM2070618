<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page!!!</title>
</head>
<body>
	<form action="process-registration.jsp" method="post">
		<input type="text" name="name" placeholder="Enter your name" /><br />
		<input type="email" name="email" placeholder="Enter your email" /><br />
		<input type="text" name="mobile"
			placeholder="Enter your mobile number" /><br /> <input
			type="number" name="age" placeholder="Enter your age" /><br />

		Gender: <br /> Male: <input type="radio" name="gender" value="Male" />
		&nbsp; Female: <input type="radio" name="gender" value="Female" /><br />

		Courses:<br /> Core Java: <input type="checkbox" name="courses"
			value="Core Java" /> &nbsp; Advance Java: <input type="checkbox"
			name="courses" value="Advance Java" /> &nbsp; Java frameworks: <input
			type="checkbox" name="courses" value="Java Frameworks" /> <br />

		Country: <br /> <select name="country">
			<option value="">--Select--</option>
			<option value="IND">India</option>
			<option value="AUS">Australia</option>
			<option value="FR">France</option>
		</select> <input type="submit" value="Register">
	</form>
</body>
</html>