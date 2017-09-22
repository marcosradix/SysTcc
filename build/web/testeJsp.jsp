<%-- 
    Document   : testeJsp
    Created on : 21/09/2017, 11:08:59
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
        <h1>Bem vindo </h1>
        Nome: <%=request.getAttribute("tcc") %><br>
        Nome: <%=request.getAttribute("tituloTcc") %><br>
        
        Nome: <%=request.getAttribute("aluno") %><br>
        Nome: <%=request.getAttribute("curso") %><br>
        
        Nome: <%=request.getAttribute("orientador") %><br>
        Nome: <%=request.getAttribute("avaliadorInterno") %><br>
        
        Nome: <%=request.getAttribute("avaliadorExterno") %><br>
        Nome: <%=request.getAttribute("areaConhecimento") %><br>
        
        Nome: <%=request.getAttribute("dataInicio") %><br>
        Nome: <%=request.getAttribute("dataFinal") %><br>
        
        Nome: <%=request.getAttribute("dataDefesa") %><br>
        Nome: <%=request.getAttribute("resultDefesa") %><br>
         <br>
         <input type="button" value="Voltar" onclick="history.back()"/>
         
         
    </body>
</html>
