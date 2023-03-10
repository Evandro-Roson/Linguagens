<?php

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado1"]) || $_SESSION["logado1"] != TRUE) {
    header("Location: /p2/user/login.php?erro=2");
}

if (isset($_POST["confirmar"])) $confirmar = $_POST['confirmar'];
else $confirmar = 'Cancelar';

if ($confirmar == "Confirmar") {
    session_destroy();
    header("Location: /p2/user/login.php");
} else header("Location: /p2/user/index.php");

?>