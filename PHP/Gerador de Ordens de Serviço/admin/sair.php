<?php

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado"]) || $_SESSION["logado"] != TRUE) {
    header("Location: /p2/admin/login.php?erro=2");
}

if (isset($_POST["confirmar"])) $confirmar = $_POST['confirmar'];
else $confirmar = 'Cancelar';

if ($confirmar == "Confirmar") {
    session_destroy();
    header("Location: /p2/admin/login.php");
} else header("Location: /p2/admin/index.php");

?>