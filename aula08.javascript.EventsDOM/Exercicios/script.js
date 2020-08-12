function ola() {
    alert("Olá, navegante!");
}

var body = document.getElementById("body");

function fundoVerde() {
    body.style.backgroundColor = "green";   
}

var img = document.getElementById("imgcode");

function verImagem() {
    console.log("Estou vendo a imagem!")
    img.style.width = "900px";
}

function naoVerImagem() {
    img.style.width = "500px";
}

var imgWorry = document.getElementById("imgworry");

imgWorry.addEventListener("click", () => {
    console.log("Estou clicando na imagem!");
    console.log(event.clientX + " X " + event.clientY)
});


body.onclick = function() { this.style.backgroundColor = "red"; } //utilizei o "addEventListener", mas aí não funciona o onclick depois.

body.onclick = "";


var seg = 0;
function tempo() {



    console.log(seg);

    if (seg == 10){
        clearTimeout(timer);
        alert("Acabou seu tempo!");
        return false;
    }

    if (seg % 5 == 0 && seg != 0 && seg != 10){
        alert("Intervalo!");
    }

    timer = setTimeout("tempo()", 1000);
    
    seg++

}

document.addEventListener("onload", tempo());


