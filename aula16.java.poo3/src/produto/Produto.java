package produto;


public class Produto {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto() {}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
	}
	
	public Produto(String nome, double preco, int quantidade) {
		if (quantidade == 0) {
			this.quantidade = 1;
		}
	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	public double valorTotal() {
		return preco * quantidade;
	}
	
	public void addProdutos(int qtos) {
		
		quantidade += qtos;
		valorTotal();
		mostraProdutos();
		
	}
	
	public void removerProdutos(int qtos) {
		
		if (qtos > quantidade) {
			System.out.println("Esta quantidade excede o total em estoque!");
		} else {
			quantidade -= qtos;	
		}
		valorTotal();
		mostraProdutos();
		
	}
	
	public void mostraProdutos(){
		System.out.printf("Nome: %s - Preço: R$ %.2f - Quantidade: %s - Total: R$ %.2f \n", nome, preco, quantidade, valorTotal());
		System.out.printf("------------------------------------------------------\n");
	}
	
}
