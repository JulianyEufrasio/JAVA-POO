/*Juliany Eufrásio
Lista 01 - Exercicio 06
Escreva um programa em Java para gerar aleatoriamente (menor que 25)
uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário
um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
matriz, indicando a posição (linha X coluna) e no final a quantidade de
ocorrências.*/
		
import java.util.Scanner;
import java.util.Random;
public class Exercicio06 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random numRandom = new Random();
		
		int n, m, valor, cont;
		
		//entrada dos valores N x M
		System.out.print("Entre com o numero N de linhas: ");
		n = input.nextInt();
		
		System.out.print("Entre com o numero M de colunas: ");
		m = input.nextInt();
		
		//cria a matriz
		int [][] minhaMatriz = new int [n][m];
		
		//preenche a matriz com numeros aleatorios
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			minhaMatriz[i][j] = numRandom.nextInt(25 + 1);
			}
		}
		
		System.out.println("\n------------");
		System.out.print("Entre com um valor para ser pesquisado na matriz: ");
		valor = input.nextInt();
		
		//exibe a matriz gerada
		System.out.println("A matriz gerada é: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(minhaMatriz[i][j] + " ");
			}
		System.out.println();
		}
		
		//verifica se o valor pesquisadp existe na matriz
		cont = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			if(minhaMatriz[i][j] == valor){
				System.out.println("O valor " + valor + " foi encontrado na matriz na posição [" + i + "] x [" + j + "]");
				cont++;
				}
			}
		}
		
		System.out.println("------------");
		System.out.print("O valor " + valor + " foi encontrado " + cont + " vezes na matriz");
	}
}

