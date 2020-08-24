package contas;

public class ContaPoupanca extends Conta {
	
	private final Double txJuros = 0.2;

	@Override
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	@Override
	public void sacar(double valorSaque) {
		if (this.saldo < valorSaque) {
			System.out.printf("Valor não disponível para saque! Saldo total: R$ %.2f \n", this.saldo);
		} else {
			this.saldo -= valorSaque;
		}
		
	}
	
	public void recolherJuros() {

		double rendimento = this.saldo * this.txJuros;

		this.saldo += rendimento;
		
		System.out.printf("Você recolheu R$ %.2f em juros.", rendimento);
	}

	@Override
	public void verSaldo() {
		System.out.println(this.saldo);
	}
	
	
}
