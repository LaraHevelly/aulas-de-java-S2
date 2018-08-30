https://github< fprm method = “GET” action= “#”>
 <select name = ‘tipoUsuario'>
<option value = ‘0’ > Selecione ...</option>
<option value = ‘1’ > Administrador</option>
<option value = ‘2’ > Convidado </option>
<option value = ‘3’ > Cliente </option>  
</select>
<input type= “number” name= “qtde” placeholder= “Números de cadastros”/>
<input type= “submit” value= “escolher”/>
<form/>
<?php
If (isset ($_GET[‘tipoUsuario’])) {
$tipo = $_GET[‘tipoUsuario'];
If ($tipo== 0){
Echo “<font do por = “red” > Escolha um tipo  de usuario}
If  ($tipo ==1){
Include (“exemplo10.1php”);
}
}
?>
