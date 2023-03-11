/* Juliany Eufrásio
Lista 01 - Exercicio 01
Escreva um programa em Java para
ler uma matriz A de 4 linhas por 5 colunas e
imprimir seus elementos. */

import java.util.Scanner;
public class Exercicio01 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// matriz
		int [][] matrizA = new int [4][5];
		
		//ler a matriz
		//o 'i' percorre as linhas e o 'j' as colunas
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
			
			System.out.print("Digite o valor da posição [" + (i + 1)+ "][" + (j + 1) + "]:");
			matrizA[i][j] = input.nextInt();
			}
		}
		
		//imprime a matriz
		System.out.println("Matriz A:");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 5; j++){
				System.out.println(matrizA[i][j] + " ");
			}
		}
		
		System.out.println();
	}
}

