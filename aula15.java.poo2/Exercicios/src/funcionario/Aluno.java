package funcionario;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double mediaFinal() {
		
		return ((this.nota1*100/30) + (this.nota2*100/35) + (this.nota3*100/35))/3;
	}
	
	public void situacao() {
		
		System.out.printf("Média final: %.2f \n", mediaFinal());
		
		if (mediaFinal() >= 60) {
			System.out.println("O aluno " + this.nome + " foi aprovado!");
		} else {
			System.out.println("O aluno " + this.nome + " foi reprovado");
			System.out.printf("Faltaram %.2f pontos. \n", 60 - mediaFinal());
			
		}
	}
	
}
