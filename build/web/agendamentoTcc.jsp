

<%-- 
    Document   : 
    Created on : 27/09/2017, 11:19:06
    Author     : Marcos Ferreira
--%>
<%@page import="model.CadAlunoModel"%>
<%@page import="dao.CadAlunoDao"%>
<jsp:useBean id="aTccDao" class="dao.CadAlunoDao"/>
<jsp:useBean id="cProfDao" class="dao.CadProfessorDao"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
     <li><a href="dashboard.jsp">Início</a></li>
     <li><a href="dashboard.jsp">Ajuda</a></li>
    </ul>
   </div>
  </div>
 </nav>

 <hr />
 
    <div id="main" class="container">
        <form action="agendamentoTccServlet" method="GET">
            <div class="row">
                <div class="col-sm-6">
                    <h3>Agendar TCC</h3>
                    <br />

                    
                        <div class="row form-control" style="background-color: lightblue">
                            <div class="form-group col-md-6 col-md-offset-5">
                                <label>INFORMAÇÕES GERAIS</label>
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <label for="tcc">TCC</label>
                            <input type="number" name="tcc" class="form-control" id="tcc" required>
                        </div>

                        <div class="form-group ">
                            <label for="tituloTcc">TÍTULO DO TCC</label>
                            <input type="text" name="tituloTcc" class="form-control" id="tituloTcc" required>
                        </div>

                           <div class="form-group">
                                <label for="aluno">ALUNO</label>
                               <select class="form-control" name="aluno" id="aluno">
                                   <option>selecione.....</option>
                                <c:forEach items="${aTccDao.listarAluno()}" var="itemList">
                                    <option label="${itemList.getNomeCompleto()}" itemid="aluno" value="${itemList.getNomeCompleto()}"></option>
                                </c:forEach>
                               </select>
                               
                            </div>

                        <div class="form-group">
                            <label for="curso">CURSO</label>
                            <input type="text" name="curso" class="form-control" id="curso" required>
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

                              <div class="form-group">
                                <label for="avaliadorInterno">AVALIADOR INTERNO</label>
                               <select class="form-control" name="avaliadorInterno" id="orientador">
                                   <option>Selecione.......</option>
                                   <c:forEach items="${cProfDao.listarProfessor()}" var="itemList">
                                    <option label="${itemList.getNomeCompleto()}" itemid="avaliadorInterno" value="${itemList.getNomeCompleto()}"></option>
                                </c:forEach>
                               </select>
                            </div>
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <button  type="submit" class="btn btn-success" onclick="history.back();">Cancelar</button>
                        </div>
                </div>
                <div class="col-sm-6">

                    <h3> <br />  </h3>
                    <br />

                    
                        <div class="row form-control" style="background-color: lightblue">
                            <div class="form-group col-md-6 col-md-offset-5">
                                <label></label>
                            </div>
                        </div>
                        <br>
                         <div class="form-group">
                                <label for="avaliadorExterno">AVALIADOR EXTERNO</label>
                               <select class="form-control" name="avaliadorExterno" id="orientador">
                                   <option>Selecione.......</option>
                                   <c:forEach items="${cProfDao.listarProfessor()}" var="itemList">
                                    <option label="${itemList.getNomeCompleto()}" itemid="avaliadorExterno" value="${itemList.getNomeCompleto()}"></option>
                                </c:forEach>
                               </select>
                            </div>

                        <div class="form-group">
                            <label for="areaConhecimento">ÁREA DE CONHECIMENTO</label>
                            <input type="text" name="areaConhecimento" class="form-control" id="areaConhecimento">
                        </div>

                        <div class="form-group">
                            <label for="dataNascimento">DATA INICIO</label>
                            <input type="date" name="dataInicio" class="form-control" id="dataInicio">
                        </div>

                        <div class="form-group">
                            <label for="dataFinal">DATA FINAL</label>
                            <input type="date" name="dataFinal" class="form-control" id="dataFinal">
                        </div>

                        <div class="form-group">
                            <label for="dataDefesa">DATA DA DEFESA</label>
                            <input type="date" name="dataDefesa" class="form-control" id="dataDefesa">
                        </div>

                        <div class="form-group">
                            <label for="resultDefesa">RESULTADO DA DEFESA</label>
                            <input type="text" name="resultDefesa" class="form-control" id="resultDefesa">
                        </div>

            </div>
        
    </div>
</form>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </div>
</body>
</html>