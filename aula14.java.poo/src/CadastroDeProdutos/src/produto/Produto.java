package produto;

import java.util.Scanner;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	Scanner sc = new Scanner(System.in);
	
	public double valorTotal() {
		return preco * quantidade;
		
	}
	
	public void addProdutos() {
		
		System.out.printf("Qtos produtos serão adicionados ao estoque? ");
		int qtos = sc.nextInt();
		quantidade += qtos;
		valorTotal();
		mostraProdutos();
		
	}
	
	public void removerProdutos() {
		
		System.out.printf("Qtos produtos serão removidos do estoque? ");
		int qtos = sc.nextInt();
		if (qtos > quantidade) {
			System.out.println("Esta quantidade excede o total em estoque!");
		} else {
			quantidade -= qtos;	
		}
		valorTotal();
		mostraProdutos();
		
	}
	
	public void cadastrarProduto() {
		System.out.printf("Nome: ");
		nome = sc.next();
		System.out.printf("Valor: ");
		preco = sc.nextDouble();
		System.out.printf("Quantidade em Estoque: ");
		quantidade = sc.nextInt();
		valorTotal();
		mostraProdutos();
		
		
	}
	
	void mostraProdutos(){
		System.out.printf("Nome: %s - Preço: R$ %.2f - Quantidade: %s - Total: R$ %.2f \n", nome, preco, quantidade, valorTotal());
		System.out.printf("------------------------------------------------------\n");
	}
	
}
