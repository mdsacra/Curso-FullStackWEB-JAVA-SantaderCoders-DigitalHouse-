package lanche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche {

	private List<String> ingredientes = new ArrayList<>();

	public Sanduiche() {
		
	}

	@Override
	public Double tempoPreparo() {
		
		return 15.0;
	}
	
	public void montar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha seus ingredientes (Min 2 - Máx. 10)(Digite 0 para parar):");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i+" => ");
			String ingr = sc.nextLine();
			if (ingr.equals("0")){
				break;
			}
			ingredientes.add(ingr);
			
		}
		
		System.out.printf("Sanduiche de %s\n", ingredientes);
		
		if (ingredientes.size() < 5) {
			super.setPreco(6.00);
		} else if ( ingredientes.size() < 8) {
			super.setPreco(8.00);
		} else {
			super.setPreco(10.00);
		}
		
	}
	
}


