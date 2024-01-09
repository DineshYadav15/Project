package com.example.servletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet(name = "loginServlet", value = "/login-servlet")
@WebListener
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//ServletContext context=getServletContext();
		request.getRequestDispatcher("link.html").include(request, response);
		ServletContext context=getServletContext();
		HttpSession currentSession = null;
		try {
			currentSession= request.getSession();
		}catch(Exception e) {
			
		}
		if(currentSession == null || currentSession.getAttribute("name")!=null)
		{
			out.print("Sorry, please logout your previous session first and then login!");
			return;
		}
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		int totalSessions = SessionListener.getActiveSessions().size();
		/*
		 * HttpSession existingSession = null; List<HttpSession> list = null;
		 * if(totalSessions>0) { list = SessionListener.getActiveSessions().stream()
		 * .filter(s ->
		 * s.getAttribute("name")!=null&&s.getAttribute("name").toString().equals(name))
		 * .collect(Collectors.toList());
		 * 
		 * } if(list != null) { for(HttpSession ses:list) {
		 * if(ses.getAttribute("name").equals(name)) { existingSession = ses; break; } }
		 * }
		 */
		
		currentSession.setAttribute("name", name);
		out.print("Welcome, "+name);
		if (name.equals("admin"))
			{
				out.println("<br>Total no. of active sessions are "+totalSessions);
			}
		
		out.close();
	}

}
