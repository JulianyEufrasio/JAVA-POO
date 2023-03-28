/*Juliany Eufrásio
Lista 01 - Exercicio 10
Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N. 
Imprimir os elementos da diagonal secundária (linha + coluna = dimensão + 1).*/

import java.util.Random;
public class Exercicio10 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		
		//chama o metodo que gera a matriz
		int[][] matrizH = gerarMatriz(n);
		
		//chama o metodo que imprime a matriz
		System.out.println("Matriz Gerada: ");
		imprimirMatriz(matrizH);
		
		System.out.print("\n\n");
		
		//imprime a diagonal secundaria
		/* j = n - i + 1.*/
		System.out.println("Diagonal Secundaria:");
		for(int i = 0; i < n; i++){
			System.out.print(matrizH[i][n - i - 1] + " | ");
		}
	}
	
	//metodo para gerar um matriz aleatoria na dimensão N
	public static int[][] gerarMatriz(int n){
	//cria e preenche a matriz
	Random numRandom = new Random();
	int [][] matrizH = new int[n][n];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
		matrizH[i][j] = numRandom.nextInt(100);
		}
	}
	return matrizH;
	}
	
	//metodo para exibir a matriz gerada
	public static void imprimirMatriz(int[][] matrizH){
	int n = matrizH.length;
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
		System.out.print(matrizH[i][j] + "\t");
		}
	System.out.println();
	}
	}
}

