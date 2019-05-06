<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 8</title>
  </head>
  <body>
    <% int n = Integer.parseInt(request.getParameter("numero")); %>
    <h1>Tabla de multiplicar</h1>
    <table>
      <%
        for(int i = 0; i < 11; i++) {
          out.println("<tr><td>" + n + " x " + i + "</td><td> = </td><td>" + n * i + "</td></tr>");
        }
      %>
    </table>
  </body>
</html>