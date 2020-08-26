package aula19.java.impressora;

public class Contrato extends Papel implements Imprimivel {

	public Contrato() {
		super();
	}
	
	public Contrato(String nome, String tipo) {
		super(nome, tipo);
	}

	@Override
	public String toString() {
		return "Contrato [nome: " + super.getNome() + ", tipo: " + super.getTipo() + "]";
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um documento do Word.");
		System.out.println(this);
	}

}
