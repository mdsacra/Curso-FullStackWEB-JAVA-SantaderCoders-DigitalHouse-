package aula19.java.impressora;

public class Documento extends Papel implements Imprimivel {

	public Documento() {
		super();
	}
	
	public Documento(String nome, String tipo) {
		super(nome, tipo);
	}

	@Override
	public String toString() {
		return "Documento [nome: " + super.getNome() + ", tipo: " + super.getTipo() + "]";
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um documento do Word.");
		System.out.println(this);
	}
	
}
