<?php
require"conexao.php";/*pega minha class de conexão*/

$usuario = $_POST["nome"];
$senha=$_POST["senha"];
echo "Usuario:".$usuario." E  ".$senha;
//$usuario="a";
//$senha="a";
//$sql_query="select * from login;";
$sql_query="select nome from login where nome like '$usuario'and senha like '$senha';";

$result= mysqli_query($con,$sql_query);

if(mysqli_num_rows($result)>0){/*verifica se a alguma linha com o mesmo nome no banco se ouver 1 ou mais linhas treu*/

$row = mysqli_fetch_assoc($result);/*tras o resultado da consulta*/

$nome = $row["nome"];/*pega o campo nome da tabela para mim*/

header('Location: configCripto.php');

//echo json_encode($row);
//echo "<pre>";
//echo "funciona";
//echo "</pre>";
}
echo " Usuario incorreto";


?>