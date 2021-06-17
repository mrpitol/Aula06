import java.util.Scanner;

public class Vetores_Final {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// inserir variavel para definir o tamanho do array(vetor)
		int quantidade;
		System.out.println("Por favor, digite a quantidade de aluno:");
		quantidade = leitor.nextInt();
		
		double alunos[] = new double[quantidade];
		double total=0;
		
		// inserir atributo .length da variavel para definir o loop do FOR 
		
		for (int i=0; i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do "+ (i+1) +" º aluno");
			alunos[i] = leitor.nextDouble();
			total = total +alunos[i];
		}
		
		for (int i=0;i<alunos.length;i++) {
			System.out.println("O aluno "+ (i+1) + " consumiu R$" + alunos[i]);
		}
				
		    System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		

	}

}
