<!DOCTYPE html>
<html>
<head>
	<title>Criptomoeda</title>
<style>
div.form_login { 
	margin-left:38%;
	margin-top:10%; 
	border-style:ridge;
	width:367px;
	height: 300px;
	background-image:url("ecocash.png");
}

div#get_nome
{
  margin-top:150px;
  margin-left:23px;

}

div#get_senha
{
margin-top:20px;
margin-left:20px;	
}
input#enviar
{
	margin-top:60px;
	margin-left:45%;  
}


</style>

</head>
<body style="background-image:url(background-598050_1920.jpg)">
	<form action="home.php" method="Post" >
	<div class="form_login">
		<div id="get_nome">
		     <label for="nome" style="font-family:Arial">Digite seu nome</label>
		     <input type="text" name="nome">
		</div>
		<div id="get_senha">
		     <label for="senha" style="font-family:Arial">Digite sua senha</label>
		     <input type="password" name="senha">
        </div>
        <input type="submit" name="Enviar" id="enviar"> 
     </div>

	</form>

</body>
</html>	