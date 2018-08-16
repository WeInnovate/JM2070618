package com.jm2070618.learn.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({"/LoginFilter", "/login" })
public class LoginFilter implements Filter {

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// pre-processing
		System.out.println("Login filter pre-processing");
		String userName = request.getParameter("username");
		System.out.println(request.getRemoteHost() + " " + request.getServerPort() + " " + request.getContentType());
		System.out.println("Hello, " + userName);

		if (userName == null || !userName.equalsIgnoreCase("Atul")) {
			chain.doFilter(request, response);
		}

		// post-processing
		System.out.println("Login filter post-processing");
		PrintWriter out = response.getWriter();
		out.print("Login unsuccessfull!.");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
