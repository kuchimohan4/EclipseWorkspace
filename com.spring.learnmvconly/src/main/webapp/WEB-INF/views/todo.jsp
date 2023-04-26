<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<html>
<head>
<title>yahoo!!!!!</title>
</head>
<body>
	<div class="container">
		<form action="/add-todo" method="post" >
			<fieldset class="form-group">
				<label >todo</label >
				 <input name="desc" type="text" 
					class="form-control" required="required" />
			</fieldset>
			<input class="btn btn-success" type="submit" name="add" />

		</form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>