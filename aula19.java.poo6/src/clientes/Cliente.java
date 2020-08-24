package clientes;

import contas.Conta;

public class Cliente {

	private Integer id;
	private String sobrenome;
	private String rg;
	private String cpf;
	private Conta conta;
	
	public Cliente() {
	}

	public Cliente(Integer id, String sobrenome, String rg, String cpf, Conta conta) {
		this.id = id;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getId() {
		return id;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public Conta getConta() {
		return conta;
	}
	
	
}
