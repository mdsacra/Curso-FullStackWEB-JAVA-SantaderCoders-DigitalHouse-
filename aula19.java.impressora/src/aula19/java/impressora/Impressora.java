package aula19.java.impressora;

import java.util.ArrayList;
import java.util.List;

public abstract class Impressora {
	
	private static List<Papel> imprimiveis = new ArrayList<>();
	
	public static void imprimirTudo() {
		System.out.println("-------IMPRESSÕES-------");
		for (Papel papel: imprimiveis) {
			System.out.println(papel);
		}
		System.out.println("------------------------");
	}
	
	public static void adicionarImprimivel(Papel papel) {
		imprimiveis.add(papel);
		System.out.printf("%s adicionado com sucesso.\n", papel);
	}

}
