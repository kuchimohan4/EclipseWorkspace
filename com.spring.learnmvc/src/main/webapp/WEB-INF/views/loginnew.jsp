<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>yahoo!!!!!</title>
</head>
<%-- <%
System.out.println(request.getParameter("name"));
%> --%>
<body>
<form action="/spring-mvc/login.do" method="POST">
<p><font color="red">${errormsg}</font></p>
Enter your uname: <input type="text" name="uname"/>
Enter your password:<input type="passowrd" name="password">
<input type="submit" value="login"/>
</form>
</body>
</html>