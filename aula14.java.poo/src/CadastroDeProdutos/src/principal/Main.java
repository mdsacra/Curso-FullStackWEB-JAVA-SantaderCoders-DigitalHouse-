package principal;

import java.util.Scanner;

import produto.Produto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Produto:");
		
		int i = 1;
		
		while(i == 1) {
			Produto prd = new Produto();
			
			prd.cadastrarProduto();
			
			prd.addProdutos();
			
			prd.removerProdutos();
			
			System.out.println("Deseja continuar cadastrando produtos [1 para SIM]? ");
			
			i = sc.nextInt();
		}
		
		
		
	}

}
