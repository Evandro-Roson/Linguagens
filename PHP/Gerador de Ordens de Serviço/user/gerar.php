<?php 
$conexao = mysqli_connect("localhost", "root", "", "roson tech") or die("Erro de conexão com localhost, o seguinte erro ocorreu ->");

session_start();
 
//Verifico se o usuário está logado no sistema
if (!isset($_SESSION["logado1"]) || $_SESSION["logado1"] != TRUE) {
    header("Location: /p2/user/login.php?erro=2");
}
    if (isset($_POST['num'])) $ordem = $_POST['num'];
    else $ordem = 1;
    //recebendo valores do post
    if(isset($_POST['servico'])) $servico = $_POST['servico']; 
    else $servico = NULL;
    if(isset($_POST['nome'])) $nome = $_POST['nome']; 
    else $nome = NULL;
    if(isset($_POST['end'])) $end = $_POST['end']; 
    else $end = NULL;
    if(isset($_POST['n'])) $n = $_POST['n']; 
    else $n = NULL;
    if(isset($_POST['tel'])) $tel = $_POST['tel']; 
    else $tel = NULL;
    if(isset($_POST['email'])) $email = $_POST['email']; 
    else $email = NULL;
    if(isset($_POST['tipo'])) $tipo = $_POST['tipo']; 
    else $tipo = NULL;
    if(isset($_POST['marca'])) $marca = $_POST['marca']; 
    else $marca = NULL;
    if(isset($_POST['modelo'])) $modelo = $_POST['modelo']; 
    else $modelo = NULL;
    if(isset($_POST['desc'])) {
        $desc = $_POST['desc']; 
        $desc = trim($desc);
    } else $desc = NULL;
    if(isset($_POST['valor'])) $valor = $_POST['valor']; 
    else $valor = 0;
    if(isset($_POST['desconto'])) $desconto = $_POST['desconto']; 
    else $desconto = 0;
    if(isset($_POST['parcela'])) $parcela = $_POST['parcela']; 
    else $parcela = 1;

    //calculos
    $valorComDesconto = ((100 - $desconto) / 100) * $valor;
    $valor_parcela = $valorComDesconto / $parcela;
    $valorParcelaEmReal = number_format($valor_parcela, 2, ',', '.');
    $valorEmReal = number_format($valorComDesconto, 2, ',', '.');
    $valor = number_format($valor, 2, ',', '.');

    //escrita no arquivo
    $meuArquivo = "Ordem$ordem.txt";
    $arquivo = fopen("Ordens/$meuArquivo",'w');
    fwrite($arquivo, 
    "Serviço: $servico\n
    ==============================================\n
    Nome: $nome\n
    Logradouro: $end\n
    Nº: $n\n
    Telefone: $tel\n
    Email: $email\n
    Tipo da máquina: $tipo\n
    Marca: $marca\n
    Modelo: $modelo\n
    Descrição do serviço: $desc\n
    Valor do serviço: R$ $valor\n
    Desconto: $desconto%\n
    Quantidade de parcelas: $parcela\n
    ==============================================\n
    Valor com Desconto: R$ $valorEmReal\n
    Valor da parcela: $parcela X de R$ $valorParcelaEmReal\n
    ");
    fclose($arquivo);

    mysqli_query($conexao, "INSERT INTO `ordem_de_servico` (`n`, `nome`, `endereco_logradouro`, `endereco_n`, `endereco_cep`, `endereco_bairro`, `telefone`, `email`, `tipo_da_maquina`, `modelo_da_maquina`, `descricao_do_servico`, `valor`, `desconto`, `n_parcelas`, `marca_da_maquina`, `codigo`) VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);");

    //envio de email
    use PHPMailer\PHPMailer\PHPMailer;
    use PHPMailer\PHPMailer\SMTP;
    use PHPMailer\PHPMailer\Exception;

    require 'vendor/autoload.php';

    $mail = new PHPMailer(true);

try {
    //$mail->SMTPDebug = SMTP::DEBUG_SERVER;                      
    $mail->isSMTP();                                            
    $mail->Host       = 'smtp.gmail.com';                     
    $mail->SMTPAuth   = true;                                   
    $mail->Username   = 'evandroroson@gmail.com';                     
    $mail->Password   = 'vlledvhakbxtfizy';                               
    $mail->SMTPSecure = PHPMailer::ENCRYPTION_SMTPS;            
    $mail->Port       = 465;                                    
    //TCP port to connect to; use 587 if you have set `SMTPSecure = PHPMailer::ENCRYPTION_STARTTLS`
   
    $mail->setFrom('evandroroson@gmail.com', 'Evandro');
    $mail->addAddress($email, 'Evandro');     
    $atta = "Ordens/$meuArquivo";
    $mail->addAttachment($atta);         
    //$mail->addAttachment('/tmp/image.jpg', 'new.jpg');    
    $mensagem = "<p>Sua ordem de número <b>$ordem</b> foi gerada com sucesso!</p>
    <p>Em anexo, você encontra mais detalhes sobre seu pedido.</p>";
    $mensagem = utf8_decode($mensagem);
    $mensagemAlt = "Sua ordem de número $ordem foi gerada com sucesso!\n
    Em anexo, você encontra mais detalhes sobre seu pedido.";
    $mensagemAlt = utf8_decode($mensagemAlt);
    $assunto = "Roson Tech - Ordem de serviço Nº$ordem";
    $assunto = utf8_decode($assunto);
    $mail->isHTML(true);                                 
    $mail->Subject = $assunto;
    $mail->Body    = $mensagem;
    $mail->AltBody = $mensagemAlt;

    $mail->send();
} catch (Exception $e) {
    echo "Mensagem não enviada. Erro: {$mail->ErrorInfo}";
}

?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerar</title>
    <link rel="stylesheet" href="CSS/style_gerar.css">
</head>

<body>
    
    <div class="logo">
        <img src="Imagens/logo-roson.png" alt="Logo">
    </div>
    <section>
        <div class="section">
            <h2>Ordem de Serviço gerada com sucesso!</h2>
            <form action="index.php" method="post">
                <div class="button">
                    <div class="button1">
                        <input type="submit" name="submit" value="Voltar">
                    </div>
                </div>
            </form>
        </div>
    </section>
</body>

</html>