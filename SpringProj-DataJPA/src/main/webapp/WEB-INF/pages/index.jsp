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
	
	<a href="getAllAliean"> Get All Alien</a>
	<section>
	<h1>Alien Form</h1>
		<form action="addAliean" method="post">
			Enter Name: <input type="text" name="name"><br>
			Enter id : <input type="text" name="id"><br>
			Enter Address  : <input type="text" name="adrs"><br> 
			<input type="submit" value="add">
		</form>
	</section>
	<hr>
	
	<section>
	<h1>Alien Form</h1>
	<h2>Get BY Id</h2>
		<form action="getById" method="get">
			Enter id : <input type="text" name="id"><br> 
			<input type="submit" value="add">
		</form>
	</section>
	<hr>
	
	<section>
	<h1>Alien Form</h1>
	<h2>Get BY name</h2>
		<form action="getByName" method="get">
			Enter name: <input type="text" name="name"><br> 
			<input type="submit" value="submit">
		</form>
	</section>
	<hr>
	
	
	<section>
	<h1>Alien Form</h1>
	<h2>Get List of Alien BY name</h2>
		<form action="getListByName" method="get">
			Enter name: <input type="text" name="name"><br> 
			<input type="submit" value="submit">
		</form>
	</section>
	<hr>
	
</body>
</html>