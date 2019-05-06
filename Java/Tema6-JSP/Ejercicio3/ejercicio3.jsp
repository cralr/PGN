<%--Escribe una aplicación que pida tu nombre. A continuación mostrará Hola
seguido del nombre introducido. El nombre se deberá recoger mediante un
formulario.--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 3</title>
</head>
<body>
	<h1>Ejercicio 3</h1>
	<form method="post" action="nombre.jsp">
	Introduzca su nombre:
	<input type="text" name="cadenaIntro">
	<input type="submit" value="OK">
	</form>
</body>
</html>