<%-- 
    Document   : 
    Created on : 27/09/2017, 11:19:06
    Author     : Marcos Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>SysTcc</title>
 <link rel="shortcut icon" type="image/x-icon" href="img/ico.png"/>
 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
 
<style type="text/css">
	.btn{
	background-color:lightblue; 
	font-size: 25px;
	text-shadow: 1px 1px 1px #0B243B;
	font-family: white;
	}
	.dropdown-menu{
    background-color:lightblue; 
	border-radius: 10px;
	text-align: center;
	font-size: 20px;
	font-family: white;
	width: 280px;
	}
</style>
</head>
<body>
    <% response.setHeader("Cache-Control","no-cache ,must-revalidate");
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
     <span class="icon-bar"></span>
     <span class="icon-bar"></span>
    </button>
        <strong class="navbar-brand" ><a href="dashboard.jsp">SysTcc - Sistema de Agendamento de TCC</a></strong>
   </div>
  <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
         <li><a href="sair.jsp">Sair</a></li>
        <li><a href="dashboard.jsp">Início</a></li>
       
     <li><a href="#">Ajuda</a></li>
     <% String sessao = (String )request.getSession().getAttribute("usuario");%>
     <li><a><%= sessao != null ? "Logado : "+sessao : ""%></a></li>
    </ul>
   </div>
  </div>
 </nav>

 <hr />

 <div id="main" class="container-fluid form-control">
  <form action="LoginServlet" method="POST">
  	<div class="container">
                  <hr />
    <div class="btn-group btn-group-justified" role="group" aria-label="...">
     
     <div class="btn-group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
      ALUNO <span class="caret"></span>
          </button>
          <ul class="dropdown-menu">
           <li><a href="cadAluno.jsp">Cadastrar Aluno</a></li>
           <li><a href="alunCadastrados.jsp">Pesquisar Aluno</a></li>
          <!--  <li><a href="#">Something else here</a></li> -->
          <!--  <li role="separator" class="divider"></li>
           <li><a href="#">Separated link</a></li> -->
           </ul>
         </div>

     <div class="btn-group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
      PROFESSOR <span class="caret"></span>
          </button>
          <ul class="dropdown-menu">
           <li><a href="cadProfessor.jsp">Cadastrar Professor</a></li>
           <li><a href="profCadastrados.jsp">Pesquisar Professor</a></li>
           <!-- <li><a href="#">Something else here</a></li> -->
          <!--  <li role="separator" class="divider"></li>
           <li><a href="#">Separated link</a></li> -->
           </ul>
         </div>

      <div class= "btn-group">
          <button type="button" class=" btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      AGENDAMENTO <span class="caret"></span>
          </button>
          <ul class="dropdown-menu">
           <li><a href="agendamentoTcc.jsp" >Agendar TCC</a></li>
           <li><a href="pescAgendamentos.jsp">Pesquisar TCC agendado</a></li>
           <li><a href="cadTcc.jsp">Cadastrar TCC</a></li>
           <li><a href="pesquisaTcc.jsp">Pesquisar TCC</a></li>
           <!-- <li><a href="#">Something else here</a></li> -->
           <!-- <li role="separator" class="divider"></li>
           <li><a href="#">Separated link</a></li> -->
           </ul>
         </div>
      <div class="btn-group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      ADMINISTRATIVO <span class="caret"></span>
          </button>
          <ul class="dropdown-menu">
           <li><a href="cadTecnicoAdm.jsp">Cadastrar Tec Adimin</a></li>
         <!--   <li><a href="#">Another action</a></li>
           <li><a href="#">Something else here</a></li> -->
          <!--  <li role="separator" class="divider"></li>
           <li><a href="#">Separated link</a></li> -->
           </ul>
      </div>
    </div>
   </form>
  </div>
  <hr />
  <center><img src="img/background.jpg" width="420" height="420">
	<br>
	<br>
  <p align="center">Copyright Â©2017 - DSW Fametro</center>
   <script src="js/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <br>
 </body>
</html>