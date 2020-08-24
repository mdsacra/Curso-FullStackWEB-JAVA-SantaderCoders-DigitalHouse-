package lanche;

import java.util.Scanner;

public class Bolo extends Lanche {

	private String massa;
	private String recheio;
	private String cobertura;
	
	@Override
	public Double tempoPreparo() {
		
		return 10.0;
	}
	
	public void montar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a massa: [1] Preta - [2] Branca");
		int massa = sc.nextInt();
		System.out.println("Escolha o recheio: [1] Chocolate - [2] Frutas - [3] Leite Condensado");
		int recheio = sc.nextInt();
		System.out.println("Escolha a cobertura: [1] Chocolate - [2] Calda de Frutas - [3] Leite Condensado");
		int cobertura = sc.nextInt();
		
		if (massa == 1) {
			this.massa = "Preta";
		} else {
			this.massa = "Branca";
		}
		
		switch (recheio) {
		case 1:
			this.recheio = "Chocolate";
			break;
		case 2:
			this.recheio = "Frutas";
			break;
		case 3:
			this.recheio = "Leite Condensado";
			break;
		}
		
		switch (cobertura) {
		case 1:
			this.cobertura = "Chocolate";
			break;
		case 2:
			this.cobertura = "Calda de Frutas";
			break;
		case 3:
			this.cobertura = "Leite Condensado";
			break;
		}
		
		System.out.printf("Bolo com massa %s, recheio de %s e cobertura de %s.\n", this.massa, this.recheio, this.cobertura);
		
		super.setPreco(14.00);
	}
}
