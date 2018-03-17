package com.atuldwivedi.jee.learn.servlet;

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

@WebServlet(urlPatterns = { "/PhpServlet", "/php" }, initParams = {
		@WebInitParam(name = "trainerName", value = "Siaram"),
		@WebInitParam(name = "trainerMobile", value = "9876543210") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PhpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig cfg = getServletConfig();
		String trnName = cfg.getInitParameter("trainerName");
		String trnMobile = cfg.getInitParameter("trainerMobile");
		
		ServletContext ctx = cfg.getServletContext();
		String insAddr = ctx.getInitParameter("instituteAddr");
		
		PrintWriter pw = response.getWriter();
		pw.print(trnName+" "+trnMobile+" "+insAddr);
		
		
	}

}
