/*Juliany Eufrásio
Lista 01 - Exercicio 11
Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa).*/

import java.util.Random;
public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		int n = numRandom.nextInt(20);
		
		//chama o metodo que gera a matriz
		int[][] matrizK = gerarMatriz(n);
		
		System.out.println("Matriz Gerada: ");
		imprimirMatriz(matrizK);
		
		System.out.println("\n\nElementos da diagonal principal abaixo: ");
		imprimirDiagonal(matrizK);
	}
	
	//metodo para gerar uma matriz
	public static int[][] gerarMatriz(int n){
	Random numRandom = new Random();
	
	int[][] matrizK = new int [n][n];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
		matrizK[i][j] = numRandom.nextInt(50);
		}
	}
	return matrizK;
	}
	
	//metodo para exibir a matriz
	public static void imprimirMatriz (int[][] matrizK){
	int n = matrizK.length;
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
		System.out.print(matrizK[i][j] + "\t");
		}
	System.out.println();
	}
	}
	
	//metodo para exibir os elementos da abaixo da diagonal principal (inclusa)
	public static void imprimirDiagonal (int[][] matrizK){
	int n = matrizK.length;
	
	//é preciso verificar se os indices da coluna é menor que o da linha para exibir os elementos
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			if(j <= i){
				System.out.print(matrizK[i][j] + "\t");
				}else{
				System.out.print(" ");
				}
		}
	System.out.println();
	}
	}
}

