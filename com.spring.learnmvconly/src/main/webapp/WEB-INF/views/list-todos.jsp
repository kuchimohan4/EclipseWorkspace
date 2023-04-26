
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<html>
<head>
<title>yahoo!!!!!</title>
</head>
<body>
	your are ${uname} <%-- <%=new Date() %> --%>
	<br />
	<div class="container">
		<table class="table table-striped">

			<caption>your todos are</caption>
			<thead>
				<tr>
					<th>Desc</th>
					<th>target date</th>
					<th>is completed?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<%-- id:${todo.id}  desc:${todo.desc}  user:${todo.user} <br/> --%>
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="/delete-todo?id=${todo.id}"class="btn btn-danger">delete</a></td>

					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<br />
	<div>
		<a class="btn btn-success" href="/add-todo">add</a>
	</div>
</body>
</html>