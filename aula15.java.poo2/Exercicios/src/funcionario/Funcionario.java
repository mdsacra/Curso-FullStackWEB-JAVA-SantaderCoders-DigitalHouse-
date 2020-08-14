package funcionario;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double aumentoSalario(double acresc) {
		
		return (salarioLiquido() + ((salarioBruto*acresc)/100));
	}
	
}
