<?php
require"conexao.php";

$sql_query = "select valor from criptomoeda";
$stm = mysqli_query($con, $sql_query);
$teste = mysqli_fetch_all($stm);

foreach($teste as $value){

$valor = $value[0];


}
 
$sql_query = "select nome,valor from Ranking order by convert(replace(valor,'.',''),decimal) desc;";
$stm = mysqli_query($con, $sql_query);
$teste = mysqli_fetch_all($stm);
 
 
foreach($teste as $value){

  $total = intval($value[1]) * $valor;
	 
   echo $value[0]; 
    echo '  $SK ';
    echo $total;
    echo ";";
 
}	 	






?>

 

               

                

                