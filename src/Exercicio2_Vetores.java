import java.util.Scanner;

public class Exercicio2_Vetores {
		
	public static void main(String[] args) {
		// O professor Wuni Jim Yensonal precisa de um programa para 
		//ajudar com um problema simples: para uma turma com 50 alunos 
		//precisa calcular a m�dia da sala e descobrir quais s�o os alunos que 
		//precisar�o de um atendimento personalizado. O fluxo do programa 
		//deve ser o seguinte: 
		
		// Declarar Modo de entrada
		Scanner leitor = new Scanner(System.in);
		
		// inserir variavel para definir o tamanho do array(vetor)

				int quantidade;
				int ordem;
				System.out.println("Por favor, digite a quantidade de Alunos:");
				quantidade = leitor.nextInt();
				leitor.nextLine();// POG - XGH -> Programa��o Orientada a Gambirra - X
				
		// definir o tamanho do array a partir do que foi digitado pelo usuario
				String nomes[] = new String[quantidade];
				double notas[] = new double[quantidade];
				double media=0;
		
				//A. Digitar as 50 notas em um vetor e, para cada nota digitada, 
				//digitar o nome do aluno correspondente em outro vetor
				for (int i=0; i<nomes.length;i++) {
					System.out.println("Por favor, digite o nome do "+ (i+1) +" � Aluno");
					nomes[i] = leitor.nextLine();
					 // o atributo next considera espa�o como terminador
					 // o atributo nextLine considera o enter como terminador
					System.out.println("Por favor, digite a nota do "+ (i+1) +" � Aluno");
					notas[i] = leitor.nextDouble();
					leitor.nextLine();
					}
				
				//B. Calcular a m�dia das notas digitadas
				//Para calcular a m�dia, fazer um loop para ir somando as notas e fora do loop dividir pela 				//quantidade de notas
				for (int i=0; i<nomes.length;i++) {
					media+=notas[i];
					
					}
				System.out.println("A m�dias das notas dos "+ quantidade +" alunos �:" + media/quantidade);
				
				//C. Para cada uma das notas que foi digitada e ficou abaixo da 
				//m�dia, exibir uma mensagem que diga �Chamar o aluno para 
				//conversar�
				
				
				
				
	}
  
}
