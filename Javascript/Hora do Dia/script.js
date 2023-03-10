function time(t) {
    if (t < 10) {
        t = "0" + t;
    }
    return t;
}
function carregar() {
    var img = document.getElementById("imagem")
    var msg = document.getElementById("msg")
    var data = new Date();  
    var hora = data.getHours();
    var min = data.getMinutes();
    var sec = data.getSeconds();
    hora = time(hora)
    min = time(min)
    sec = time(sec)
    msg.innerHTML = `Agora são ${hora}:${min}:${sec} horas!`
    if (hora < 12) {
        img.src = "manha.jpg"
        document.body.style.background = "#e2cd9f"
    } else if (hora < 18) {
        img.src = "tarde.jpg"
        document.body.style.background = "#b9846f"
    } else {
        img.src = "noite.jpg"
        document.body.style.background = "#515154"
    }
    setTimeout('carregar()',500);
}

