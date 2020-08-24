package main;

import java.util.Scanner;

import lanche.Bolo;
import lanche.Lanche;
import lanche.Massa;
import lanche.Sanduiche;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lanche lanche = new Lanche();
		
		System.out.println("Faça seu pedido:\n[1] Sanduíche - [2] Massa - [3] Bolo");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			Sanduiche sanduiche = new Sanduiche();
			sanduiche.montar();
			lanche = sanduiche;
			break;
			
		case 2:
			Massa massa = new Massa();
			massa.montar();
			lanche = massa;
			break;
			
		case 3:
			Bolo bolo = new Bolo();
			bolo.montar();
			lanche = bolo;
			break;
			
		}
		
		System.out.printf("Digite sua distância em KM: ");
		double km = sc.nextDouble();
		
		System.out.printf("Seu pedido custou R$ %.2f e chegará em %s minutos.", lanche.getPreco(), lanche.tempoEntrega(km));
		
		
		
		
	}

}
