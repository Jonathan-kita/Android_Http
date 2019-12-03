<?php  
 require'conexao.php';

$nome = $_POST['nome'];
$cnpj = $_POST['cnpj'];


$sql_query=" insert into Empresa(nome,CNPJ)values('$nome','$cnpj);";
    if(mysqli_query($con,$sql_query)){
    	echo "inserido";}else{
    		echo"erro";}
 

?>