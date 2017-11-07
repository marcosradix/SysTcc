<%-- 
    Document   : testeJsp
    Created on : 21/09/2017, 23:08:59
    Author     : Marcos Ferreira
--%>
<%@page import="model.AgendamentoTccModel"%>
<%@page import="model.CadastrarTccModel"%>
<%@page import="java.util.List"%>
<%@page import="dao.CadastrarTccDao"%>
<jsp:useBean id="aTccDao" class="dao.AgendamentoTccDao"/>
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
                        <br>
                        <%

                            Long codigo = Long.parseLong(request.getParameter("codigo"));
                            AgendamentoTccModel retorno = aTccDao.buscar(codigo);

                        %>

  <form action="agendamentoTccServlet" method="POST">
                        <div id="main" class="container">
                            <form action="agendamentoTccServlet" method="POST">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <h3>Editar TCC Agendado</h3>
                                        <br />


                                        <div class="row form-control" style="background-color: lightblue">
                                            <div class="form-group col-md-6 col-md-offset-5">
                                                <label>INFORMAÇÕES GERAIS</label>
                                            </div>
                                        </div>
                                        <br>
                                        <div class="form-group">
                                            <label for="tcc">Id</label>
                                            <input type="text" value="<%= retorno.getId()%>" name="id" class="form-control" id="id" required readonly="true">
                                        </div>
                                        <div class="form-group" hidden="true">
                                            <label></label>
                                            <input type="text" class="form-control">
                                        </div>
                                        <div class="form-group">
                                            <label for="tcc">TCC</label>
                                            <input type="text" value="<%= retorno.getTcc()%>" name="tcc" class="form-control" id="tcc" required>
                                        </div>

                                        <div class="form-group ">
                                            <label for="tituloTcc">TÍTULO DO TCC</label>
                                            <input type="text" value="<%= retorno.getTituloTcc()%>" name="tituloTcc" class="form-control" id="tituloTcc" required>
                                        </div>

                                        <div class="form-group">
                                            <label for="aluno">ALUNO</label>
                                            <input type="text" value="<%= retorno.getAluno()%>" name="aluno" class="form-control" id="aluno" required>
                                        </div>

                                        <div class="form-group">
                                            <label for="curso">CURSO</label>
                                            <input type="text" value="<%= retorno.getCurso()%>" name="curso" class="form-control" id="curso" required>
                                        </div>

                                        <div class="form-group">
                                            <label for="orientador">ORIENTADOR</label>
                                            <input type="text" value="<%= retorno.getOrientador()%>" name="orientador" class="form-control" id="orientador" required>
                                        </div>

                                        <div class="form-group">
                                            <label for="avaliadorInterno">AVALIADOR INTERNO</label>
                                            <input type="text" value="<%= retorno.getAvaliadorInterno()%>" name="avaliadorInterno" class="form-control" id="avaliadorInterno" required>
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
                                            <input type="text" value="<%= retorno.getAvaliadorExterno()%>" name="avaliadorExterno" class="form-control" id="avaliadorExterno">
                                        </div>

                                        <div class="form-group">
                                            <label for="areaConhecimento">ÁREA DE CONHECIMENTO</label>
                                            <input type="text" value="<%= retorno.getAreaConhecimento()%>" name="areaConhecimento" class="form-control" id="areaConhecimento">
                                        </div>

                                        <div class="form-group">
                                            <label for="dataInicio">DATA INICIO</label>
                                            <input type="date" value="<%= retorno.getDataInicio()%>" name="dataInicio" class="form-control" id="dataInicio">
                                        </div>

                                        <div class="form-group">
                                            <label for="dataFinal">DATA FINAL</label>
                                            <input type="date" value="<%= retorno.getDataFinal()%>" name="dataFinal" class="form-control" id="dataFinal">
                                        </div>

                                        <div class="form-group">
                                            <label for="dataDefesa">DATA DA DEFESA</label>
                                            <input type="date" value="<%= retorno.getDataDefesa()%>"  name="dataDefesa" class="form-control" id="dataDefesa">
                                        </div>

                                        <div class="form-group">
                                            <label for="resultDefesa">RESULTADO DA DEFESA</label>
                                            <input type="text" value="<%= retorno.getResultadoDefesa()%>" name="resultDefesa" class="form-control" id="resultDefesa">
                                        </div>

                                    </div>

                                </div>

                                <div class="col-md-12">
                                    <button type="submit" class="btn btn-primary">Salvar</button>
                                    <input type="button" class="btn btn-success" value="Voltar" onclick="history.back()">

                                </div>

                        </div>
                        </form>
                    </div>
            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
    </body>
</html>