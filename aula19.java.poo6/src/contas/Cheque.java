package contas;

public class Cheque {

	private Double valor;
	private String banco;
	private String data;
	
	public Cheque(Double valor, String banco, String data) {
		this.valor = valor;
		this.banco = banco;
		this.data = data;
	}

	
	public String getBanco() {
		return banco;
	}



	public String getData() {
		return data;
	}



	public Double getValor() {
		return valor;
	}
	
	
	
}
