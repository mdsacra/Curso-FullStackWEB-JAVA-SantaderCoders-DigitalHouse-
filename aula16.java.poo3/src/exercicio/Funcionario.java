package exercicio;


public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;

	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double aumentoSalarial(Double porcentagem) {
				
		return this.salario += this.salario*(porcentagem/100.0);		 
	}

	@Override
	public String toString() {
		
		return String.format("[ID: %s | Nome: %s | Salário: %.2f\n]", this.id, this.nome, this.salario);
	}
	
	
	
	
	

}
