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
	<h1>Addition Form</h1>
		<form action="add">
			Enter 1st Number : <input type="text" name="num1"><br>
			Enter 2nd Number : <input type="text" name="num2"><br> <input
				type="submit" value="add">
		</form>
	</section>
	<hr>
	
	
	<section>
	<h1>Subtraction Form</h1>
		<form action="sub">
			Enter 1st Number : <input type="text" name="num1"><br>
			Enter 2nd Number : <input type="text" name="num2"><br> <input
				type="submit" value="Subtract">
		</form>
	</section>
	<hr>
	<section>
	<h1>Multiplication Form</h1>
		<form action="mul">
			Enter 1st Number : <input type="text" name="num1"><br>
			Enter 2nd Number : <input type="text" name="num2"><br> <input
				type="submit" value="Multiply">
		</form>
	</section>
	<hr>
	
	<section>
	<h1>Division Form</h1>
		<form action="div">
			Enter 1st Number : <input type="text" name="num1"><br>
			Enter 2nd Number : <input type="text" name="num2"><br> <input
				type="submit" value="Multiply">
		</form>
	</section>
	<hr>
</body>
</html>