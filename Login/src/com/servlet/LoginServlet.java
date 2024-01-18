package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Service ......");
		String un = req.getParameter("username");
		String pw = req.getParameter("password");
		
		if(un.equals(pw)) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
		
		PrintWriter out = res.getWriter();
		out.print("UserName: "+un+ "<br/>");
		out.print("Password: "+pw);
		
		
	}

}
