<?php
require"conexao.php";
//$nome=$_POST["name"];
//$usuario=$_POST["user_name"];
//$senha=$_POST["user_pass"];
//$nome="jonathan";
//$usuario="jonh";
//$senha="1234";

//$sql_query = "insert into tb_usuarios values('$nome','$usuario','$senha')";
$sql_query = "select valor from criptomoeda";
$stm = mysqli_query($con, $sql_query);

//$dados=mysqli_query($con,$sql_query);
//$linha = mysqli_fetch_assoc($stm);
//$total = mysqli_num_rows($stm);
 $teste = mysqli_fetch_all($stm);
//echo"Dados com sucesso";
 
foreach($teste as $value){
	 
   echo $value[0]; 
    // echo "    R$";
    echo$value[1];
    echo ";";
 
}

 /* echo '<pre>';
  echo  print_r($teste);
  echo  '</pre>';
*/


?>

 

               

                

                