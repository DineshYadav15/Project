package com.example.servletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Calling init method from "+this.getServletName());
	}
	
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
    	System.out.println("Calling destroy method from "+this.getServletName());
		super.destroy();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Calling doGet/service method from "+this.getServletName());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>");
		out.println("Hi, This page is generated from HelloServlet class<br>");
		
		ServletConfig config = getServletConfig();
		out.println("helloServletConfigParamKey = "+config.getInitParameter("helloServletConfigParamKey")+"<br>");
	
		ServletContext context = getServletContext();
		out.println("ContextParamKey = "+context.getInitParameter("ContextParamKey")+"<br>");
		out.println("</h1></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<html><body>");
		
		ServletContext context = getServletContext();
		context.setAttribute("name", name);
		out.println("<h2><a href=\"TestServlet\">Click to navigate TestServlet</a></h2>");
		out.println("</body></html>");
		//doGet(request, response);
	}

}
