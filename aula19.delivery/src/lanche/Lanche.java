package lanche;

public class Lanche {

	private Double preco;
	
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double tempoEntrega(double km) {
		return tempoPreparo() + km*10;
	}
	
	public Double tempoPreparo() {return null;}
}
