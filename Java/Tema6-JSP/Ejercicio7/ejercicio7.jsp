<%--7. Combina las dos aplicaciones anteriores en una sola de tal forma que en la
página principal se pueda elegir pasar de euros a pesetas o de pesetas a euros.
Adorna la página con alguna foto o dibujo.--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="ejercicio7.css">
<title>Ejercicio 7</title>
</head>
<body>
	<h1>Conversor de moneda</h1>
    <form class="dinero" method="post" action="moneda.jsp">
      Introducir Cantidad</br><input type="number" min="0" step="0.01" name="cantidad"></br></br>
      <input type="radio" name="cambio" value="eurosEnPesetas" checked="checked"> Euros > Pesetas</br></br>
      <input type="radio" name="cambio" value="pesetasEnEuros"> Pesetas > Euros</br></br>
      <input type="submit" value="Convertir">
    </form>
</body>
</html>