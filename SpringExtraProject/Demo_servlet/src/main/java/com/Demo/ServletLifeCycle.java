package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletLifeCycle extends GenericServlet{
	public void init(ServletConfig config) throws ServletException{
	   System.out.println("WE are initialising the SErvlet");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k =i+j;
		PrintWriter out = res.getWriter();
		out.println("Output is :" + k);
		
		
		destroy();
		
	}
	
}
  