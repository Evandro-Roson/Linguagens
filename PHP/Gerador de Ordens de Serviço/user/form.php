<?php
$conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado1"]) || $_SESSION["logado1"] != TRUE) {
    header("Location: /p2/user/login.php?erro=2");
}

$nOrdem = mysqli_query($conexao, "SELECT MAX(n) as n FROM `ordem_de_servico`;");
$nOrdem = mysqli_fetch_array($nOrdem);
if ($nOrdem[0] == NULL) $nOrdem[0] = 0;

if (isset($_POST["submit"])) {
    $servico = $_POST["submit"];
} else $servico = "Formatação Simples";



date_default_timezone_set("America/Sao_Paulo");
$mes = date('M');
$mes_portugues = array(
    'Jan' => 'Janeiro',
    'Feb' => 'Fevereiro',
    'Mar' => 'Março',
    'Apr' => 'Abril',
    'May' => 'Maio',
    'Jun' => 'Junho',
    'Jul' => 'Julho',
    'Aug' => 'Agosto',
    'Sep' => 'Setembro',
    'Oct' => 'Outubro',
    'Nov' => 'Novembro',
    'Dec' => 'Dezembro'
);

?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
    <link rel="stylesheet" href="CSS/style_form.css">
</head>

<body>
    <div >
        <a href="index.php">
            <input name="voltar" type="button" value="Voltar" style="font-size: 18px;
            font-style: oblique;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
            border: 1px black solid;
            background-color: #3ea2ff;
            padding: 15px 32px;
            text-align: center;
            width: 10vw;
            border-radius: 8px;">
        </a>
    </div>
    <h1>Ordem de Serviço Nº<?php echo $nOrdem[0]+1;?></h1>
    <section>
        <div class="section">
            <div class="login-box">
                <h2><?php echo "Serviço: " . $servico ?></h2>
                <form method="POST" action="gerar.php">
                    <input type="hidden" name="servico" value="<?php echo $servico; ?>">
                    <input type="hidden" name="num" value="<?php echo $nOrdem[0]+1; ?>">
                    <h3>Dados do Cliente</h3>
                    <div class="form">
                        <div class="linha">
                            <label class="label-nome">
                                Nome Completo*:
                                <input autofocus type="text" name="nome" id="nome" size="50" required>
                            </label>
                            &emsp;&emsp;
                            <label>
                                Data de Recebimento:
                                <input readonly type="text"  size="25" value="<?php echo "Jundiaí, " . date("d") . " de " . $mes_portugues["$mes"] . " de " . date("Y"); ?>">
                            </label>
                        </div>
                        <div class="linha">
                            <label>
                                Logradouro*:
                                <input type="text" name="end" id="end" size="45" required>
                            </label>
                            &emsp;&emsp;
                            <label>
                                Nº*:
                                <input type="number" name="n" id="n" size="5" required min="0">
                            </label>
                        </div>
                        <div class="linha">
                            <label>
                                Telefone*:
                                <input type="number" name="tel" id="tel" size="11" required min="0">
                            </label>
                            &emsp;&emsp;
                            <label>
                                Email*:
                                <input type="email" name="email" id="email" size="25" required>
                            </label>
                        </div>
                        <h3>Dados da Máquina</h3>
                        <div class="linha">
                            <label>
                                Tipo*:
                                <select name="tipo" id="tipo">
                                    <option value="Desktop">Desktop</option>
                                    <option value="Notebook">Notebook</option>
                                </select>
                            </label>
                            &emsp;&emsp;
                            <label>
                                Marca*:
                                <input type="text" name="marca" id="marca" size="25" required>
                            </label>
                            &emsp;&emsp;
                            <label>
                                Modelo*:
                                <input type="text" name="modelo" id="modelo" size="25" required>
                            </label>
                        </div>
                        <div class="linha">
                            <label>
                                Descrição do Serviço*:
                                <textarea required name="desc" id="desc" cols="80" rows="10">

                                </textarea>
                            </label>
                        </div>
                        <h3>Pagamento</h3>
                        <div class="linha">
                            <label>
                                Valor do Serviço*:
                                <input type="number" name="valor" id="valor" size="10" required min="1" step="0.01">
                            </label>
                            &emsp;&emsp;
                            <label>
                                Desconto(%)*:
                                <input type="number" name="desconto" id="desconto" size="10" required value="0" min="0" max="90">
                            </label>
                            &emsp;&emsp;
                            <label>
                                Quantidade de Parcelas*:
                                <input type="number" name="parcela" id="parcela" size="10" required value="1" min="1" max="5">
                            </label>
                        </div>
                    </div>

                    <a>
                        <div>
                            <span></span>
                            <span></span>
                            <span></span>
                            <span></span>
                            <input class="submit" type="submit" value="Gerar">
                        </div>

                    </a>
                </form>
            </div>
        </div>

    </section>
</body>

</html>