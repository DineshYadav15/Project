<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="WEB-INF/mytags.tld" prefix="m"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty param.n1}">
	<form action="" method="post">  
		Please enter a number:<input type="text" name="n1" /><br/><br/>   
		<input type="submit" value="Process"/>  
	</form>
</c:if>
<c:if test="${not empty param.n1}">
	Cube of number is: <m:cube number="${param.n1}"></m:cube>
</c:if>
</body>
</html>