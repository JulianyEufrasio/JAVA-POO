/*Juliany Eufrásio
Lista 01 - Exercicio 21
Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)),
sendo que para cada linha concatenar suas respectivas colunas e apresentar as três matrizes.*/

import java.util.Random;
public class Exercicio21 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int m =	numRandom.nextInt(10);
		int p = numRandom.nextInt(10);
		
		//cria e gera matrizes A e B
		int [][] matrizA = new int [n][m];
		int [][] matrizB = new int [n][p];
		int [][] matrizC = new int [n][n + p];
		
		//gera e exibe matriz A
		System.out.println("Matriz A");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizA[i][j] = numRandom.nextInt(100);
			System.out.print(matrizA[i][j] + "\t");
			}
		System.out.println();
		}
		
		//gera e exibe matrizB
		System.out.println("\n\nMatriz B");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < p; j++){
			matrizB[i][j] = numRandom.nextInt(100);
			System.out.print(matrizB[i][j] + "\t");
			}
		System.out.println();
		}
		
		//concatenar as matrizes a e b
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m+ p; j++){
			if(j < m){
				matrizC[i][j] = matrizA[i][j];
				}else{
				matrizC[i][j] = matrizB[i][j - m];
				}
			}
		}
		
		//matrizC
		System.out.println("\n\nMatriz C ( n x p + m)");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m + p; j++){
			System.out.print(matrizC[i][j] + "\t");
			}
		System.out.println();
		}
	}
}

