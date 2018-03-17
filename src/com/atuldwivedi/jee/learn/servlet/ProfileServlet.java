package com.atuldwivedi.jee.learn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public ProfileServlet() {
        super();
    }

/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		response.getWriter().append("Served at: in doGet").append(request.getContextPath());
	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().print(request.getParameter("userName"));
		
		RequestDispatcher rd1 = request.getRequestDispatcher("header.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("profile.html");
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.html");
		
		
		rd1.include(request, response);
		rd2.include(request, response);
		rd3.include(request, response);
		
		
		
		
		
		
		
		
		
	}

}
