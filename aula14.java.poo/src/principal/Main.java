package principal;

import java.util.Scanner;

import figuras.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do Triângulo X");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite as medidas do Triângulo Y");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("Area de X: %.2f \n", areax);
		System.out.printf("Area de Y: %.2f \n", areay);
		
		if (areax > areay) {
			System.out.println("X tem a maior área.");
		} else {
			System.out.println("Y tem a maior área.");
		}
	}
}
