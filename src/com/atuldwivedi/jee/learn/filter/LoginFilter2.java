package com.atuldwivedi.jee.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter2 implements Filter {

	public LoginFilter2() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*if(request.getParameter("userName").equals("atul")) {
			System.out.println("You are blocked");
			response.getWriter().println("Filter2: You are blocked");
		}
		else {
			chain.doFilter(request, response);
		}*/
		
		
		System.out.println("Filter 2 >>");

		chain.doFilter(request, response);

		System.out.println("Filter 2 <<");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
