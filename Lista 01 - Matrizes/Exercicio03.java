/* Juliany Eufrásio
Lista 01 - Exercicio 03
Escreva um programa em Java para ler uma matriz C quadrada de dimensão N,
onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
aleatoriamente (menor que 100). */

import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {
	
	public static void main (String[] args) {
		/*notas: 
		- a matriz deve ser N x N, onde N <= 20
		*/
		
		Scanner input = new Scanner(System.in);
		Random  numRandom = new Random();
		
		int n;
		
		//solicitar o valor de N ao usuário
		System.out.print("Entre com o valor de N para formar uma matriz quadrada N x N (o valor deve ser entre 1 e 20): ");
		n = input.nextInt();
		
		//verifica o valor de N e reatribui um valor valido
		while(n < 1 || n > 20){
		System.out.println("Valor Invalido!");
		System.out.print("Entre com um novo valor para N entre 01 e 20: ");
		n = input.nextInt();
		}
		
		//cria uma matriz quadrada N x N com o valor digitado pelo usuario
		int [][] matrizC = new int [n][n];
		
		//gera a matriz aleatoria percorrendo linhas e colunas
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			matrizC[i][j] = numRandom.nextInt(100);
			}
		}
		
		//exibe a matriz c gerada
		System.out.println("Matriz C gerada aleatoriamente na dimensão " + n + "x" + n + ":");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
			System.out.print(matrizC[i][j] + " ");
			}
			
		System.out.println();
		}
		
	}
}

