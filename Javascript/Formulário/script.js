function enviar() {
    if (validaNome() && validaSexo() && validaNascimento() && validaMarca() && validaModelo() && validaFabricacao() && validaValor() && validaBonus()) {
        valorFinal.value = "Formulário enviado com sucesso!"
        valorFinal.style.color = 'green'
    }
}

function validaSexo() {
    var sexoLow = sexo.value.toLowerCase()
    if (sexo.value.trim() === "") {
        mensagem.innerHTML = "Preencha o Sexo!"
        $("#alerta").modal('show')
        sexo.style.background = 'yellow'
        return false
    }
    else if (sexoLow != 'f' && sexoLow != 'm') {
        mensagem.innerHTML = "Sexo inválido!"
        $("#alerta").modal('show')
        sexo.style.background = 'yellow'
        return false
    } else {
        sexo.style.background = 'white'
        return true
    }
}

function validaNascimento() {
    if (nascimento.value.trim() === "") {
        mensagem.innerHTML = "Preencha o Ano de Nascimento!"
        $("#alerta").modal('show')
        nascimento.style.background = 'yellow'
        return false
    } else if (nascimento.value > 2001 || nascimento.value < 1901){
        mensagem.innerHTML = "Nascimento entre 1901 e 2001!"
        $("#alerta").modal('show')
        nascimento.style.background = 'yellow'
        return false
    } else {
        nascimento.style.background = 'white'
        return true
    }
}

function validaFabricacao() {
    if (fabricacao.value.trim() === "") {
        mensagem.innerHTML = "Preencha o Ano de fabricacao!"
        $("#alerta").modal('show')
        fabricacao.style.background = 'yellow'
        return false
    } else if (fabricacao.value % 1 != 0 || fabricacao.value < 0){
        mensagem.innerHTML = "Preencha o ano de fabricação com números inteiros e positivos!"
        $("#alerta").modal('show')
        fabricacao.style.background = 'yellow'
        return false
    } else {
        fabricacao.style.background = 'white'
        return true
    }
}

function validaValor() {
    if (valor.value.trim() === "") {
        mensagem.innerHTML = "Preencha o valor do automóvel!"
        $("#alerta").modal('show')
        valor.style.background = 'yellow'
        return false
    } else if (valor.value % 1 === 0 || valor.value < 0){
        mensagem.innerHTML = "Preencha o valor do automóvel com números reais positivos!"
        $("#alerta").modal('show')
        valor.style.background = 'yellow'
        return false
    } else {
        valor.style.background = 'white'
        return true
    }
}

function validaBonus() {
    if (bonus.value.trim() === "") {
        mensagem.innerHTML = "Preencha o valor do bônus!"
        $("#alerta").modal('show')
        bonus.style.background = 'yellow'
        return false
    } else if (bonus.value > 25 || bonus.value < 0){
        mensagem.innerHTML = "Preencha o bônus do automóvel com números positivos entre 0 e 25!"
        $("#alerta").modal('show')
        bonus.style.background = 'yellow'
        return false
    } else {
        bonus.style.background = 'white'
        return true
    }
}

function validaNome() {
    if (nome.value.trim() === "") {
        mensagem.innerHTML = "Preencha o nome!"
        $("#alerta").modal('show')
        nome.style.background = 'yellow'
        return false
    } else { 
        nome.style.background = 'white'
        return true
    }
}

function validaMarca() {
    if (marca.value.trim() === "") {
        mensagem.innerHTML = "Preencha a marca!"
        $("#alerta").modal('show')
        marca.style.background = 'yellow'
        return false
    } else { 
        marca.style.background = 'white'
        return true
    }
}

function validaModelo() {
    if (modelo.value.trim() === "") {
        mensagem.innerHTML = "Preencha o modelo!"
        $("#alerta").modal('show')
        modelo.style.background = 'yellow'
        return false
    } else { 
        modelo.style.background = 'white'
        return true
    }
}