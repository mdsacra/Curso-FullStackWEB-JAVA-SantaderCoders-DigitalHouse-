package voadores;

public class SuperHomem implements Voador {

	private Integer experiencia = 0;
	
	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando como um ser de outro planeta!");

	}

}
