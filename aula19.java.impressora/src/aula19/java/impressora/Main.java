package aula19.java.impressora;

public class Main {

	public static void main(String[] args) {
		
		Contrato contrato1 = new Contrato("Contrato de Venda", "Aliena��o");
		Foto foto1 = new Foto("Praia de Itaparica", "Selfie com coqueiro");
		Documento doc1 = new Documento("Poesia Tern�ria para PC Bin�rio", "Poesia");
		
		Impressora.adicionarImprimivel(contrato1);
		Impressora.adicionarImprimivel(foto1);
		Impressora.adicionarImprimivel(doc1);
		
		Impressora.imprimirTudo();

	}

}
