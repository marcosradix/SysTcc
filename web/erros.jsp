<%-- 
    Document   : erros
    Created on : 03/11/2017, 12:07:22
    Author     : marcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erros</title>
    </head>
    <body>
            <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.jsp");
        }
    %>
        <h1>Um erro inesperado ocorreu!</h1>
    </body>
</html>
