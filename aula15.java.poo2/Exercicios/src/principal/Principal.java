package principal;

import java.util.Scanner;

import geometrias.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		//AUMENTANDO O SALARIO
//		Funcionario func1 = new Funcionario();
//		
//		System.out.println("Digite os dados do funcionário:");
//		System.out.printf("Nome: ");
//		func1.nome = sc.next();
//		System.out.printf("Salário Bruto: ");
//		func1.salarioBruto = sc.nextDouble();
//		System.out.printf("Taxa: ");
//		func1.taxa = sc.nextDouble();
//
//		System.out.printf("Funcionário: " + func1.nome + ", R$ " + func1.salarioLiquido() + "\n");
//		
//		System.out.printf("Qual a taxa de aumento? ");
//		double taxaAumento = sc.nextDouble();
//		
//		System.out.printf("Dados atualizados: " + func1.nome + ", " + "R$ " + func1.aumentoSalario(taxaAumento));
		
		
		
		//CALCULANDO RETANGULOS
		Retangulo retangulo = new Retangulo();
		
		System.out.printf("Digite a largura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.printf("Digite a altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		
//		//CALCULANDO NOTA FINAL
//		
//		Aluno aluno = new Aluno();
//		
//		System.out.println("ENTRE COM OS DADOS DO ALUNO");
//		System.out.printf("Nome: ");
//		aluno.nome = sc.nextLine();
//		System.out.printf("Nota 1: ");
//		aluno.nota1 = sc.nextDouble();
//		System.out.printf("Nota 2: ");
//		aluno.nota2 = sc.nextDouble();
//		System.out.printf("Nota 3: ");
//		aluno.nota3 = sc.nextDouble();
//		
//		aluno.situacao();
		
		
//		//CÁLCULOS COM CÍRCULOS
//		
//		System.out.printf("Circunferência: %.2f\n", Circulo.circunferencia(3));
//		System.out.printf("Volume: %.2f\n", Circulo.volume(3));
//		
		
//		//CONVERSOR PRA DOLAR
//		System.out.printf("Qual a cotação do dólar? $ ");
//		double cotacaoDolar = sc.nextDouble();
//		
//		System.out.printf("Quantos dólares você quer comprar? $ ");
//		double totalDolar = sc.nextDouble();
//		
//		System.out.printf("Total em Reais: R$ %.2f", ConversorMoedas.converter(cotacaoDolar, totalDolar));
//		
		sc.close();
	}

}
