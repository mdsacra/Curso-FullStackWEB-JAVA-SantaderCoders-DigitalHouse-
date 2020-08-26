package aula19.java.impressora;

public class Main {

	public static void main(String[] args) {
		
		Contrato contrato1 = new Contrato("Contrato de Venda", "Alienação");
		Foto foto1 = new Foto("Praia de Itaparica", "Selfie com coqueiro");
		Documento doc1 = new Documento("Poesia Ternária para PC Binário", "Poesia");
		
		Impressora.adicionarImprimivel(contrato1);
		Impressora.adicionarImprimivel(foto1);
		Impressora.adicionarImprimivel(doc1);
		
		Impressora.imprimirTudo();

	}

}
