package contas;

public abstract class Conta {

	protected Double saldo;
	
	public Conta() {
	}

	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valorDeposito) {}
	
	public void sacar(double valorSaque) {}
	
	public void verSaldo() {}

}

