<?php  
 require'conexao.php';

$nome = $_POST['nome'];
$nascimento = $_POST['nascimento'];
$cpf = $_POST['cpf'];
$endereco = $_POST['endereco'];
$telefone = $_POST['telefone'];
$celular = $_POST['celular'];
$email = $_POST['email'];

//$nome = "teste";
//$nascimento ="15" ;
//$cpf ="54" ;
//$endereco = "tewse";
//$telefone ="2653" ;
//$celular = "4342";
//$email = "jonathan@ajds";

$sql_query=" insert into curriculun(nome,nascimento,cpf,endereco,telefone,celular,email)values('$nome','$nascimento','$cpf','$endereco','$telefone','$celular','$email');";
    if(mysqli_query($con,$sql_query)){
    	echo "inserido";}else{
    		echo"erro";}
 

?>