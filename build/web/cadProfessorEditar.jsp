<%-- 
    Document   : cadProfessorEditar
    Created on : 24/10/2017, 12:14:35
    Author     : José Werbston
--%>
<%@page import="model.CadProfessorModel"%>
<%@page import="java.util.List"%>
<%@page import="dao.CadProfessorDao"%>
<jsp:useBean id="pProfessorDao" class="dao.CadProfessorDao"/>
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
        <form action="CadProfessorServlet" method="GET">
            <div class="row">
                    <br />
                    <h3>Editar Professor</h3>
                    <br />

          <div class="row">
            <div class="row form-control" style="background-color: lightblue">
            <div class="form-group col-md-12 col-md-offset-5">
              <label style="">REGISTRAR PROFESSOR</label>
            </div>
          </div>
                        <br>
                               <%
            
        Long codigo = Long.parseLong(request.getParameter("codigo"));
        CadProfessorModel retorno = pProfessorDao.buscar(codigo);
        
        %>
                        
        
                        <div class="form-group">
                            <label for="professor">ID</label>
                            <input type="text" value="<%=retorno.getId()%>" name="id" class="form-control" id="id" readonly="true">
                        </div>
                        <div class="form-group">
                            <label for="nome">NOME COMPLETO</label>
                            <input type="text" value="<%=retorno.getNomeCompleto()%>" name="nomeCompleto" class="form-control" id="nomeCompleto">
                        </div>
                         <div class="form-group">
                            <label for="dataNascimento">DATA DE NASCIMENTO</label>
                            <input type="date" value="<%=retorno.getDataDeNascimento()%>" name="dataNascimento" class="form-control" id="dataNascimento">
                        </div>

                        <div class="form-group ">
                            <label for="sexo">SEXO</label>
                            <select class="form-control" name="sexo" id="sexo">
                                <option><%=retorno.getSexo()%></option>
                                <option value="marculino">MASCULINO</option>
                                <option value="feminino">FEMININO</option> 
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="matricula">MATRÍCULA FUNCIONAL</label>
                            <input type="text" value="<%=retorno.getRg()%>"  name="matricula" class="form-control" id="matricula">
                        </div>
                        <div class="form-group">
                            <label for="rg">RG</label>
                            <input type="text" value="<%=retorno.getRg()%>"  name="rg" class="form-control" id="rg">
                        </div>

                        <div class="form-group">
                            <label for="cpf">CPF</label>
                            <input type="text" value="<%= retorno.getCpf()%>" name="cpf" class="form-control" id="cpf">
                        </div>

                        <div class="form-group">
                            <label for="email">EMAIL</label>
                            <input type="text" value="<%=retorno.getEmail()%>" name="email" class="form-control" id="email">
                        </div>
                        
                        <div class="form-group">
                            <label for="telFixo">TELEFONE FIXO</label>
                            <input type="text" value="<%=retorno.getTelefoneFixo()%>" name="telefoneFixo" class="form-control" id="telefoneFixo">
                        </div> 

                        <div class="form-group">
                            <label for="telCelular">TELEFONE CELULAR</label>
                            <input type="text" value="<%=retorno.getTelefoneCelular()%>" name="telefoneCelular" class="form-control" id="telefoneCelular">
                        </div>
                        
                        <div class="form-group">
                            <label for="endereco">ENDEREÇO</label>
                            <input type="text" value="<%=retorno.getEndereco()%>" name="endereco" class="form-control" id="endereco">
                        </div>
                        
                        
                        <div class="form-group">
                            <label for="numero">NÚMERO</label>
                            <input type="text" value="<%=retorno.getNumero()%>" name="numero" class="form-control" id="numero">
                        </div>
                        
                        
                        <div class="form-group">
                            <label for="bairro">BAIRRO</label>
                            <input type="text" value="<%=retorno.getBairro()%>" name="bairro" class="form-control" id="bairro">
                        </div>
                        
                        
                        <div class="form-group">
                            <label for="cidade">CIDADE</label>
                            <input type="text" value="<%=retorno.getCidade()%>" name="cidade" class="form-control" id="cidade">
                        </div>
                        
                        
                        <div class="form-group">
                            <label for="estado">ESTADO</label>
                            <input type="text" value="<%=retorno.getEstado()%>" name="estado" class="form-control" id="estado">
                        </div>
                        
                        
                        <div class="form-group">
                            <label for="cep">CEP</label>
                            <input type="text" value="<%=retorno.getCep()%>" name="cep" class="form-control" id="cep">
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