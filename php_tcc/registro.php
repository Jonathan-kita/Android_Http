<?php
require"conexao.php";
$nome=$_POST["name"];
$usuario=$_POST["user_name"];
//$nome="a";
//$usuario="123";

$usuario = limpar_texto($usuario);

//$senha="a";

 $sql_query = "insert into Ranking(nome,valor) values('$nome','$usuario')";

if(mysqli_query($con, $sql_query)){
   echo"Dados inseridos com sucesso";
 }else{
   echo "Erro ao registrar dados .mysqli_error($con)";
 }


function limpar_texto($str){ 
  return preg_replace("/[^0-9s,.]/", "", $str); 
}
// Exemplo de Utilização
//echo limpar_texto('Olá 1456Mundo!');
?> 