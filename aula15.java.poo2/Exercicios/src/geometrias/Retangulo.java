package geometrias;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (largura*2)+(altura*2);
	}
	
	public double diagonal() {
		
		return Math.sqrt((largura*largura) + (altura*altura));
		
	}
	
	@Override
	public String toString() {
		return String.format("Área: %.2f \nPerímetro: %.2f \nDiagonal: %.2f", area(), perimetro(), diagonal());
	}

}
