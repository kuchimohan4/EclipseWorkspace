<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="content-type" content="tect/html;charset=UTF-8"/>
<title>yahoo!!!!!</title>
</head>
<body>
welcome id:${login1.id}<br/>
name:${login1.name}<br/>
subs:${login1.lst}
<table>
<tr><td>address</td></tr>
<tr><td>${login1.address.street},${login1.address.city},${login1.address.state},${login1.address.country}</td></tr>
<tr><td>${login1.dob}</td></tr>

</table>

</body> 
</html>