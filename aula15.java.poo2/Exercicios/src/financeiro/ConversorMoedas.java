package financeiro;

public class ConversorMoedas {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dolar, double valor) {
		return valor*dolar + ((valor*IOF)*dolar);
	}

}
