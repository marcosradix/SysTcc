<%-- 
    Document   : teste
    Created on : 27/09/2017, 11:19:06
    Author     : Marcos Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
                      
                  <label>Nome: </label>
                <input type="text" value="<%=request.getAttribute("nome") %>"/>
                
                 <label>Data: </label>
                <input type="text" value="<%=request.getAttribute("dataNascimento") %>"/>
               
    </body>
</html>
