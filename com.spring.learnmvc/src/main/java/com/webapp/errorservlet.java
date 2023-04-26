package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/error")
public class errorservlet extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		
		PrintWriter out=responce.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>error</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<wrong page>");
		out.println("</body>");
		out.println("</html>");
		
		
//		super.doGet(request, responce);
	}

}
