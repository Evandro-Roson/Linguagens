$(document).ready(function () {
    $("#obter").click(function () {
        $.ajax({
            url: "http://worldclockapi.com/api/json/utc/now",
            success: function (resultado) {
                var now = resultado.currentDateTime
                var hora = now.substring(11, 13)
                var horaMin = now.substring(11, 16)
                var data = now.substring(0, 10)
                hora = parseInt(hora, 10)
                $("#res").html("Data: " + data + " Horário: " + horaMin);
                if (hora < 18 && hora > 5) {
                    $("#imgres").html("<img src='day.jpg' alt='dia'>")
                } else {
                    $("#imgres").html("<img src='night.jpg' alt='noite'>")
                }
            }
        })
    });
});