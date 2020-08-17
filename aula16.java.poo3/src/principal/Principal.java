package principal;

import java.util.Scanner;

import conta.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		
//		Produto tv = new Produto("TV", 900);
//		Produto notebook = new Produto("Notebook", 1900, 10);
//
//		System.out.println(tv.getQuantidade());
//		System.out.println(notebook.getNome());
		
		
		
		//CONTA BANCÁRIA
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println(" BEM-VINDO AO BANCO Q1");
		System.out.printf("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.printf("%s, Você deseja realizar um depóstio inicial [S/N]?", nome);
		sc.nextLine();
		char simNaoDeposito = sc.next().toUpperCase().charAt(0);
		
		if (simNaoDeposito == 'S') {
			System.out.printf("Certo. Digite o valor do depósito: R$ ");
			double depInicial = sc.nextDouble();
			
			System.out.printf("PARABÉNS, %s! Você já é um cliente Q1! Seguem seus dados da conta.\n", nome);
			ContaBancaria conta1 = new ContaBancaria(nome, 1, depInicial);
			System.out.println(conta1.toString());
			
			System.out.printf("Quanto você quer depositar? R$ ");
			double valor = sc.nextDouble();
			conta1.deposito(valor);
			System.out.println(conta1.toString());
			
			System.out.printf("Quanto você quer sacar? R$ ");
			double valorSaque = sc.nextDouble();
			conta1.saque(valorSaque);
			System.out.println(conta1.toString());
			
			
		} else {
			System.out.printf("PARABÉNS, %s! Você já é um cliente Q1! Seguem seus dados da conta.\n", nome);
			ContaBancaria conta1 = new ContaBancaria(nome, 1);
			System.out.println(conta1.toString());
			
			System.out.printf("Quanto você quer depositar? R$ ");
			double valor = sc.nextDouble();
			conta1.deposito(valor);
			System.out.println(conta1.toString());
			
			System.out.printf("Quanto você quer sacar? R$ ");
			double valorSaque = sc.nextDouble();
			conta1.saque(valorSaque);
			System.out.println(conta1.toString());
		}		
	
		sc.close();
		
	}

}
