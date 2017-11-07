<%-- 
    Document   : cadProfessorDelete
    Created on : 24/10/2017, 11:49:30
    Author     : José Werbston
--%>
<%@page import="model.CadProfessorModel"%>
<%@page import="dao.CadProfessorDao"%>
<%@page import="model.AgendamentoTccModel"%>
<%@page import="dao.AgendamentoTccDao"%>
<jsp:useBean id="cProfessorDao" class="dao.CadProfessorDao"/>
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
            <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.jsp");
        }
    %>
        <center>
        <h3>Deletado Com Sucesso! </h3>
    
        <%
            
        Long id = Long.parseLong(request.getParameter("id"));
                CadProfessorDao cadProfessorDao = new CadProfessorDao();
                CadProfessorModel cadProfessorModel = new CadProfessorModel(id);
                cadProfessorDao.deletar(cadProfessorModel);
        
        %>
         <br>
         <a href="profCadastrados.jsp"><button type="button" class="btn btn-primary">Voltar</button></a>
         </center>
           <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

     
