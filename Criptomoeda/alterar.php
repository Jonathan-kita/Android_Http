<?php
require"conexao.php" ;

$valor = $_POST["alterado"];


$query = "update criptomoeda set valor = '$valor' where id_criptomoeda = 1;";


 if(mysqli_query($con,$query)){
    	header('Location: configCripto.php');
    }else
    {
   		echo"Valor não foi Enserido";

  	}


?>