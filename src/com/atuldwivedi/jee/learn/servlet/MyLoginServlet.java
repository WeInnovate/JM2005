package com.atuldwivedi.jee.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class MyLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		System.out.println(userName);

		try (Connection con = DbUtil.getConn();) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2005_LOGIN WHERE USER_NAME = '" + userName + "'");

			boolean isValidUser = false;
			while (rs.next()) {
				String pass = rs.getString(2);
				if (pass.equals(password)) {
					isValidUser = true;
				}
			}
			
			
			if (isValidUser) {
				PrintWriter out = response.getWriter();
				out.print("Hello, " + userName);
			} else {

				response.setContentType("text/HTML");
				response.getWriter().print("Login failed");
				response.getWriter().print("<a href='index.html'>Home</a>");
			}


		} catch (Exception e) {
			e.printStackTrace();

			if (userName.equals(password)) {
				PrintWriter out = response.getWriter();
				out.print("Hello, " + userName);
			} else {

				response.setContentType("text/HTML");
				response.getWriter().print("Login failed");
				response.getWriter().print("<a href='index.html'>Home</a>");
			}
		}

	}
}
