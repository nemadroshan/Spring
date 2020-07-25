<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Spring MVC</h1>
	<hr>
	<section>
	<h1>Alien Form</h1>
		<form action="addAliean" method="post">
			Enter Name: <input type="text" name="name"><br>
			Enter id : <input type="text" name="id"><br> 
			<input type="submit" value="add">
		</form>
	</section>
	
	<section>
	<h1>Alien Form get By Id</h1>
		<form action="getAlienById" method="get">
			Enter id : <input type="text" name="id"><br> 
			<input type="submit" value="Get">
		</form>
	</section>
	<hr>
</body>
</html>