/*Juliany Eufrásio
Lista 01 - Exercicio 19
Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da “asa da borboleta”.*/

import java.util.Random;
public class Exercicio19 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int [][] matrizS = new int [n][n];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizS[i][j] = numRandom.nextInt(100);
			System.out.print(matrizS[i][j] + "\t");
			}
		System.out.println();
		}
		
		System.out.println("\n\nAsa de borboleta: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				/* a 1° condição verifica se o numero esta abaixo da diagonal principal e 
				 o 2° verifica se esta acima da diagonal secundari*/
				if(j <= i && (i + j) <= (n - 1) || j >= i && (i + j) >= (n - 1)){
					System.out.print(matrizS[i][j] + "\t");
					}else{
					System.out.print(" ");
					}
			}
		System.out.println();
		}
	}
}

