package com.jm2070618.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet of Login servlet is running...");
		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of Login servlet is running...");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		if (username.equals(password)) {
//			RequestDispatcher rd = request.getRequestDispatcher("profile");
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			request.setAttribute("msg", "Login Successfull!!!");
			rd.forward(request, response);
		} else {
//			out.print("Login failed");
//			response.sendRedirect("http://www.google.com?name=Atul&age=20");
			response.sendRedirect("login.html?name=Atul&age=20");
			
		}
	}

}
