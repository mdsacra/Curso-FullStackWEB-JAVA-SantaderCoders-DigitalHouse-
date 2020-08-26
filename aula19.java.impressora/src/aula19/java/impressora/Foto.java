package aula19.java.impressora;

public class Foto extends Papel implements Imprimivel {

	public Foto() {
		super();
	}
	
	public Foto(String nome, String tipo) {
		super(nome, tipo);
	}

	@Override
	public String toString() {
		return "Foto [nome: " + super.getNome() + ", tipo: " + super.getTipo() + "]";
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um documento do Word.");
		System.out.println(this);
	}

}
