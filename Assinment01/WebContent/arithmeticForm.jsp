<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="process.jsp">  
	  No1:<input type="text" name="n1" /><br/><br/>  
	  No2:<input type="text" name="n2" /><br/><br/>
	  <p>Please select arithmetic operation that you want to perform:</p>
	  <input type="radio" id="add" name="arith_operation" value="+">
	  <label for="add">Add</label><br>
	  <input type="radio" id="substract" name="arith_operation" value="-">
	  <label for="substract">Substract</label><br>
	  <input type="radio" id="multiply" name="arith_operation" value="*">
	  <label for="multiply">Multiply</label><br>
	  <input type="radio" id="devide" name="arith_operation" value="/">
	  <label for="devide">Devide</label>   
	  <input type="submit" value="Process"/>  
</form>
</body>
</html>