<%-- 
    Document   : profCadastradosJSP
    Created on : 02/11/2017, 15:19:28
    Author     : Jose Werbston
--%>
<%@page import="model.CadProfessorModel"%>
<%@page import="java.util.List"%>
<%@page import="dao.CadProfessorDao"%>
<jsp:useBean id="pProfessorDao" class="dao.CadProfessorDao"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
﻿<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Pesquisa de Professores</title>

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
                    <button type="button" class="navbar-toggle collapse" data-toggle="collapse"  aria-controls="navbar">
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
        <form action="PesquisaProfServlet" method="GET">
        <div id="main" class="container-fluid" style="margin-top: 50px">
            <div id="top" class="row">
                <div class="col-sm-3">
                    <h2>Consulta de Professores</h2>
                </div>
                <div class="col-sm-6">

                            <div class="input-group h2">
                            <input name="pesquisa" class="form-control" id="pesquisa" type="text" placeholder="Informe o nome do professor">
                            <span class="input-group-btn">
                                <button class="btn btn-primary" type="submit">
                                    <span class="glyphicon glyphicon-search"></span>
                                </button>
                            </span>
                        </div>

                </div>

            </div> <!-- /#top -->


            <hr />
            <div id="list" class="row">	
                
                <div class="table-responsive col-md-12">
                    <table class="table table-striped" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>MATRÍCULA FUNCIONAL</th>
                                <th>NOME COMPLETO</th>
                                <th>DATA DE NASCIMENTO</th>
                                <th>EMAIL</th>
                                <th class="actions">Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                         <c:forEach items="${pProfessorDao.listar(busca)}" var="itemList">
                                    <tr>
                                        <td>${itemList.getId()}</td>
                                        <td>${itemList.getMatricula()}</td>
                                        <td>${itemList.getNomeCompleto()}</td>
                                        <td>${itemList.getDataDeNascimento()}</td>
                                        <td>${itemList.getEmail()}</td>
                                        <td></td>
                                        <td class="actions">
                                            <a class="btn btn-primary btn-xs"  href="cadProfessorEditar.jsp?codigo=${itemList.getId()}" >Visualizar</a>
                                            <a class="btn btn-warning btn-xs" href="cadProfessorEditar.jsp?codigo=${itemList.getId()}">Editar</a>
                                            <a class="btn btn-danger btn-xs"  href="cadProfessorDelete.jsp?id=${itemList.getId()}" >Excluir</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                        </tbody>
                    </table>
                </div>

            </div> <!-- /#list -->

            <div id="bottom" class="row">
                <div class="col-md-12">
                    <ul class="pagination">
                        <li class="disabled"><a>&lt; Anterior</a></li>
                        <li class="disabled"><a>1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
                    </ul><!-- /.pagination -->
                </div>
            </div> <!-- /#bottom -->
        </div> <!-- /#main -->
        </form>
        <!-- Modal -->
        <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="modalLabel">Excluir Item</h4>
                    </div>
                    <div class="modal-body">
                        Deseja realmente excluir este item?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">Sim</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                    </div>
                </div>
            </div>
        </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>