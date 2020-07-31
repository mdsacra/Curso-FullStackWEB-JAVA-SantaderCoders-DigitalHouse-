// // Par ou Ímpar
// function parImpar(n) {
//     if (n % 2 == 0) {
//         console.log("O número " + n + " é PAR.")
//     } else {
//         console.log("O número " + n + " é ÍMPAR.")
//     }
// }

// Números primos
// var numeroPrimo = (n) => {
//     var um = 0;
//     for (x = n-1; x > 0; x--){
//         if (n % x == 0 && x != 1){
//             console.log("O número " + n + " não é PRIMO!")
//             break;
//         }
//         um = x
//     }
//     if (um == 1){
//         console.log("O número " + n + " é PRIMO!");
//     }
// }

// numeroPrimo(99991);

// // Contagem Ano Novo c/ callback
// function anoNovo(callback){
//     setTimeout(function(){
//         console.log("Feliz Ano Novo!");
//     }, 10000)
//     callback();
// }


// function contagem(){
//     var x = 10
//     while(x > 0){
//         setTimeout(function(){
//             console.log(x);
//             x--;
//         }, 1000);
//     }
// }

// anoNovo(contagem);

// //Imprimir notas maiores

// var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

// notas.forEach(function(value, index) {
//     if (value >= 7){
//         console.log(value);
//     }
// });

// // Compras

// var compras = [
//     {
//         produto: "sabão em pó", 
//         valor: 8.90
//     },
//     {
//         produto: "arroz 5kg",
//         valor: 11
    
//     },
//     {
//         produto: "feijão 1kg",
//         valor: 5.90

//     }]

// function totalCompra() {
//     valorTotal = 0;
//     compras.forEach(function(value, index){
//         valorTotal += value.valor;
//     })
//     console.log(valorTotal);
// }

// totalCompra();

// // disciplina para os alunos
// var alunos = [
//     {
//         nome: "João",
//         serie: 8,
//     },

//     {
//         nome: "Maria",
//         serie: 9,
//     },

//     {
//         nome: "Joana",
//         serie: 8,
//     },

//     {
//         nome: "Mercedes",
//         serie: 9,
//     },

//     {
//         nome: "Rogério",
//         serie: 9,
//     }
// ]

// function definirAulas(){

//     alunos.forEach(function(value, index){
//         if (value.serie == 8){
//             value.disciplina = "História";
//         } else {
//             value.disciplina = "Física";
//         }
//     })
// }

// definirAulas();
// console.log(alunos);