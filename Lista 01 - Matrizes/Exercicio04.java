/* Juliany Eufrásio
Lista 01 - Exercicio 04
Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações.*/

import java.util.Scanner;
import java.util.Random;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		Random numRandom = new Random();
		
		int n, m, maxElementos;
		
		//entrada de valores para n e m
		System.out.print("Entre com o valor de N (linhas): ");
		n = input.nextInt();
		
		System.out.print("Entre com o valor de M (colunas): ");
		m = input.nextInt();
		
		//valida os valores de n e m
		while(n < 1 || m < 1){
		if(n < 1){
		System.out.print("Valor invalido, entre com um novo valor para N maior que 1: ");
		n = input.nextInt();
		} else if(m < 1){
		System.out.print("Valor invalido, entre com um novo valor para M maior que 1: ");
		m = input.nextInt();
		}
		}
		
		//cria a matriz
		int [][] matrizD = new int [n][m];
		
		//valor maximo de elementos aleatorios
		System.out.print("\nEntre com um valor maximo para gerar elementos aleatorios:");
		maxElementos = input.nextInt();
		
		//gera a matriz N x M
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizD[i][j] = numRandom.nextInt(maxElementos);
			}
		}
		
		//exibe a matriz gerada
		System.out.println("Matriz D gerada nas dimensões " + n + "x" + m + ": ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizD[i][j] +" ");
			}
		System.out.println();
		}
	}
}

