import java.util.Random;

public class Exercicio3_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um algoritmo que gere aleatoriamente atrav�s de um la�o 
		//de repeti��o PARA um vetor de 50 elementos inteiros (entre 0 - 9), 
		//calcule e exiba:
		int aleatorio[] =new int [50];
		Random gerador = new Random();
		// PREENCHENDO COM ALEAT�RIOS
		for(int i=0; i<aleatorio.length;i++) {
			//gerador.nextInt(); gera um n�mero inteiro entre 0 e um anterior ao que est� entre par�nteses
			aleatorio[i] = gerador.nextInt(10);
		}
		for(int i=0; i<aleatorio.length;i++) {
			System.out.println(aleatorio[i]);
		}
		}
		//� A quantidade de n�meros entre 3 e 7;
		
		//� Quantidade de n�meros pares;
		
		//� A quantidade de n�meros menores que 3;
		
		//� Quantidade de n�meros �mpares.
		
		//Obs.: O vetor com os 50 elementos deve ser impresso na tela tamb�m.
		
		
		
	}

