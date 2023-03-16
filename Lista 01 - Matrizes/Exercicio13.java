/*Juliany Eufrásio
Lista 01 - Exercicio 13
Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal secundária (exclusa).*/

import java.util.Random;
public class Exercicio13 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int [][] matrizK = new int [n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizK[i][j] = numRandom.nextInt(100);
			}
		}
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			System.out.print(matrizK[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.print("\n\nElementos abaixo da diagonal secundária (exclusa):");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			if(j < i){
			System.out.print(matrizK[i][j] + "\t");
			}else{
			System.out.print(" ");
			}
			}
		System.out.println();
		}
	}
}

