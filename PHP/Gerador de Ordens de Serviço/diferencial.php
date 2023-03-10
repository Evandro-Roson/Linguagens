<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\SMTP;
use PHPMailer\PHPMailer\Exception;
require 'vendor/autoload.php';
$mail = new PHPMailer(true);
try {
    $mail->SMTPDebug = SMTP::DEBUG_SERVER;                      
    $mail->isSMTP();                                            
    $mail->Host       = 'smtp.gmail.com';                     
    $mail->SMTPAuth   = true;                                   
    $mail->Username   = 'seuemail@gmail.com';                     
    $mail->Password   = 'suasenha';                               
    $mail->SMTPSecure = PHPMailer::ENCRYPTION_SMTPS;            
    $mail->Port       = 465;                                    
    $mail->setFrom('exemplo@gmail.com', 'Exemplo');
    $mail->addAddress('exemplo@yahoo.com.br', 'Exemplo');     
    $mail->addAttachment('imagem.png');             
    $mail->isHTML(true);                                 
    $mail->Subject = 'Assunto';
    $mail->Body    = 'Corpo';
    $mail->AltBody = 'Corpo sem formatação';
    $mail->send();
    echo 'Mensagem enviada com sucesso';
} catch (Exception $e) {
    echo "Mensagem não enviada. Erro: {$mail->ErrorInfo}";
}
?>





