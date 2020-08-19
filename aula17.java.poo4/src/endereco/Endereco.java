package endereco;

public class Endereco {
	
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, Integer numero, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return String.format("Rua %s, nº %s - Bairro %s - %s/%s\n", rua, numero, bairro, cidade, estado);
	}

	
	
	
}
