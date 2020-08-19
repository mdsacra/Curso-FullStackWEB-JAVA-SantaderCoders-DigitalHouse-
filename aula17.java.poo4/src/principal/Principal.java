package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contato.Contato;
import endereco.Endereco;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Contato> contatos = new ArrayList<>();
		
		Integer segue;
		do {
			System.out.printf("-----CONTATOS------\n"
					 + "---Menu Principal--\n"
					 + "[1] Incluir Contato\n"
					 + "[2] Excluir Contato\n"
					 + "[3] Listar Contatos\n"
					 + "[4] Pesquisar Contato\n"
					 + "[0] Encerrar o Programa\n"
					 + "-------------------\n"
					 + "Escolha sua opção: ");
			
			Integer opcao = sc.nextInt();
			segue = opcao;
			
			
			switch(opcao) {
			case 1:
				do {
					
					System.out.println("------------------\nInsira um contato (-1 para sair): ");
					
					System.out.printf("ID: ");
					Integer id = sc.nextInt();
					
					if(id < 0) {
						break;
					}
					
					sc.nextLine();
					
					System.out.printf("Nome: ");
					String nome = sc.nextLine();
					
					System.out.printf("Idade: ");
					Integer idade = sc.nextInt();
					
					sc.nextLine();
					
					System.out.printf("Telefone: ");
					String fone = sc.nextLine();
					
					System.out.printf("Rua: ");
					String rua = sc.nextLine();
					
					System.out.printf("Número: ");
					Integer num = sc.nextInt();
					sc.nextLine();
					
					System.out.printf("Bairro: ");
					String bairro = sc.nextLine();
					
					System.out.printf("Cidade: ");
					String cidade = sc.nextLine();
					
					System.out.printf("Estado: ");
					String estado = sc.nextLine();
					
					
					contatos.add(new Contato(id, nome, idade, fone, new Endereco(rua, num, bairro, cidade, estado)));
					
					System.out.println("...");
					System.out.println("CADASTRO SALVO COM SUCESSO!");
					System.out.println("");
					
				} while(true);
				break;
				
			case 2:
				System.out.printf("Digite o id do contato: ");
				Integer idRemove = sc.nextInt();
				if (!contatos.stream().anyMatch(contato -> contato.getId() == idRemove)) {
					System.out.println("Contato não encontrado!");
				} else {
					for (int i = 0; i < contatos.size(); i++) {
						if (contatos.get(i).getId() == idRemove) {
							
							contatos.remove(i);
						}
					}
				}
				break;
				
			case 3:
				if (contatos.size() == 0) {
					System.out.println("Não há contatos na sua lista!");
					System.out.println("");
					
				} else {
					System.out.println(contatos);	
				}
				
				break;
				
			case 4:
				System.out.printf("Digite o id do contato: ");
				Integer idSearch = sc.nextInt();
				if (!contatos.stream().anyMatch(contato -> contato.getId() == idSearch)) {
					System.out.println("Contato não encontrado!");
				} else {
					for (Contato c: contatos) {
						if (c.getId() == idSearch) {
							System.out.println(c);
						}
					}
				}
				break;
			
			case 0:
				System.out.println("Obrigado por utilizar o ContactUs!");
				break;
			}
			
		} while(segue != 0);
		
		
	}

}
