package lanche;

import java.util.Scanner;

public class Massa extends Lanche{

	private String molho;
	private TiposMassas tipo;
	
	@Override
	public Double tempoPreparo() {
		
		return 30.0;
	}
	
	public void montar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual massa você deseja?");
		System.out.println("[1] Macarrão - [2] Pizza - [3] Lasanha");
		int massa = sc.nextInt();
		System.out.println("Qual molho você deseja?");
		System.out.println("[1] Pesto - [2] Tomate - [3] Queijos");
		int molho = sc.nextInt();
		
		switch (massa) {
		case 1:
			this.tipo = TiposMassas.MACARRAO;
			super.setPreco(20.00);
			break;
		case 2:
			this.tipo = TiposMassas.PIZZA;
			super.setPreco(15.00);
			break;
		case 3:
			this.tipo = TiposMassas.LASANHA;
			super.setPreco(28.00);
			break;
		}
		
		switch (molho) {
		case 1:
			this.molho = "Pesto";
			break;
		case 2:
			this.molho = "Tomate";
			break;
		case 3:
			this.molho = "Queijos";
			break;
		}
		
		System.out.printf("%s com molho de %s.\n", tipo, this.molho);
		
	}
}
