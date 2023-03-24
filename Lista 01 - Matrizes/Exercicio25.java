/*Juliany Eufrásio
Lista 01 - Exercicio 25
Escreva um programa em Java para gerar uma matriz Y (N x M). Ordem os elementos da 
matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/

import java.util.Random;
import java.util.Arrays;
public class Exercicio25 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int m = numRandom.nextInt(10);
		
		int [][] matrizY = new int [n][m];
		
		System.out.println("Matriz Original:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizY[i][j] = numRandom.nextInt(100);
			System.out.print(matrizY[i][j] + "\t");
			}
		System.out.println();
		}
		
		//ordenar matriz
		for(int i = 0; i < matrizY.length; i++){
			Arrays.sort(matrizY[i]);
		}
		
		//imprimir matriz ordenada
		System.out.println("\nMatriz Ordenada:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizY[i][j] + "\t");
			}
		System.out.println();
		}
	}
}

