<%-- 
    Document   : 
    Created on : 27/09/2017, 11:19:06
    Author     : Marcos Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Cadastro de Alunos</title>

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
     <span class="icon-bar"></span>
     <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="dashboard.jsp">SysTcc - Sistema de Agendamento de TCC</a>
   </div>
   <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
    </ul>
   </div>
  </div>
 </nav>
 
 <hr />

 <div id="main" class="container-fluid">
  
   <h3 class="page-header">Cadastro de Aluno</h3>

   <form action="CadAlunoServlet" method="POST">
            <div class="row form-control" style="background-color: lightblue">
              <div class="form-group col-md-12 col-md-offset-5">
                <label>INFORMAÇÕES PESSOAIS</label>
              </div>
            </div>

          <div class="row">
            <div class="form-group col-md-8">
              <label for="nome">NOME COMPLETO</label>
              <input type="text" name="nome" class="form-control" id="nome">
            </div>
            <div class="form-group col-md-3">
              <label for="dataNascimento">DATA DE NASCIMENTO</label>
              <input type="date" name="dataNascimento"  class="form-control" required id="dataNascimento">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-3">
                <label for="sexo">SEXO</label>
              <select class="form-control" name="sexo" id="sexo">
                <option>Selecione...</option>
                <option value="Masculino">MASCULINO</option>
                <option value="Feminino">FEMININO</option> 
               </select>
            </div>
             <div class="form-group col-md-3">
              <label for="rg">RG</label>
              <input type="text" name="rg" class="form-control" id="rg">
            </div>
             <div class="form-group col-md-3">
              <label for="cpf">CPF</label>
              <input type="text" name="cpf" class="form-control" id="cpf">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-7">
              <label for="email">E-MAIL</label>
              <input type="email" name="email" class="form-control" id="email">
            </div>
            <div class="form-group col-md-2">
              <label for="telFixo">TELEFONE FIXO</label>
              <input type="text" name="telFixo" class="form-control" id="telFixo">
            </div>
            <div class="form-group col-md-2">
              <label for="telCelular">TELEFONE CELULAR</label>
              <input type="text" name="telCelular" class="form-control" id="telCelular">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-9">
              <label for="endereco">ENDEREÇO</label>
              <input type="text" name="endereco" class="form-control" id="endereco">
            </div>
            <div class="form-group col-md-2">
              <label for="numero">NÚMERO</label>
              <input type="text" name="numero" class="form-control" id="numero">
            </div>
            </div>
            <div class="row">
            <div class="form-group col-md-4">
              <label for="bairro">BAIRRO</label>
              <input type="text" name="bairro" class="form-control" id="bairro">
            </div>
            <div class="form-group col-md-3">
              <label for="cidade">CIDADE</label>
              <input type="text" name="cidade" class="form-control" id="cidade">
            </div>
            <div class="form-group col-md-2">
              <label for="estado">ESTADO</label>
              <input type="text" name="estado" class="form-control" id="estado">
            </div>
              <div class="form-group col-md-2">
              <label for="cep">CEP</label>
              <input type="text" name="cep"  class="form-control" id="cep">
            </div>
          </div>
          <div class="row form-control" style="background-color: lightblue">
            <div class="form-group col-md-12 col-md-offset-5">
              <label style="">DADOS ACADADÉMICOS</label>
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-3">
              <label for="matricula">MATRÍCULA</label>
              <input type="text" name="matricula" class="form-control" id="matricula">
            </div>
            <div class="form-group col-md-3">
              <label for="curso">CURSO</label>
              <input type="text" name="curso" class="form-control" id="curso">
            </div>
            <div class="form-group col-md-3">
              <label for="semestreId">SEMESTRE</label>
              <input type="text" name="semestre" class="form-control" id="semestreId">
            </div>
             <div class="form-group col-md-2">
              <label for="turno">TURNO</label>
              <input type="text" name="turno" class="form-control" id="turno">
             </div>
            </div>

            <div id="actions" class="row">
            <div class="col-md-12">
            <button type="submit" class="btn btn-primary">Salvar</button>
            <input type="button" class="btn btn-success" value="Voltar" onclick="history.back()">
           </div>
          </div>
          <hr/>

     </form>

 </div>
 

 <script src="js/jquery.min.js"></script>
 <script src="js/bootstrap.min.js"></script>
</body>
</html>