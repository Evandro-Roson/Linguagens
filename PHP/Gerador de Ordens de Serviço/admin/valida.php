<?php
    $conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

    session_start();
    
    //Verifico se o usuário está logado no sistema
    if (!isset($_SESSION["logado"]) || $_SESSION["logado"] != TRUE) {
        header("Location: /p2/admin/login.php?erro=2");
    }


    if (isset($_GET["manut"])) $botao = $_GET['manut'];
    else $botao = "N";

    if (isset($_GET["id"])) $id = $_GET['id'];
    else $id = NULL;

    if (isset($_POST["cracha"])) $cracha = $_POST['cracha'];
    else $cracha = NULL;

    if (isset($_POST["senha"])) $senha = $_POST['senha'];
    else $senha = NULL;

    date_default_timezone_set('America/Sao_Paulo');
    $data = date("Y/m/d");
    $hora = date("H:i:s");

   switch ($botao) {
        case "N":
            if ($cracha == NULL || $senha == NULL) header('Location: index.php'); 
            else {
                $alteracao = "Incluir";
                $sql = "INSERT INTO `funcionarios` (`codigo`, `nome`, `telefone`, `endereco_logradouro`, `endereco_n`, `endereco_cep`, `endereco_bairro`) VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL)";
                mysqli_query($conexao, $sql);
                $lastid = mysqli_insert_id($conexao);
                $sql = "INSERT INTO `atendentes` (`codigo`, `n_cracha`, `senha`, `data`, `hora`, `alteracao`, `administrador_codigo`) VALUES ('$lastid', '$cracha', '$senha', '$data', '$hora', '$alteracao', '1');";
                mysqli_query($conexao, $sql);
                header('Location: index.php');
            }
        break;
        
        case "A":
            $tabela = mysqli_query($conexao, "SELECT * from atendentes where codigo=$id");
            $linha = mysqli_fetch_array($tabela);
            $cracha = $linha['n_cracha'];
            $senha = $linha['senha'];
            $texto = "alterar para";
        break;
        
        case "E":
            $tabela = mysqli_query($conexao, "SELECT * from atendentes where codigo=$id");
            $linha = mysqli_fetch_array($tabela);
            $cracha = $linha['n_cracha'];
            $senha = $linha['senha'];
            $sql = "DELETE from atendentes where codigo=$id";
            $texto = "excluir";
        break;
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
            <form action="altera.php" method="post">
                <p>Tem certeza que deseja <b><?php echo $texto; ?></b>:</p>
                <div class="dados">
                    <div>
                        <p>Crachá:</p>
                        <p><input type="number" name="cracha" max="9999" min="1000" value="<?php echo $cracha; ?>" <?php if ($botao == "E") echo "readonly" ?>></p>
                    </div>
                    <div>
                        <p>Senha:</p>
                        <p><input type="text" name="senha" value="<?php echo $senha; ?>" <?php if ($botao == "E") echo "readonly" ?>></p>
                    </div>
                </div> 
                <input type="hidden" name="botao" value="<?php echo $botao; ?>">
                <input type="hidden" name="sql" value="<?php echo $sql; ?>">
                <input type="hidden" name="id" value="<?php echo $id; ?>">
                    <div class='button'>
                        <input type="submit" name="confirmar" value="Cancelar">                     
                        <input type="submit" name="confirmar" value="Confirmar">
                    </div>
            </form>
        </div>
    </section>
</body>
</html>

<?php
    mysqli_close($conexao);
?>
    
