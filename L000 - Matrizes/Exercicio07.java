/*Juliany Eufrásio
Lista 01 - Exercicio 07
Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e 
imprimir o maior e o menor elemento deste conjunto, informando a posição dos mesmos*/

import java.util.Scanner;
public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m, maiorValor, menorValor;
		
		//entra e valida os valores de N e M
		System.out.println("Defina a dimensão N x M da matriz E: ");
		do{
		System.out.print("Entre com um numero N de linhas: ");
		n = input.nextInt();
		
		if(n <= 0){
		System.out.print("Valor Invalido! Entre com um numero maior que zero: ");
		n = input.nextInt();
		}
		}while(n <= 0);
		
		do{
		System.out.print("Entre com um numero M de linhas: ");
		m = input.nextInt();
		
		if(m <= 0){
		System.out.print("Valor Invalido! Entre com um numero maior que zero: ");
		m = input.nextInt();
		}
		}while(m <= 0);
		
		System.out.print("\n");
		
		//gera a matriz
		int [][] matrizE = new int [n][m];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
			matrizE[i][j] = input.nextInt();
			}
		}
		System.out.print("\n");
		
		//imprime a matriz
		System.out.println("Matriz E gerada: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizE[i][j] + " ");
			}
		System.out.println();
		}
		
		//verifica o maior e o menor valor
		//o maior valor 'é' o primeiro valor
		maiorValor = matrizE[0][0];
		menorValor = matrizE[0][0];
		
		// variaveis para defini a posição
		int linhaMenor = 0, 
		linhaMaior = 0, 
		colunaMenor = 0, 
		colunaMaior = 0;
		
		//percorre todos os elementos da matriz para comparar o valor
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			//define um novo maior valor e em qual linha/coluna foi encontrado
			if(matrizE[i][j] > maiorValor){
			maiorValor = matrizE[i][j];
			linhaMaior = i;
			colunaMaior = j;
			}
			//menor valor
			if(matrizE[i][j] < menorValor){
			menorValor = matrizE[i][j];
			linhaMenor = i;
			colunaMaior = j;
			}
			}
		}
		System.out.print("\n");
		System.out.println("O maior valor é " + maiorValor + " e foi encontrado na posição: [" + linhaMaior + "]x[" + colunaMaior + "]");
		System.out.println("O menor valor é " + menorValor + " e foi encontrado na posição: [" + linhaMenor + "]x[" + colunaMenor + "]");
		
		
	}
}

