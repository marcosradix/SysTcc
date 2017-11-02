<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Syslogin</title>
 <link rel="shortcut icon" type="image/x-icon" href="img/ico.png"/>
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
     <span class="icon-bar"></span>
     <span class="icon-bar"></span>
    </button>
    <strong class="navbar-brand" href="#">SysTcc - Sistema de Agendamento de TCC</strong>
   </div>
   <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
     <li><a href="#"></a></li>
     <li><a href="#"></a></li>
     <li><a href="#"></a></li>
     <li><a href="#"></a></li>
    </ul>
   </div>
  </div>
 </nav>

 <hr />

 <div id="main" class="container-fluid">
  <form action="LoginServlet" method="POST">

      <div class="row col-md-4 col-md-offset-4">
           <hr  />
            <center><img src="img/logo.jpg" width="200" height="200">
             <center>
                 <hr />
            </center>
              <div class="form-group">
                 
                  <label>Login</label>
                  <input type="text" class="form-control" name="login" id="login" placeholder="Digite seu email" required="required">
              </div>

              <div class="form-group">
                  <label>Senha</label>
                <input type="password" class="form-control" name="senha" id="senha" placeholder="Digite sua senha" required="required">
              </div>

          <button type="submit" class="btn btn-primary form-control">Entrar
                 <span class="glyphicon glyphicon-ok-circle"></span>
               </button>
                     
         </div>
        </form>
    </div>
   <script src="js/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <br>
   <p align="center">Copyright ©2017 - DSW Fametro</p>
 </body>
</html>