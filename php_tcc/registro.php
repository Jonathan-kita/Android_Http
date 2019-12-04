<?php
require"conexao.php";
$nome=$_POST["name"];
$usuario=$_POST["user_name"];
//$nome="a";
//$usuario="123";
$sql_query = "select valor from criptomoeda";
$stm = mysqli_query($con, $sql_query);
$teste = mysqli_fetch_all($stm);

foreach($teste as $value){

$valor = $value[0];

$usuario = limpar_texto($usuario);
$valor = intval($usuario)*$valor;
}



//$senha="a";

 $sql_query = "insert into Ranking(nome,valor) values('$nome','$valor')";

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