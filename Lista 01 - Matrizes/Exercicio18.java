/*Juliany Eufrásio
Lista 01 - Exercicio 18
Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N. 
Imprimir os elementos da acima da diagonal principal (inclusa) e
acima da diagonal secundária (inclusa).*/

import java.util.Random;
public class Exercicio18 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(15);
		int [][] matrizR = new int [n][n];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrizR[i][j] = numRandom.nextInt(100);
				System.out.print(matrizR[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.println("\nElementos da acima da diagonal principal (inclusa) e acima da diagonal secundária (inclusa): ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			if(i <= j || (i + j) <= (n - 1)){
			System.out.print(matrizR[i][j] + "\t");
				}else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}

