package principal;

import java.util.ArrayList;
import java.util.List;

import produto.Produto;

public class Listas {

	public static void main(String[] args) {
		
		// vetor: Integer[] nuns = new Integer[5];
		
		List<Integer> lista = new ArrayList<>();
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			lista.add(i);
			listaProdutos.add(new Produto("TV"+i, 900+i, 4));
		}
		
		for (int j = 0; j < lista.size(); j++) {
			System.out.println(lista.get(j));
		}
		
		for (Produto produto: listaProdutos) {
			produto.mostraProdutos();
		}
		
		
		
		
	}

}
