package voadores;

public class Pato implements Voador {

	private Integer energia = 100;
	
	@Override
	public void voar() {
		if (energia == 0) {
			System.out.println("O pato morreu!");
		} else {
			energia -= 5;
			System.out.println("Estou voando como um pato!");
		}

	}

}
