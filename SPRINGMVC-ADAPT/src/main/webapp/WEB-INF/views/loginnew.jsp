<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>yahoo!!!!!</title>
</head>
<body><font color="red">
	<form:errors path="login1.*"/></font>
	<form action="/SPRINGMVC-ADAPT/login.do" method="POST">
		<p>
			<font color="red">${errormsg}</font>
		</p>
		Enter your id: <input type="text" name="id" /> Enter your password:<input
			type="password" name="pass"> name:<input type="text"
			name="name"> subjects:<select name="lst" multiple><option
				value="arts">arts</option>
			<option value="science">science</option>
			<option value="comers">comers</option></select> 
			<table>
			<tr><td>address:</td></tr>
			<tr><td>street:<input name="address.street" type="text"/></td>
			<td>city:<input name="address.city" type="text"/></td>
			<td>state:<input name="address.state" type="text"/></td>
			<td>country:<input name="address.country" type="text"/></td></tr>
			</table>
			<input name="dob" type="text"  />
			
			<input type="submit"
			value="login" />
	</form>
</body>
</html>