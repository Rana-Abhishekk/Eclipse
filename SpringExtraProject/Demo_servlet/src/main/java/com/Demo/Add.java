package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/Ad")
public class Add extends HttpServlet {
	public void init() {
		System.out.println("This ois initialisation");
	}
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j =  Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		//Cookie cookie =  new Cookie("k", k+ "");
		//res.addCookie(cookie);
		
		// sendRedirect 
		
		//res.sendRedirect("sq");   
		
	// request dispatcher method
	/*	RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		*/
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		destroy();
			
		
	}
	
}
