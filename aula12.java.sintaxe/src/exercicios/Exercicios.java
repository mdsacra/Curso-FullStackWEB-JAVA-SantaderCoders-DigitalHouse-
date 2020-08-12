package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite sua idade: ");
		
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Você tem " + idade + " anos. Você ainda é MENOR DE IDADE!");
		} else {
			System.out.println("Você tem " + idade + " anos. Você já é MAIOR DE IDADE!");
			System.out.println("Você possui carteira de motorista [S/N] ?");
			
			String simNao = sc.next().toUpperCase();
			System.out.println(simNao);
			
//			while (!(simNao.equals("S")) || !(simNao.equals("N"))) {
//				System.out.println("Você não digitou nem SIM nem NÃO! Tente novamente!");
//				simNao = sc.next().toUpperCase();
//				System.out.println(simNao);
//
//			}
			
			if (simNao.equals("S")) {
				System.out.println("Parabéns!!! Você já pode dirigir!");
			} else {
				System.out.println("Hmmm! Dirija-se (a pé) ao DETRAN mais próximo de você!");
			}
			
		}
		
		
		// É FIM DE SAMANA ??
		
		System.out.println("Digite um dia da semana: ");
		
		String[] diasSemana = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
		
		String dia = sc.next().toLowerCase();
		
		
		if (dia.equals("sábado") || dia.equals("domingo")) {
			System.out.println("OBA! Hoje é " + dia + "! Fim de Semana!");
		} else {
			System.out.println("Ainda não é fim de semana! Vamos trabalhar!");
		}
		
	}

}
