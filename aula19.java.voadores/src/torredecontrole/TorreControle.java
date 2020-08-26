package torredecontrole;

import java.util.ArrayList;
import java.util.List;

import voadores.Voador;

public class TorreControle {

	List<Voador> voadores = new ArrayList<>();
	
	public void voemTodos() {
		for (Voador v: voadores) {
			v.voar();
		}
	}
	
	public void adicionarVoador(Voador v) {
		voadores.add(v);
	}
}
