/* Juliany Eufrásio
Lista 01 - Exercicio 02
Escreva um programa em Java para geral aleatoriamente os elementos
(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida.. */

import java.util.Random;
public class Exercicio02 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		//matriz B
		int [][] matrizB = new int [6][3];
		
		//gera a matriz aleatoria percorrendo linhas e colunas
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 3; j++){
				matrizB[i][j] = numRandom.nextInt(100);
			}
		}
		
		//exibe a matriz
		System.out.println("Matriz B:");
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matrizB[i][j] + " | ");
			}
			
		System.out.println();
		}
		
		//matriz em ordem invertida
		System.out.println("\nMatriz B invertida: ");
		for(int i = 6 - 1; i >= 0; i--){
			for(int j = 3 - 1; j >= 0; j--){
				System.out.print(matrizB[i][j] + " | ");
			}
		System.out.println();
		}
	}
}

