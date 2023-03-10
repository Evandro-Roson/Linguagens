function abreModal() {
    if (!validaValor() || !validaQtd() || !validaDesc()) {
        mensagem.innerHTML = "Preencha todos os campos!"
        $("#alerta").modal('show')
        valorFinal.value = null
    } else if (desc.value > 100 || desc.value < 0) {
        mensagem.innerHTML =  "Valores de desconto não podem ser maiores que 100 e menores que 0!"
        $("#alerta").modal('show')
        valorFinal.value = null
    } else return true;
}
function validaValor() {
    if (v.value.trim() === "") {
        v.style.background = 'yellow'
        return false;
    } else {
        v.style.background = 'white'
        return true;
    }
}
function validaQtd() {
    if (qt.value.trim() === "") {
        qt.style.background = 'yellow'
        return false;
    } else {
        qt.style.background = 'white'
        return true;
    }
}
function validaDesc() {
    if (desc.value.trim() === "") {
        desc.style.background = 'yellow'
        return false;
    } else {
        desc.style.background = 'white'
        return true;
    }
}          

function calcular() {
    var desconto = parseInt(desc.value)
    if (abreModal()) {
        let precoFinal = (parseFloat(v.value) * parseFloat(qt.value)) * ((100 - desconto) / 100)
        valorFinal.value = precoFinal
    }
}