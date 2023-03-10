<?php
session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado"]) || $_SESSION["logado"] != TRUE) {
    header("Location: /p2/admin/login.php?erro=2");
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confirmação</title>
    <link rel="stylesheet" href="CSS/style_valida.css">
</head>
<body>
    <section>
        <div class="section">
            <h1>Atenção!</h1>
            <form action="sair.php" method="post">
                <p>Tem certeza que deseja encerrar a sessão?</p>
                <div class='button'>
                    <input type="submit" name="confirmar" value="Cancelar">                     
                    <input type="submit" name="confirmar" value="Confirmar">
                </div>
            </form>
        </div>
    </section>
</body>
</html>

