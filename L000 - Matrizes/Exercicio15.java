/*Juliany Eufrásio
Lista 01 - Exercicio 15
 Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal
secundária (inclusa).*/

import java.util.Random;
public class Exercicio15 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int [][] matrizO = new int [n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizO[i][j] = numRandom.nextInt(100);
			}
		}
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			System.out.print(matrizO[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.print("\n");
		System.out.println("Elementos abaixo da diagonal principal (inclusa) e acima da diagonal secundária (inclusa).: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			/*j <= i (diagonal principal abaixo)
			(i + j) <= (n - 1)  (diagonal secundária acima)*/
			if(j <= i || (i + j) <= (n - 1)){
				System.out.print(matrizO[i][j] + "\t");
				}else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
		
	}
}

