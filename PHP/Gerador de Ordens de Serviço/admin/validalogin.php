<?php
    $conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

    if (isset($_POST["email"])) $email = $_POST['email'];
    else $email = NULL;

    if (isset($_POST["senha"])) $senha = $_POST['senha'];
    else $senha = NULL;
    
    session_start();
    
    $login = mysqli_query($conexao, "SELECT * FROM `administrador` WHERE email='$email' and senha='$senha';");

    $result = mysqli_num_rows($login);

    if ($result == 1) {
        $_SESSION["logado"] = TRUE;
        $_SESSION["user"] = $_POST["login"];
        header ("Location: /p2/admin/index.php");
    } else header ("Location: /p2/admin/login.php?erro=1"); 
?>