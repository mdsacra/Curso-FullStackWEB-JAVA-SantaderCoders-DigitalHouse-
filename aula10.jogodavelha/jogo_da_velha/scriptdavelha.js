var rodada = 1;
var matriz_jogo = Array(3);

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;

$(document).ready(function(){

    $('#btn_iniciar_jogo').click(function(){

        if($("#entrada_apelido_jogador_1").val() == "" || $("#entrada_apelido_jogador_2").val() == ""){
            alert("Os apelidos precisam ser preenchidos!");
            return false;
        }

        $("#nome_jogador_1").html($("#entrada_apelido_jogador_1").val());

        $("#nome_jogador_2").html($("#entrada_apelido_jogador_2").val());

        $("#pagina_inicial").hide();
        $("#palco_jogo").show();
    })

    $(".jogada").click(function(){
        var id_campo_clicado = this.id;

        $("#"+id_campo_clicado).off();
        jogada(id_campo_clicado);
    })

    function jogada(id){
        var icone = "";
        var ponto = 0;

        if(rodada % 2 == 1){
            icone = "url('imagens/marcacao_1.png')";
            ponto = -1;
        } else {
            icone = "url('imagens/marcacao_2.png')";
            ponto = 1;
        }

        rodada++;

        

        $("#"+id).css("background-image", icone);

        var linha_coluna = id.split('-');

        matriz_jogo[linha_coluna[0]][linha_coluna[1]] = ponto;

        verifica_combinacao();
    }

    function verifica_combinacao(){
        
        var pontos = 0;
        for(i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['a'][i];
        }
        ganhador(pontos);

        pontos = 0;
        for(i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['b'][i];
        }
        ganhador(pontos);

        pontos = 0;
        for(i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['c'][i];
        }
        ganhador(pontos);

        pontos = 0;
        for(i = 1; i <= 3; i++) {
            pontos += matriz_jogo['a'][i];
            pontos += matriz_jogo['b'][i];
            pontos += matriz_jogo['c'][i];

            ganhador(pontos);
        }

        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];

        pontos = 0;
        pontos = matriz_jogo['c'][1] + matriz_jogo['b'][2] + matriz_jogo['a'][3];
        
    }

    function ganhador(pontos){
        if (pontos == -3){
            
            $("#vencedor").html($("#entrada_apelido_jogador_1").val() + " VENCEU!!!").css("display", "block");
            $(".jogada").off().css("display", "none");
        } else if (pontos == 3){
            $("#vencedor").html($("#entrada_apelido_jogador_1").val() + " VENCEU!!!").css("display", "block");
            $(".jogada").off().css("display", "none");
        }
    }

})