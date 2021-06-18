import java.util.Scanner;

public class ExerciciosVetores {
         //Faça um programa que permita ao usuário digitar 30 atividades 
		//que ele realizou no dia. Ao final, o programa deve possibilitar que o 
		//usuário escolha se quer exibir as atividades na ordem em que digitou 
		//ou em ordem reversa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		// inserir variavel para definir o tamanho do array(vetor)
		int quantidade;
		int ordem;
		System.out.println("Por favor, digite a quantidade de tarefas:");
		quantidade = leitor.nextInt();
		leitor.nextLine();// POG - XGH -> Programação Orientada a Gambirra - X
		
		// definir o tamanho do array a partir do que foi digitado pelo usuario
		String atividades[] = new String[quantidade];
				
		// inserir atributo .length da variavel para definir o loop do FOR 
		
		for (int i=0; i<atividades.length;i++) {
			System.out.println("Por favor, digite a "+ (i+1) +" ª Atividade realizada hoje");
			atividades[i] = leitor.nextLine();
			}
		 // o atributo next considera espaço como terminador
		 // o atributo nextLine considera o enter como terminador
		
		//Solicitar ao usuario escolher a ordem que deseja ver as atividades listadas
		System.out.println("Por favor, como deseja ver a orderm da sua atividade? 1- ordem 2- inversa");
		ordem = leitor.nextInt();
		
		// Para definir a logica direta ou reversa
		switch(ordem){
		case 1:
			for (int i=0;i<atividades.length;i++) {
				System.out.println("Sua "+ (i) + " ª Atividade foi " + atividades[i]);
			}
			break;
		case 2:
			for (int i=atividades.length-1;i>=0;i--) {
			System.out.println("Sua "+ (i) + " ª Atividade foi " + atividades[i]);
		}
			break;
		default:
			System.out.println("opção inválida");
		 	break;
		 	
	}leitor.close();
	
	}

}
