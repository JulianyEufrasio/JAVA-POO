/*Lista 01 - Exercicio 27
Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas
da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/

import java.util.Random;
import java.util.Arrays;
public class Exercicio27 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int m = numRandom.nextInt(10);
		
		int [][] matrizX = new int [n][m];
		
		System.out.println("Matriz Original:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizX[i][j] = numRandom.nextInt(100);
			System.out.print(matrizX[i][j] + "\t");
			}
		System.out.println();
		}
		
		//ordenar matriz
		for(int i = 0; i < matrizX.length; i++){
			Arrays.sort(matrizX[i]);
		}
		
		System.out.println("\nMatriz Ordenada:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizX[i][j] + "\t");
			}
		System.out.println();
		}
	}
}

