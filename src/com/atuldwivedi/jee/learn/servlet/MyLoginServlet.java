package com.atuldwivedi.jee.learn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		System.out.println(userName);
		
		
		if(userName.equals(password)) {
			response.getWriter().print("Hello, "+userName);
		}
		else {
			
			response.setContentType("text/HTML");
			response.getWriter().print("Login failed");
			response.getWriter().print("<a href='index.html'>Home</a>");
		}
		
		
	}
}
