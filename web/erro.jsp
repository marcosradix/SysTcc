<%-- 
    Document   : erro
    Created on : 05/11/2017, 19:12:15
    Author     : marcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
    </head>
    <body>
            <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.jsp");
        }
    %>
        <h1>erro 404 página não encontrada!</h1>
    </body>
</html>
