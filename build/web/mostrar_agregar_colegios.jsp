<%
    HttpSession sesion = request.getSession();
    String usuario;
    String Correo;

    if (sesion.getAttribute("usuario") != null) {
        usuario = sesion.getAttribute("usuario").toString();
    } else {
        if (sesion.getAttribute("Correo") != null) {
            Correo = sesion.getAttribute("Correo").toString();
        } else {
            response.sendRedirect("login.jsp");
        }
    }
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
               <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <%@ include file="/Menu_admin.jsp"%>
    <body style="background-color: #424242">


        <div class="container" >



            <div class="col-12" style="background-color: #fff; border-radius: 15px;">
                
                <div><!--prueba modal-->
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                        Launch demo modal
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Agregar Colegio</h5>
                                    
                                    <form method="POST" action="recorridos?action=agregarColegio" enctype="mulipart/form-data">
                                        
                                        <label>Nombre</label>
                                        <input name="nombre">
                                        
                                        <label>Nombre</label>
                                        <input name="apellido">
                                        
                                        <input type="text" name="fileFoto">
                                        
                                        
                                    </form>
                                    
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    ...
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary">Save changes</button>
                                </div>
                            </div>
                        </div>
                    </div>


                </div>

                <c:forEach var="dato" items="${lista}">
                    <div style="padding-top: 10px; padding-bottom: 10px; padding-left: 10px;border-radius: 15px; " class="row">
                       
                        <div class="col-2" style="border-radius: 15px; background-color: red;">
                            <img src="img?id=${dato.getId_colegio()}" width="150" height="130">
                        </div>
                        <div class="col-8" style="border-radius: 15px; background-color: blue;">
                            <h4><label style="display: block">${dato.getNombre()}</label></h4>
                            <label style="display: block">${dato.getDirecion()}</label>
                        </div>
                    </div>
                </c:forEach>
            </div>


            <br>
        </div>


    </body>
     <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/scripts.js" type="text/javascript"></script>
        
</html>
