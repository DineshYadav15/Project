<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet App</title>
</head>
<body>
<%pageContext.setAttribute("user", "user1"+session.getId(), PageContext.SESSION_SCOPE); %>
<h1>Hello Servlet APP</h1>
<%@ include file="link.html" %>
<!-- <h2><a href="HelloServlet">Click to navigate HelloServlet</a></h2>
<form action="HelloServlet" method="post">
Name:<input type="text" name="name"><br>
<input type="submit" value="login"> -->
</form>
</body>
</html>