function abreModal() {
    if (!validaValor1() || !validaValor2() || !validaValor3() || !validaValor4()) {
        $("#alerta").modal('show')
        mediacalc.value = null
    } else return true;
}
function validaValor1() {
    if (v1.value.trim() === "" || isNaN(v1.value) === true) {
        v1.style.background = 'yellow'
        return false;
    } else {
        v1.style.background = 'white'
        return true;
    }
}
function validaValor2() {
    if (v2.value.trim() === "" || isNaN(v2.value) === true) {
        v2.style.background = 'yellow'
        return false;
    } else {
        v2.style.background = 'white'
        return true;
    }
}
function validaValor3() {
    if (v3.value.trim() === "" || isNaN(v3.value) === true) {
        v3.style.background = 'yellow'
        return false;
    } else {
        v3.style.background = 'white'
        return true;
    }
}    
function validaValor4() {
    if (v4.value.trim() === "" || isNaN(v4.value) === true) {
        v4.style.background = 'yellow'
        return false;
    } else {
        v4.style.background = 'white'
        return true;
    }
}       

function calcular() {
    if (abreModal()) {
        let media = (parseFloat(v1.value) + parseFloat(v2.value) + parseFloat(v3.value) + parseFloat(v4.value)) / 4
        mediacalc.value = media
    }
}