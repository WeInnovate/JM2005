package com.atuldwivedi.jee.learn;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

   
    public MyContextListener() {
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("ServletContext is destroyed.");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("ServletContext is initialized!");
    	ServletContext ctx = sce.getServletContext();
    	System.out.println(ctx.getInitParameter("instituteAddr"));
    }
	
}
