package com.example.servletapp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CubeNumber extends TagSupport{
	private int number;
	public void setNumber(int n){
	number = n;
	}
	public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();//returns the instance of JspWriter
	try{
	out.print(number*number*number);//printing cube of a number
	}catch(Exception e){System.out.println(e);}
	return SKIP_BODY;//will not evaluate the body content of the tag }
	}
 
}


