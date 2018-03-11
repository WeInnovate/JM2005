package com.atuldwivedi.jee.learn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atuldwivedi.jee.learn.dao.login.LoginDao;
import com.atuldwivedi.jee.learn.dao.login.LoginDaoImpl;
import com.atuldwivedi.jee.learn.jdbc.user.User;
import com.atuldwivedi.jee.learn.jdbc.user.UserDao;
import com.atuldwivedi.jee.learn.jdbc.user.UserDaoImpl;

@WebServlet({ "/RegistrationServlet", "/registration" })
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");

		User user = new User(firstName, lastName, email, mobile, age, gender);

		UserDao userDao = new UserDaoImpl();
		userDao.inserUser(user);
		
		LoginDao loginDao = new LoginDaoImpl();
		loginDao.inserLogin(email, password);
		
		response.getWriter().print(firstName + " " + lastName + " " + mobile + " " + email + " " + gender);

	}

}
