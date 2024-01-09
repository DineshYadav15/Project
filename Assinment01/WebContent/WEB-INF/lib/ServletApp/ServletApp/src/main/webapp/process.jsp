<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.println("division of numbers is: "+c);
out.println("<br>Total number of requests for division till time are " + request.getAttribute("visitors")); 
%>
  
<p>Accessing No1 using Expression Language ${param.n1} </p>
<p>Accessing No2 using Expression Language ${param.n2} </p>
</body>
</html>