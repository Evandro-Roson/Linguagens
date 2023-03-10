<?php
session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado"]) || $_SESSION["logado"] != TRUE) {
    header("Location: /p2/admin/login.php?erro=2");
}

    $conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

    if (isset($_POST["confirmar"])) $confirmar= $_POST['confirmar'];
    else $confirmar = "Cancelar";

    if ($confirmar == "Cancelar") header('Location: index.php');
    else {
        date_default_timezone_set('America/Sao_Paulo');
        $data = date("Y/m/d");
        $hora = date("H:i:s");
        if (isset($_POST["id"])) $id = $_POST['id'];
        else $id = NULL;

        if (isset($_POST["cracha"])) $cracha = $_POST['cracha'];
        else $cracha = NULL;

        if (isset($_POST["senha"])) $senha = $_POST['senha'];
        else $senha = NULL;

        if (isset($_POST["sql"])) $sql = $_POST['sql'];
        else $sql = NULL;

        if ($_POST["botao"] == "A") {
            mysqli_query($conexao, "UPDATE atendentes set n_cracha='$cracha' , senha='$senha' , data='$data' , alteracao='Alterar' , hora='$hora' where codigo=$id");
            mysqli_close($conexao);
            header('Location: index.php');
        }
        
        mysqli_query($conexao, $sql);
        mysqli_close($conexao);
        header('Location: index.php');
    }
?>