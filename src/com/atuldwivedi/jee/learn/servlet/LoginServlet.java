package com.atuldwivedi.jee.learn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("I'm inside the servlet.");
		String un = request.getParameter("userName");
		String pass = request.getParameter("password");
		
		
		if(un.equals(pass)) {
			request.setAttribute("userType", "Admin");
			RequestDispatcher rd = request.getRequestDispatcher("/profile");
			rd.forward(request, response);
		}
		else {
//			response.getWriter().print("Login failed!");
//			response.sendRedirect("login.html");
			response.sendRedirect("http://www.google.co.in");
		}
		
		
		
		
		
	}

}
