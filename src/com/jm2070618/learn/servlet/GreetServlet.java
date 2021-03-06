package com.jm2070618.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method is running...");
		String name = req.getParameter("abc");
		
		ServletConfig cfg = getServletConfig();
		String msg = cfg.getInitParameter("greetMsg");

		PrintWriter out = resp.getWriter();
		out.print("Hello " + name+ "\n"+msg);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method is running...");
		String name = req.getParameter("abc");

		PrintWriter out = resp.getWriter();
		out.print("Hello " + name);
	}

}
