package voadores;

public class Aviao implements Voador {

	private Integer horasVoo = 0;
	
	@Override
	public void voar() {
		if (horasVoo > 1000) {
			System.out.println("Este avi�o n�o � mais seguro. N�o pode mais voar.");
		} else {
			horasVoo += 13;
			System.out.println("Estou voando como um avi�o!");
		}

	}

}
