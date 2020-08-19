package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
			
		
		System.out.printf("Quantos funcionários vc quer adicionar? ");
		Integer qtdFunc = sc.nextInt();
		
		int cont = 1;
		
		while(cont <= qtdFunc) {
			System.out.printf("Adicione o funcionário nº %s:\n", cont);
			System.out.printf("Nome: ");
			String nome = sc.next();
			
			System.out.printf("Salário: R$ ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(cont, nome, salario);
			funcionarios.add(func);
			
			cont++;
		}
		
		System.out.println(funcionarios);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("# AUMENTO SALARIAL #");
		System.out.printf("Qual o id do funcionário que você quer alterar o salário? ");
		Integer idFunc = sc.nextInt();
		Funcionario funcionario = funcionarios.stream().filter(func -> func.getId() == idFunc).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println("Este funcionario não existe!");
		} else {
			System.out.printf("Qual a porcentagem do aumento? ");
			Double porc = sc.nextDouble();
			funcionario.aumentoSalarial(porc);
			System.out.println(funcionarios);
		}
				
		
		sc.close();

	}

}
