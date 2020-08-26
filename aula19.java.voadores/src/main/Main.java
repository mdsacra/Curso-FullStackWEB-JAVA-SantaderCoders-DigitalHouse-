package main;

import torredecontrole.TorreControle;
import voadores.Aviao;
import voadores.Pato;
import voadores.SuperHomem;

public class Main {

	public static void main(String[] args) {
		
		TorreControle torre1 = new TorreControle();
		
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem sh = new SuperHomem();
		
		torre1.adicionarVoador(pato);
		torre1.adicionarVoador(aviao);
		torre1.adicionarVoador(sh);
		
		torre1.voemTodos();
		
	}

}
