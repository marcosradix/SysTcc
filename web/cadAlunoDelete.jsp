<%-- 
    Document   : cadAlunoDelete
    Created on : 24/10/2017, 11:49:30
    Author     : Usuário
--%>
<%@page import="model.CadAlunoModel"%>
<%@page import="dao.CadAlunoDao"%>
<%@page import="model.AgendamentoTccModel"%>
<%@page import="dao.AgendamentoTccDao"%>
<jsp:useBean id="cAlunoDao" class="dao.CadAlunoDao"/>
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
                CadAlunoDao cadAlunoDao = new CadAlunoDao();
                CadAlunoModel cadAlunoModel = new CadAlunoModel(id);
                cadAlunoDao.deletar(cadAlunoModel);
        
        %>
         <br>
         <a href="alunCadastrados.jsp"><button type="button" class="btn btn-primary">Voltar</button></a>
         </center>
           <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

     
