<?php
require"conexao.php";
$id=$_POST["id"];
//$id="5";
//$usuario="jonh";
//$senha="1234";

$sql_query = "delete from curriculun where cod_curriculum = $id";
if(mysqli_query($con, $sql_query)){
 echo "certo";
}else{
echo"Erro ao registrar dados .mysqli_error($con)";
}
?> 