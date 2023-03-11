/* Juliany Eufrásio
Lista 01 - Exercicio 05
Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
calcular a soma entre elas gerando uma terceira matriz.*/

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m;
		
		//define os vajores de N e M
		System.out.print("Entre com o valor de N (linhas) da matrizes: ");
		n = input.nextInt();

		System.out.print("Entre com o valor M (colunas) da matrizes: ");
		m = input.nextInt();
		
		while(n <= 0 || m <= 0){
		if(n <= 0){
		System.out.print("Valor invalido, entre com um novo valor para N maior que 0: ");
		n = input.nextInt();
		} else if(m <= 0){
		System.out.print("Valor invalido, entre com um novo valor para N maior que 0: ");
		m = input.nextInt();
		}
		}
		
		System.out.print("-------------------\n");
		
		//cria as matrizes
		int [][] matrizA = new int [n][m];
		int [][] matrizB = new int [n][m];
		
		//preenche a matriz a
		System.out.println("Preencha os valores da matriz A: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
			matrizA[i][j] = input.nextInt();
			}
		}
		
		System.out.print("-------------------\n");
		
		//preenche a matriz b
		System.out.println("Preencha os valores da matriz B: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print("Digite o vajor da posição [" + i + "][" + j + "]: ");
			matrizB[i][j] = input.nextInt();
			}
		}
		
		System.out.print("-------------------\n");
		//matriz soma = matriz a + matriz B
		int [][] matrizSoma = new int [n][m];
		
		//soma as matrizes
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		System.out.println("A soma das matrizes é: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizSoma[i][j] + " ");
			}
		System.out.println();
		}
		
	}
}

