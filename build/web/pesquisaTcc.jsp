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
        <title>Pesquisa de TCC</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar"  aria-controls="navbar">
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
   <form action="PesquisaTccServlet" method="GET" name="formBusca">
        <div id="main" class="container-fluid" style="margin-top: 50px">

            <div id="top" class="row">
                <div class="col-sm-3">
                    <h2>Pesquisa de TCC</h2>
                </div>
                <div class="col-sm-6">

                    <div class="input-group h2">
                        <input name="busca" class="form-control" id="search" type="text" placeholder="Pesquisar Tccs">
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
                                <th>CÓDIGO</th>
                                <th>TÍTULO</th>
                                <th>AUTOR</th>
                                <th>ORIENTADOR</th>
                                <th>CURSO</th>
                                <th class="actions">AÇÕES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${cTccDao.listar(busca)}" var="itemList">
                                    <tr>
                                        <td>${itemList.getId()}</td>
                                        <td>${itemList.getTitulo()}</td>
                                        <td>${itemList.getAutor()}</td>
                                        <td>${itemList.getOrientador()}</td>
                                        <td>${itemList.getCurso()}</td>
                                        <td></td>
                                        <td class="actions">
                                            <a class="btn btn-success btn-xs" href="testeJsp.jsp?codigo=${itemList.getId()}" data-toggle="modal" data-target="#show-modal">Visualizar</a>
                                            <a class="btn btn-warning btn-xs" href="cadTccEditar.jsp?codigo=${itemList.getId()}">Editar</a>
                                            <a class="btn btn-danger btn-xs"  href="testeJsp.jsp?codigo=${itemList.getId()}" data-toggle="modal" data-target="#delete-modal">Excluir</a>
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
       <div class="modal fade" id="edit-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>