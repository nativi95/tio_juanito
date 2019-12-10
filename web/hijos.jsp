<%-- 
    Document   : hijos
    Created on : 12-05-2019, 11:17:58 AM
    Author     : juan.ruizusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession();
    String usuario;
    String Correo;

    if (sesion.getAttribute("usuario") != null) {
        
        if (sesion.getAttribute("rol").toString().equals("cliente")) {
            usuario = sesion.getAttribute("usuario").toString();
        } else {
            response.sendRedirect("admin.jsp");
        }
    } else {
        if (sesion.getAttribute("Correo") != null) {

            if (sesion.getAttribute("rol").toString().equals("cliente")) {
                Correo = sesion.getAttribute("Correo").toString();
            } else {
                response.sendRedirect("admin.jsp");
            }
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
        <h1>Hello World!</h1>
    </body>
</html>
