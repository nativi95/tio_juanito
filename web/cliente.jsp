<%-- 
    Document   : cliente
    Created on : 12-02-2019, 10:57:23 AM
    Author     : juan.ruizusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession();
    String Id_usuario;
    String Correo;

    if (sesion.getAttribute("Id_usuario") != null) {
       
        Id_usuario = sesion.getAttribute("Id_usuario").toString();
    } else {
        if (sesion.getAttribute("Correo") != null) {
            Correo = sesion.getAttribute("Correo").toString();
        } else {
            response.sendRedirect("login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="/Inicio.jsp"%>
    </body>
</html>
