package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//		request.setAttribute("name",request.getParameter("name"));
//		request.setAttribute("pass",request.getParameter("password"));
		
//		System.out.println(request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/loginnew.jsp").forward(request, response);
		
		//		PrintWriter out = response.getWriter();
//		out.println("heleo");
		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo!!!!!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		System.out.println(request.getParameter("name"));
		String uname=request.getParameter("uname");
		String password= request.getParameter("password");
		passwordvalidatior pv=new passwordvalidatior();
		boolean isvalid=pv.validatepassword(uname, password);
		if (isvalid) {
			request.setAttribute("uname", uname);
			
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			
			
		}
		else {
			request.setAttribute("errormsg","invalid credentials" );
			request.getRequestDispatcher("/WEB-INF/views/loginnew.jsp").forward(request, response);
			
		}
		
		
		
	}
}