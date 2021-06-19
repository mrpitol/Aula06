import java.util.Scanner;

public class Exercicio4_Vetores {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       /*4. Considere a cria��o de um vetor de 50 posi��es chamado 
		vetCarrinhoValores que servir� para armazenar os valores de 
		produtos comprados por um cliente, e outro vetor de 50 posi��es 
		chamado vetCarrinhoNomes que servir� para armazenar os nomes 
		de produtos comprados por um cliente.*/
				Scanner leitor =new Scanner (System.in);
		double vetCarrinhosValores[] = new double[3];
		String vetCarrinhosNomes[] = new String[3];
		int opcao=0;
		int posicao=0;//vari�vel para guardar a posi��o do carrinho
		
		/*Crie uma estrutura de menus para que o programa tenha as seguintes 
		funcionalidades:*/
		while(opcao!=7) 
		{
			System.out.println("\n\n\n\nSUPER LOJA MASSA SUPIMPA");
			System.out.println("1- Inserir Produto no Carrinho");
			System.out.println("2- Remover Produto do Carrinho");
			System.out.println("3- Calcular total da compra");
			System.out.println("4- Exibir quantidade de itens");
			System.out.println("5- Exibir o produto mais caro");
			System.out.println("6- Exibir carrinho completo");
			System.out.println("7- Sair do Sistema");
			opcao= leitor.nextInt();
			leitor.nextLine();//Gambiarra para trabalhar com o nextLine depois
			
			switch(opcao) 
			{
			case 1:
				/*� Digitar o nome de um produto e seu pre�o. (Quando n�o for 
			mais poss�vel inserir itens, deve ser exibida a mensagem: �Carrinho 
			cheio�)*/
				if(posicao < vetCarrinhosNomes.length) {
				System.out.println("Por favor, informe o nome do produto");
				vetCarrinhosNomes[posicao]=leitor.nextLine();
				System.out.println("Por favor, informe o valor do produto");
				vetCarrinhosValores[posicao]=leitor.nextDouble();
				leitor.nextLine();//Gambiarra para trabalhar com o nextLine
				}else
					System.out.println("Carrinho est� cheio");
				
				break;
				
			case 2:
				/*� Remover um produto atrav�s de seu nome. (O nome do produto 
			deve ser substitu�do por �� e o pre�o por 00. A posi��o n�o poder� ser 
			reutilizada para armazenar novos valores)*/
				String nome;
				System.out.println("Qual o nome do produto que ser� removido?");
				nome = leitor.nextLine();
				for(int i=0;i<posicao;i++) 
				{/*usar posicao pois garante apenas os lugares que ja foram utilizados*/ 
					if (vetCarrinhosNomes[i].equalsIgnoreCase(nome)) 
					{
						vetCarrinhosNomes[i] = "";
						vetCarrinhosValores[i] = 0;
					}
				}
				break;
				
			case 3:
				/*� Calcular o valor total da compra*/
				double total=0.0;
				for (int i=0;i<posicao;i++) {
					total= total+vetCarrinhosValores[i];
				}
				System.out.println("O valor total do carrinho � R$" +total);
				break;
				
			case 4:
				/*� Exibir a quantidade de produtos comprados*/
				int qntd =0;
				for (int i=0;i<posicao;i++) {
					if (!vetCarrinhosNomes[i].equalsIgnoreCase("")) 
					{
						qntd=qntd +1;
					}					
				}
				System.out.println("O carrinho tem " +qntd + "produto(s) inserido(s)");
				break;
				
			case 5:
				/*� Exibir o nome do produto de maior valor (Em caso de produtos de igual valor, escolher 					uma das ocorr�ncias)*/
				int posicaodoMaior=0;// Guarda a posi��o do produto mais caro
				for (int i=0;i<posicao;i++) {
					if (vetCarrinhosValores[i]>vetCarrinhosValores[posicaodoMaior]) {
						posicaodoMaior=i;
					}
					
				}
				break;
				
			case 6:
				//� Exibir o nome de cada produto ao lado de seu pre�o
				System.out.println("ITEM -- NOME -- PRE�O");
				for(int i=0;i<posicao;i++) {
				if(!vetCarrinhosNomes[i].equals("")) {
				System.out.println((i+1) + " -- " + vetCarrinhosNomes[i] + " -- R$" + 				vetCarrinhosValores[i]);
				}
				}

				break;
				
			case 7:
				/*� Sair do sistema*/
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}		
	
		}
		leitor.close();
	}
}
