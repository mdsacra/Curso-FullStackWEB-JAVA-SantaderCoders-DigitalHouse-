package contato;

import endereco.Endereco;

public class Contato {

	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco endereco;
	
	
	public Contato(Integer id, String nome, Integer idade, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}

	
	
	public Integer getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public Integer getIdade() {
		return idade;
	}



	public String getTelefone() {
		return telefone;
	}



	public Endereco getEndereco() {
		return endereco;
	}


	
	

	@Override
	public String toString() {
		return String.format("------------------------------------\nID: %s | Nome: %s | Idade: %s | Telefone: %s\n | Endereço: %s", id, nome, idade, telefone, endereco);
	}
	
	
	
	
	
	
	
	
	
}
