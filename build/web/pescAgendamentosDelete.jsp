<%-- 
    Document   : testeJsp
    Created on : 21/09/2017, 11:08:59
    Author     : Marcos Ferreira
--%>
<%@page import="model.CadastrarTccModel"%>
<%@page import="dao.CadastrarTccDao"%>
<%@page import="model.AgendamentoTccModel"%>
<%@page import="dao.AgendamentoTccDao"%>
<jsp:useBean id="aTccDao" class="dao.AgendamentoTccDao"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h3>Deletado Com Sucesso! </h3>
    
        <%
            
                Long id = Long.parseLong(request.getParameter("id"));
                AgendamentoTccDao agendamentoTccDao = new AgendamentoTccDao();
                AgendamentoTccModel agendamentoTccModel = new AgendamentoTccModel(id);
                agendamentoTccDao.deletar(agendamentoTccModel);
        
        %>
         <br>
         <a href="pescAgendamentos.jsp"><button type="button" class="btn btn-primary">Voltar</button></a>
         </center>
           <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
