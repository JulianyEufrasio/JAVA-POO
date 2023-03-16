/*Juliany Eufrásio
Lista 01 - Exercicio 17
Escreva um programa em Java para gerar uma matriz quadrada Q de dimensão N.
Imprimir os elementos da acima da diagonal principal (inclusa) e abaixo da diagonal
secundária (inclusa)..*/

import java.util.Random;
public class Exercicio17 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int [][] matrizQ = new int [n][n];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizQ[i][j] = numRandom.nextInt(100);
			System.out.print(matrizQ[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.println("\nElementos da acima da diagonal principal (inclusa) e abaixo da diagonal secundária (inclusa): ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			if(i <= j || (i + j) >= (n - 1)){
			System.out.print(matrizQ[i][j] + "\t");
				}else{
				System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}

