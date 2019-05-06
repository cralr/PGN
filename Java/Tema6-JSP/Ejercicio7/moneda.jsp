<%@page import="java.text.DecimalFormat"%>
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
	<div class="dinero">
      <h2>
        <%
          Double c = Double.parseDouble(request.getParameter("cantidad"));
          DecimalFormat formatoEuros = new DecimalFormat("0.00");
          if (request.getParameter("cambio").equals("eurosEnPesetas")) {
            out.print(formatoEuros.format(c) + " euros son " + Math.round(c * 166.386) + " pesetas.");
          } else {
            out.print(Math.round(c) + " pesetas son " + formatoEuros.format(c / 166.386) + " euros.");
          }
        %>
      </h2>
    </div>
</body>
</html>