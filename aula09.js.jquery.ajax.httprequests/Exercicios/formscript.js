function enviar() {
    
    if ($("#nome").val() == "" || $("#snome").val() == "" || $("#senha").val() == "" || $("#confsenha").val() == "" || $("#email").val() == "") {
        alert("ATENÇÃO!!! Todos os campos precisam ser preenchidos!");
        return false;
    }

    if ($("#senha").val() != $("#confsenha").val()){
        alert("As senhas não batem!");
        return false;
    }

    $.post("http://localhost:3000/usuarios",

        {
            "nome": $("#nome").val() + " " + $("#snome").val(),
            "senha" : $("#senha").val(),
            "email" : $("#email").val(),
            "orientacao" : definirOrientacao($("input[name='orisex']").filter(':checked').val()),
            "TI" : $("#areaTI").val()
        }
    )

}

function definirOrientacao(letra){
    switch(letra){
        case "m":
            return "Masculino";
            break;
        case "f":
            return "Feminino";
            break;
        case "l":
            return "Livre";
            break;
    }
}