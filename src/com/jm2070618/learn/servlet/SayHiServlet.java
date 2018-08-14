package com.jm2070618.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sayHi")
public class SayHiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SayHiServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet method of SayHiServlet is running...");
		String name = request.getParameter("abc");

		PrintWriter out = response.getWriter();
		out.print("Hello " + name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost method of SayHiServlet is running...");
		String name = request.getParameter("abc");

		PrintWriter out = response.getWriter();
		out.print("Hello " + name);
	}

}
