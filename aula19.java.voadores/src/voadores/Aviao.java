package voadores;

public class Aviao implements Voador {

	private Integer horasVoo = 0;
	
	@Override
	public void voar() {
		if (horasVoo > 1000) {
			System.out.println("Este avião não é mais seguro. Não pode mais voar.");
		} else {
			horasVoo += 13;
			System.out.println("Estou voando como um avião!");
		}

	}

}
