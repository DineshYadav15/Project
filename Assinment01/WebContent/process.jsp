<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=5; %>
<p>No1 = ${param.n1} (using expression language)</p>
<p>No2 = ${param.n2} (using expression language)</p>
<p>Value of a is : <%= a %> (using expression tag)</p>
<%  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
char operation=request.getParameter("arith_operation").charAt(0);   
int n1=Integer.parseInt(num1);  
int n2=Integer.parseInt(num2);
int r=0;
switch(operation)
{
		case '+': r=n1+n2;
		out.println("Addition of numbers is: "+r);
		break;
		case '-': r=n1-n2;
		out.println("Substraction of numbers is: "+r);
		break;
		case '*': r=n1*n2;
		out.println("Multiplication of numbers is: "+r);
		break;
		case '/': r=n1/n2;
		out.println("Division of numbers is: "+r);
		break;
		default : out.println("Operation is invalid"+r);
}
%>
</body>
</html>