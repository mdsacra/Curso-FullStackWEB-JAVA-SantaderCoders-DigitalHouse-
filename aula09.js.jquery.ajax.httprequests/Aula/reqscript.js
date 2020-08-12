var httpRequest;

function fazerRequisicao(url, destino){

    document.getElementById(destino).innerHTML = "<center><img src='loader.gif'></center>"

    if(window.XMLHttpRequest){ //versoes atuais do browser
        httpRequest = new XMLHttpRequest();
    } else if(window.ActiveXObject){ //IE 4, 5, 6
        try{
            httpRequest = new ActiveXObject("Msxm12.XMLHTTP");
        } catch(e){
            try{ 
                httpRequest = new ActiveXObject("Microsoft.XMLHTTP"); //IE inferior 
            }catch(e){ 
                alert("Impossível instanciar o objeto XMLHttpRequest para esse navegador/versão"); 
            }
        }

    } 

    if(!httpRequest){
        alert("Erro ao tentar criar uma instância do objeto XMLHttpRequest"); return false; 
    } 

    httpRequest.onreadystatechange = situacaoRequisicao;

    httpRequest.open("GET", url);
    httpRequest.send();

}


function situacaoRequisicao() {
    if(httpRequest.readyState == 4){
        if (httpRequest.status == 200){
            document.getElementById("div_conteudo"). innerHTML = httpRequest.responseText;
        }
    }
}