package conta;

public class ContaBancaria {

	private String nomeTitular;
	private Integer numeroConta;
	private Double saldo;
	
	
	public ContaBancaria(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	
	public ContaBancaria(String nomeTitular, int numeroConta, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = depositoInicial;

	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		if (valor > this.saldo + 5) {
			System.out.println("ATENÇÃO! Você está com SALDO NEGATIVO!");
		} 
	
		this.saldo -= valor + 5;
	}

	@Override
	public String toString() {
		return "Titular: " + nomeTitular + "\nNum. Conta: " + numeroConta + "\nSaldo: " + saldo;
	}
	
	
	
	
}
