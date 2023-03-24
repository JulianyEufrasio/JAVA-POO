/*Lista 01 - Exercicio 28
Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar
as colunas da matriz de forma crescente e imprimir a matriz 
original e a matriz ordenada.*/

import java.util.Random;
import java.util.Arrays;
public class Exercicio28 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int m = numRandom.nextInt(10);
		
		int [][] matrizZ = new int [n][m];
		
		System.out.println("Matriz Original:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizZ[i][j] = numRandom.nextInt(100);
			System.out.print(matrizZ[i][j] + "\t");
			}
		System.out.println();
		}
		
		//ordenar
		int [] arrayOrdem = new int [n * m];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m - 1; j++){
				for(int k = j + 1; k < m; k++){
					if(matrizZ[i][k] > matrizZ[i][j]){
					int h = matrizZ[i][j];
					matrizZ[i][j] = matrizZ[i][k];
					matrizZ[i][k] = h;
					}
				}
			}
		}
		
		//exibe linha decrescente
		System.out.println("\n\nLinha Decrescente: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizZ[i][j] + "\t");
			}
		System.out.println();
		}
	}
}

