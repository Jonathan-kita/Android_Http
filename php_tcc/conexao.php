<?php
$db_name="Criptomoeda";
$mysql_user="root";
$password="";
$server_name="localhost";
$con=mysqli_connect($server_name,$mysql_user,$password,$db_name);

if(!$con){
 echo"ERRO DE CONEXÂO".mysqli_connect_erro();

}else{
//echo"conexao criada com sucesso!";
}
?>