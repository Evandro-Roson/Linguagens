<?php
    $conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado"]) || $_SESSION["logado"] != TRUE) {
    header("Location: /p2/admin/login.php?erro=2");
}
?>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8" />
    <title>Management</title>
    <link rel="stylesheet" href="./assets/stylesheet/reset.css" />
    <link rel="stylesheet" href="./assets/stylesheet/style.css" />
</head>

<body>
    <div id="nav">
        Roson Tech Management
    </div>
    <div class="sair" style="text-align: center; padding-top: 20px;">
        <a href="encerrasession.php">
            <input type="button" class="input-btn" value="Encerrar" style="font-size: 20px; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;">
        </a>
    </div>
    <section id="table">
        <form action="valida.php" method="post">
            <div id="input-data">
                    <input id="cracha" name="cracha" class="input-text" placeholder="Nº Crachá" type="number" required min="1000" max="9999"/>
                    <input id="senha" name="senha" class="input-text" placeholder="Senha" type="password"  required/>
                    <input class="input-btn" type="submit" value="Adicionar"/>
                </div>
        </form>
        <table id="myTable">
            <tr id="0">
                <th>ID</th>
                <th>Nº Crachá</th>
                <th>Senha</th>
                <th>Modificação</th>
                <th>Data</th>
                <th>Hora</th>
                <th>Alterar</th>
                <th>Excluir</th>
            </tr>
<?php
    $sql = "SELECT * FROM atendentes order by codigo";
    $tabela = mysqli_query($conexao, $sql);
    while($linha = mysqli_fetch_array($tabela)) {
?>
        <tr>
            <td align="center"><?php echo $linha["codigo"]; ?></td>      
            <td align="center"><?php echo $linha["n_cracha"]; ?></td>
            <td align="center"><?php echo $linha["senha"]; ?></td>
            <td align="center"><?php echo $linha["alteracao"]; ?></td>
            <td align="center"><?php echo $linha["data"]; ?></td>
            <td align="center"><?php echo $linha["hora"]; ?></td>
            <td align="center">
                <a href="valida.php?manut=A&id=<?php echo $linha["codigo"]; ?>">
                    <img src="img/check.png" alt="Alterar">
                </a>
            </td>
            <td align="center">
                <a href="valida.php?manut=E&id=<?php echo $linha["codigo"]; ?>">
                    <img src="img/trash.png" alt="Excluir">
                </a>
            </td>
        </tr>
<?php
}
?>
        </table>
</section>

</body>

</html>

<?php
    mysqli_close($conexao);
?>