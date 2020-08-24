package contas;

public class ContaCorrente extends Conta {

	private Double limite;
	private Double limiteFlutuante = limite;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Double saldo, Double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	@Override
	public void depositar(double valorDeposito) {
		this.saldo += completarLimite(valorDeposito);
	}

	@Override
	public void sacar(double valorSaque) {
		if (valorSaque > this.saldo+this.limiteFlutuante) {
			System.out.println("Você extrapolou o limite. Impossível sacar!");
		} else if (valorSaque > this.saldo) {
			this.saldo -= valorSaque;
			this.limiteFlutuante -= this.saldo-valorSaque;
		} else {
			this.saldo -= valorSaque;	
		}
	
	}
	
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}

	@Override
	public void verSaldo() {
		System.out.printf("Saldo: R$ %.2f \nLimite: R$ %.2f", this.saldo, this.limiteFlutuante);
	}
	
	private Double completarLimite(double valor) {
		
		Double diff = 0.0;
		if (this.limiteFlutuante < this.limite) {
			diff = this.limite - this.limiteFlutuante;
			this.limiteFlutuante = this.limite;
		}
		return valor-diff;
	}
	
}
