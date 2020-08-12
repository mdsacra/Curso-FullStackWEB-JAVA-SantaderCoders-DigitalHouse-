function iniciaJogo(){

    var url = window.location.search;

    var nivelJogo = url.replace("?", "");

    var tempoSegundos = 0;

    switch(nivelJogo){
        case '1':
            tempoSegundos = 120;
            break;
        case '2':
            tempoSegundos = 60;
            break;
        case '3':
            tempoSegundos = 30;
            break;
    }

    document.getElementById('cronometro').innerHTML = tempoSegundos;

    var qtdBaloes = 20;

    document.getElementById('baloes_inteiros').innerHTML = qtdBaloes;
    document.getElementById('baloes_estourados'). innerHTML = 0;

    criaBaloes(qtdBaloes);

    contagemTempo(tempoSegundos + 1);
}

function criaBaloes(qtdBaloes){

    for(i = 1; i <= qtdBaloes; i++){
        var balao = document.createElement("img");
        balao.src = "imagens/balao_azul_pequeno.png";
        balao.style.margin = '10px';
        balao.id = 'b' + i;
        balao.onclick = function(){ estourar(this); };
        document.getElementById('cenario').appendChild(balao);
    }
}

function contagemTempo(segundos){ 
    
    segundos = segundos - 1;
    
    if(segundos == -1){ 
        clearTimeout(timerId);
        gameOver();
        return false; }
    
    document.getElementById('cronometro').innerHTML = segundos;

    timerId = setTimeout("contagemTempo("+segundos+")", 1000);
} 

function gameOver(){
    alert("Você perdeu!!!");
}

function estourar(e){
    var id_balao = e.id;

    document.getElementById(id_balao).setAttribute("onclick", "");
    document.getElementById(id_balao).src = 'imagens/balao_azul_pequeno_estourado.png';

    pontuacao(-1);
}

function pontuacao(acao){ 
    var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;

    var baloes_estourados = document.getElementById('baloes_estourados').innerHTML;

    baloes_inteiros = parseInt(baloes_inteiros); baloes_estourados = parseInt(baloes_estourados); baloes_inteiros = baloes_inteiros + acao; baloes_estourados = baloes_estourados - acao; 
    
    document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;

    document.getElementById('baloes_estourados').innerHTML = baloes_estourados;
    
    situacao_jogo(baloes_inteiros); 
} 

function situacao_jogo(baloes_inteiros){ 
    if(baloes_inteiros == 0){ 
        alert('Parabéns, você conseguiu estourar todos os balões a tempo'); 
        parar_jogo(); 
    } 
} 

function parar_jogo(){ 
    clearTimeout(timerId); 
} 