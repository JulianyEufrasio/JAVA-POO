/*Juliany Eufrásio
Lista 01 - Exercicio 20
Escreva um programa em Java para gerar uma matriz quadrada T de dimensão N. 
Imprimir os elementos da “ampulheta”.*/

import java.util.Random;
public class Exercicio20 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int [][] matrizT = new int [n][n];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizT[i][j] = numRandom.nextInt(100);
			System.out.print(matrizT[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.println("\n\nElementos da Ampuleta: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				/* a 1° condição verifica se o numero esta abaixo da diagonal principal e 
				 o 2° verifica se esta acima da diagonal secundari*/
				if(i <= j && (i + j) <= (n - 1) || i >= j && (i + j) >= (n - 1)){
					System.out.print(matrizT[i][j] + "\t");
					}else{
					System.out.print(" ");
					}
			}
		System.out.println();
		}
	}
}

