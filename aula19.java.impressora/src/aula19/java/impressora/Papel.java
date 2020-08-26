package aula19.java.impressora;

public abstract class Papel {

	private String nome;
	private String tipo;
	
	public Papel() {}
	
	public Papel(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
