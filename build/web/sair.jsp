<%-- 
    Document   : sair
    Created on : 05/11/2017, 21:37:54
    Author     : marcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.jsp");
        }
    %>
    <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") != null){
            session.invalidate();
            response.sendRedirect("index.jsp");
        }
    %>
    </body>
</html>
