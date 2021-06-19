import java.util.Random;

public class Exercicio3_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um algoritmo que gere aleatoriamente através de um laço 
		//de repetição PARA um vetor de 50 elementos inteiros (entre 0 - 9), 
		//calcule e exiba:
		int aleatorio[] =new int [50];
		Random gerador = new Random();
		// PREENCHENDO COM ALEATÓRIOS
		for(int i=0; i<aleatorio.length;i++) {
			//gerador.nextInt(); gera um número inteiro entre 0 e um anterior ao que está entre parênteses
			aleatorio[i] = gerador.nextInt(10);
		}
		for(int i=0; i<aleatorio.length;i++) {
			System.out.println(aleatorio[i]);
		}
		}
		//• A quantidade de números entre 3 e 7;
		
		//• Quantidade de números pares;
		
		//• A quantidade de números menores que 3;
		
		//• Quantidade de números ímpares.
		
		//Obs.: O vetor com os 50 elementos deve ser impresso na tela também.
		
		
		
	}

