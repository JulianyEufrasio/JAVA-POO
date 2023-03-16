/*Juliany Eufrásio
Lista 01 - Exercicio 16
Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa).*/

/*
 j <= i ou i >= j  --> imprime os elementos abaixo da diagonal principal
 i <= j ou j >= i  -> imprime os elementos acims da diagonal principal
 (i + j) <= (n - 1)  --> imprime acima da diagonal secundaria
 (i + j) >= (n - 1)  --> imprime abaixo da diagonal secundaria
*/

import java.util.Random;
public class Exercicio16 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random ();
		
		int n = numRandom.nextInt(10);
		int [][] matrizP = new int [n][n];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizP[i][j] = numRandom.nextInt(100);
			System.out.print(matrizP[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.print("\n");
		System.out.println("Elementos abaixo da diagonal principal (inclusa) e abaixo da diagonal secundária (inclusa).: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			if(j <= i || (i + j) >= (n - 1)){
				System.out.print(matrizP[i][j] + "\t");
				}else{
				System.out.print("  ");
				}
			}
		System.out.println();
		}
		
	}
}

