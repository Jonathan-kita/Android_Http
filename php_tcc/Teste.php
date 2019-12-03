<?php

require"conexao.php";/*pega minha class de conexão*/

//$usuario =$_POST["login_name"];

//$senha=$_POST["login_pass"];
//$usuario = "marco1";
//$senha = "123";

$sql_query="select nome from tb_usuarios";

$result= mysqli_query($con,$sql_query);

/*verifica se a alguma linha com o mesmo nome no banco se ouver 1 ou mais linhas treu*/

$row = mysqli_fetch_all($result);/*tras o resultado da consulta*/

/*pega o campo nome da tabela para mim*/
foreach($row as $value){		

  echo '<pre>';
  echo $value[1];
  echo '</pre>';

} 
  //echo '<pre>';
  //echo print_r($row);
  //echo '</pre>';


?> 

