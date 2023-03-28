/*Juliany Eufrásio
Lista 01 - Exercicio 12
Escreva um programa em Java para gerar uma matriz quadrada L de dimensão N. 
Imprimir os elementos da acima da diagonal principal (exclusa).*/

import java.util.Random;
public class Exercicio12 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = 7;
		int [][] matrizL = new int [n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizL[i][j] = numRandom.nextInt(100);
			}
		}
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			System.out.print(matrizL[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.println("\n\nElementos acima da diagonal principal:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i < j){
				System.out.print(matrizL[i][j] + "\t");
				} else{
				System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}

