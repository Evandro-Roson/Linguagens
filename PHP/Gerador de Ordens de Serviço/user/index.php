<?php

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado1"]) || $_SESSION["logado1"] != TRUE) {
    header("Location: /p2/user/login.php?erro=2");
}

    $json = json_decode(file_get_contents('servicos.json'))->servicos;

    $xml = simplexml_load_file('fornecedores.xml') -> fornecedores;
?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="CSS/style_index.css">
</head>

<body>
    <div class="header">
        <a href="encerrasession.php">
            <input type="button"  value="Encerrar">
        </a>
        <a href="#">
            <input type="button"  value="Fornecedores"  data-toggle="modal" data-target="#ExemploModalCentralizado">
        </a>
    </div>
    <div class="logo">
        <img src="Imagens/logo-roson.png" alt="Logo">
    </div>
    <section>
        <div class="section">
            <h1>Serviços</h1>
            <form action="form.php" method="post">
                <input type="hidden" name="num" value="<?php echo $ordem; ?>">
                <?php
                    foreach ($json as $key) {
                        echo 
                        "<div class='button'>
                            <div class='button1'>
                                <input type='submit' name='submit' value='".$key->bt1."'>
                            </div>
                            <div class='button2'>
                                <input type='submit' name='submit' value='".$key->bt2."'>
                            </div>
                        </div>";
                    }
                ?>
            </form>
        </div>
    </section>

    <div class="modal fade" id="ExemploModalCentralizado" tabindex="-1" role="dialog" aria-labelledby="TituloModalCentralizado" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="TituloModalCentralizado">Fornecedores</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">Nome</th>
                            <th scope="col">Telefone</th>
                            <th scope="col">Site</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                            foreach($xml -> fornecedor as $fornecedor){
                                echo 
                                "<tr>
                                    <td>".utf8_decode($fornecedor->nome)."</td>
                                    <td>".utf8_decode($fornecedor->telefone)."</td>
                                    <td>".utf8_decode($fornecedor->site)."</td>
                                </tr>";
                            }
                        ?>
                    </tbody>
                </table>
                
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
            </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>

</html>