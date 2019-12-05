<%-- 
    Document   : distritos
    Created on : 12-04-2019, 02:35:40 PM
    Author     : juan.ruizusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
     
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <link href="/css/bootstrap.min.css" rel="stylesheet">
        <link href="/css/style_1.css" rel="stylesheet">
    </head>
    <%@ include file="/Menu_offline.jsp"%>
    <body style="background-color: #424242">


        <div class="container" >

            <div class="col-12" style="background-color: #fff; border-radius: 15px;">
                <c:forEach var="dato" items="${lista}">
                    <div style="padding-top: 10px; padding-bottom: 10px; padding-left: 10px;border-radius: 15px; " class="row">
                        <div style="border-radius: 15px;"><h3>${dato.getNombre()}</h3></div>
                        <div class="col-3" style="border-radius: 15px;">
                           <img src="img?id=${dato.getId_colegio()}" width="150" height="130">
                        </div>
                        <div class="col-9" style="border-radius: 15px;">
                            <h4><label style="display: block">${dato.getNombre()}</label></h4>
                            <label style="display: block">${dato.getDirecion()}</label>
                        </div>
                    </div>
                </c:forEach>
            </div>


            <br>
        </div>


    </body>
</html>
