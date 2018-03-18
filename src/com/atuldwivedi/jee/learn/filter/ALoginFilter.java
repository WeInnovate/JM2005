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
public class ALoginFilter implements Filter {

	public ALoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter A >>");

		chain.doFilter(request, response);

		System.out.println("Filter A <<");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
