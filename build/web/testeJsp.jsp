<%-- 
    Document   : testeJsp
    Created on : 21/09/2017, 11:08:59
    Author     : Marcos Ferreira
--%>
<%@page import="model.AgendamentoTccModel"%>
<%@page import="dao.AgendamentoTccDao"%>
<jsp:useBean id="aTccDao" class="dao.AgendamentoTccDao"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo </h1>
        <%
            
        Long codigo = Long.parseLong(request.getParameter("codigo"));
        AgendamentoTccModel retorno = aTccDao.buscar(codigo);
        
        %>
         <br>
         
         <form>
             
             <table style="padding:8px; margin: 10px; height: 50%;">
                 <tr>
                     <td><label>Id: </label></td>
                     <td><input type="text" value="<%= retorno.getId()%>"/></td>
                 </tr>
                 <tr>
                     <td><label>Aluno: </label></td>
                     <td><input type="text" value="<%= retorno.getAluno()%>" /></td>
                 </tr>
                 <tr>
                     <td><label>Orientador: </label></td>
                     <td><input type="text" value="<%= retorno.getOrientador()%>" /></td>
                 </tr>
                 <tr>
                     <td> <label>Curso: </label></td>
                     <td><input type="text" value="<%= retorno.getCurso()%>"/></td>
                 </tr>
                 <tr>
                     <td><label>Data da defesa: </label></td>
                     <td><input type="text" value="<%= retorno.getDataDefesa()%>"/></td>
                 </tr>
                 <tr>
                     <td></td>
                     <td>
                         <input type="button" value="Voltar" onclick="history.back()">
                     </td>
                 </tr>
             </table>
                 
         </form>
    </body>
</html>
