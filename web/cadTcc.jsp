<%-- 
    Document   : 
    Created on : 27/09/2017, 11:19:06
    Author     : Marcos Ferreira
--%>
<jsp:useBean id="cProfDao" class="dao.CadProfessorDao"/>
<jsp:useBean id="cAlunoDao" class="dao.CadAlunoDao"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
﻿<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Agendamento TCC</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
</head>
<body>
    <% response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
        if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.jsp");
        }
    %>
 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
   <div class="navbar-header">
    <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar" aria-controls="navbar">
     <span class="sr-only">Toggle navigation</span>
     <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="dashboard.jsp">SysTcc - Sistema de Agendamento de TCC</a>
   </div>
   <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
     <li><a href="dashboard.jsp">In&iacute;cio</a></li>
     <li><a href="dashboard.jsp">Ajuda</a></li>
    </ul>
   </div>
  </div>
 </nav>

 <hr />
 
    <div id="main" class="container">
       
            <div class="row">
                    <br />
                    <h3>Cadastrar TCC</h3>
                    <br />

          <div class="row">
            <div class="row form-control" style="background-color: lightblue">
            <div class="form-group col-md-12 col-md-offset-5">
              <label style="">REGISTRAR TCC</label>
            </div>
          </div>
                        <br>
                        
            <form action="CadTcc" method="GET">
                        <div class="form-group">
                            <label for="tcc">TÍTULO</label>
                            <input type="text" name="titulo" class="form-control" id="titulo">
                        </div>
                         <div class="form-group">
                            <label for="tcc">RESUMO</label>
                            <input type="text" name="resumo" class="form-control" id="tcc">
                        </div>

                        <div class="form-group ">
                            <label for="tituloTcc">PALAVRA-CHAVE</label>
                            <input type="text" name="pavra_chave" class="form-control" id="tituloTcc">
                        </div>

                        <div class="form-group">
                            <label for="aluno">CURSO</label>
                            <input type="text" name="curso" class="form-control" id="aluno">
                        </div>

                               <div class="form-group">
                                <label for="autor">AUTOR</label>
                               <select class="form-control" name="autor" id="autor">
                                   <option>Selecione.......</option>
                                <c:forEach items="${cAlunoDao.listarAluno()}" var="itemList">
                                    <option label="${itemList.getNomeCompleto()}" itemid="autor" value="${itemList.getNomeCompleto()}"></option>
                                </c:forEach>
                               </select>
                            </div>

                              <div class="form-group">
                                <label for="orientador">ORIENTADOR</label>
                               <select class="form-control" name="orientador" id="orientador">
                                   <option>Selecione.......</option>
                                <c:forEach items="${cProfDao.listarProfessor()}" var="itemList">
                                    <option label="${itemList.getNomeCompleto()}" itemid="orientador" value="${itemList.getNomeCompleto()}"></option>
                                </c:forEach>
                               </select>
                            </div>

                        <div id="actions" class="row">
                            <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <input type="button" class="btn btn-success" value="Voltar" onclick="history.back()">
                           </div>
                       </div>
                  </form>
                </div>
                
            </div>
        
    </div>


        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>