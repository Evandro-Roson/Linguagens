<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="CSS/style_login.css">
</head>
<body>
    <div class="login-box">
        <h2>Login</h2>
        <form action="validalogin.php" method="post">
          <div class="user-box">
            <input type="text" name="email" required>
            <label>Email</label>
          </div>
          <div class="user-box">
            <input type="password" name="senha" required>
            <label>Senha</label>
          </div>
          <?php
            if (isset($_GET['erro'])) $erro = $_GET['erro'];
            else $erro = 0;
            if ($erro == 1) echo "<p>Login ou senha incorretos!</p>";
            else if ($erro == 2) echo "<p>Digite Login e Senha.</p>";
          ?>
          <div class="button">
            <a href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <input type="submit" name="submit" value="Entrar">
            </a>
          </div>
        </form>
    </div>
</body>
</html>

