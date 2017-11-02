<%-- 
    Document   : testeJsp
    Created on : 21/09/2017, 23:08:59
    Author     : Marcos Ferreira
--%>
<%@page import="model.CadastrarTccModel"%>
<%@page import="java.util.List"%>
<%@page import="dao.CadastrarTccDao"%>
<jsp:useBean id="cTccDao" class="dao.CadastrarTccDao"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Agendamento TCC</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
</head>
<body>

 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
   <div class="navbar-header">
    <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar" aria-controls="navbar">
     <span class="sr-only">Toggle navigation</span>
     <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="dashboard.html">SysTcc - Sistema de Agendamento de TCC</a>
   </div>
   <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
     <li><a href="dashboard.html">In&iacute;cio</a></li>
     <li><a href="dashboard.html">Ajuda</a></li>
    </ul>
   </div>
  </div>
 </nav>

 <hr />
 
    <div id="main" class="container">
        <form action="CadTcc" method="POST">
            <div class="row">
                    <br />
                    <h3>Editar TCC</h3>
                    <br />

          <div class="row">
            <div class="row form-control" style="background-color: lightblue">
            <div class="form-group col-md-12 col-md-offset-5">
              <label style="">REGISTRAR TCC</label>
            </div>
          </div>
                        <br>
                               <%
            
        Long codigo = Long.parseLong(request.getParameter("codigo"));
        CadastrarTccModel retorno = cTccDao.buscar(codigo);
        
        %>
                        
        
                        <div class="form-group">
                            <label for="tcc">ID</label>
                            <input type="text" value="<%=retorno.getId()%>" name="id" class="form-control" id="id" readonly="true">
                        </div>
                        <div class="form-group">
                            <label for="tcc">TÍTULO</label>
                            <input type="text" value="<%=retorno.getTitulo()%>" name="titulo" class="form-control" id="titulo">
                        </div>
                         <div class="form-group">
                            <label for="tcc">RESUMO</label>
                            <input type="text" value="<%=retorno.getResumo()%>" name="resumo" class="form-control" id="tcc">
                        </div>

                        <div class="form-group ">
                            <label for="tituloTcc">PALAVRA-CHAVE</label>
                            <input type="text" value="<%=retorno.getPalavraChave()%>" name="pavra_chave" class="form-control" id="tituloTcc">
                        </div>

                        <div class="form-group">
                            <label for="aluno">CURSO</label>
                            <input type="text" value="<%=retorno.getCurso()%>"  name="curso" class="form-control" id="aluno">
                        </div>

                        <div class="form-group">
                            <label for="curso">AUTOR</label>
                            <input type="text" value="<%= retorno.getAutor()%>" name="autor" class="form-control" id="curso">
                        </div>

                        <div class="form-group">
                            <label for="orientador">ORIENTADOR</label>
                            <input type="text" value="<%=retorno.getOrientador()%>" name="orientador" class="form-control" id="orientador">
                        </div>

                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <input type="button" class="btn btn-secondary" value="Voltar" onclick="history.back()">
                  
                </div>
                
            </div>
    </div>
           </form>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>