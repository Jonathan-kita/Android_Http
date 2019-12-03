<?php 
require "conexao.php";
$query = "select valor from criptomoeda;";
$stm = mysqli_query($con, $query);
$teste = mysqli_fetch_all($stm);


?>
<!DOCTYPE html>
<html>
<head>
	<title>CriptoMoeda</title>
    <style type="text/css">
     div#body{
     	width:367px;
     	height: 367px;
     	margin-left: 37%;
     	margin-top: 7%;
     	background-image: url("preto.jpg") ;
     	background-repeat: no-repeat;
      	border-style: solid;
     	background-position: 50% 0;
     }
     div#cabecalho label
     {
       font-size: 24px;
       width:100%;
       height: 50px;
       
   	
     }
     div#body2 form
     {
     	width: auto;
     	height: 298px;
     	
     	margin-top: 20px;
     }
     div#cabecalho
     {
       width:100%;
       height: 50px;
       opacity: .99;
       background:black;
     }
 
      div#body2 label
     {
     	width: 200px;
     	height: 30px;
     	
     	color:#751;
     	font-size: 20px;
     	margin-top:50%;
     	margin-left: 20px;
     }

    </style>
</head>
<body style="background-image:url(background-598050_1920.jpg)">
  <div id="body">
  	<div id="cabecalho">
  		<img src="ecocash.png" width="50" height="50"/>
  		<label style="color:#751;"><?php  echo "O valor da CriptoMoeda é : ".$teste[0][0] ?></label>
      
    </div>
    <div id="body2">
    	<form id="atrValor" action="alterar.php" method="Post">
          <label>ALTERAR: </label> 		
          <input type="text" name="alterado" style="margin-top:50px;">
          <input type="submit" name="">
    	</form>

    </div>
  </div>

</body>
</html>