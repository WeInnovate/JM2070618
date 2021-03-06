package com.jm2070618.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PythonServlet
 */
@WebServlet(urlPatterns = { "/PythonServlet", "/python" }, initParams = {
		@WebInitParam(name = "trinerName", value = "Atul Dwivedi"),
		@WebInitParam(name = "trinerMobile", value = "123456789") })
public class PythonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PythonServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("python.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");

		ServletConfig cfg = getServletConfig();
		String trnName = cfg.getInitParameter("trinerName");
		String trnMobile = cfg.getInitParameter("trinerMobile");

		ServletContext ctx = cfg.getServletContext();
		String inst = ctx.getInitParameter("institute");

		PrintWriter out = response.getWriter();
		out.print("Hello, " + name + "\nYour trainer is " + trnName + " and his mobile number is " + trnMobile + " in "
				+ inst);
	}

}
