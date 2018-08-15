package com.jm2070618.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegistrationServlet", "/register", "/registration-form" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Serving from doGet method");

		RequestDispatcher rd1 = request.getRequestDispatcher("header.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("registration.html");
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.html");

		rd1.include(request, response);
		rd2.include(request, response);
		rd3.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String country = request.getParameter("country");

		PrintWriter out = response.getWriter();
		response.setContentType("text/HTML");
		out.println("<h1>Hello, " + name + "</h1>");
		out.println("<table border='1px' align=\"center\">\r\n" + "<tr>\r\n" + "<td>Email</td>\r\n" + "<td>" + email
				+ "</td>\r\n" + "</tr>\r\n" + "<tr>\r\n" + "<td>Age</td>\r\n" + "<td>" + age + "</td>\r\n" + "</tr>\r\n"
				+ "<tr>\r\n" + "<td>Gender</td>\r\n" + "<td>" + gender + "</td>\r\n" + "</tr>\r\n" + "<tr>\r\n"
				+ "<td>Courses</td>\r\n" + "<td>" + courses[0] + "</td>\r\n" + "</tr>\r\n" + "<tr>\r\n"
				+ "<td>Country</td>\r\n" + "<td>" + country + "</td>\r\n" + "</tr>\r\n" + "</table>");
	}

}
