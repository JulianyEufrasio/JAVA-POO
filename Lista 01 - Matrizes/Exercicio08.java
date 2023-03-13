/*Juliany Eufrásio
Lista 01 - Exercicio 08
Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. 
Imprimir a matriz e os vetores. Validar para caso não haja uma das
duas possibilidades (sem elementos pares ou ímpares).*/

import java.util.Random;
import java.util.Scanner;
public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		Random numRandom = new Random();
		
		int n, m;
		int qtdPar, qtdImpar;
		
		//entrada das dimensões N x M
		do{
		System.out.print("Entre com o valor N de linhas para a Matriz F: ");
		n = input.nextInt();
		
		if(n <= 0){
		System.out.print("Valor Invalido! Entre com um numero N de linhas maior que 0: ");
		n = input.nextInt();
		}
		}while(n <= 0);
		
		do{
		System.out.print("Entre com o valor M de colunas para a Matriz F: ");
		m = input.nextInt();
		
		if(m <= 0){
		System.out.print("Valor Invalido! Entre com um numero M de colunas maior que 0: ");
		m = input.nextInt();
		}
		}while(m <= 0);
		
		//cria a matriz f e preenche com valores aleatorios
		int [][] matrizF = new int [n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizF[i][j] = numRandom.nextInt(101);
			}
		}
		//Criar os vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. 
		int [] impar = new int [n * m];
		int [] par = new int [n * m];
		
		qtdPar = 0; qtdImpar = 0;
		//armazenar os elementos impares e pares e contar a qtd desses elementos
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			//se o numero for par
			if(matrizF[i][j] % 2 == 0){
			par[qtdPar] = matrizF[i][j];
			qtdPar++;
			} else{
			impar[qtdImpar] = matrizF[i][j];
			qtdImpar++;
			}
			}
		}
		
		//exibir a matriz
		System.out.print("\n");
		System.out.println("Matriz F gerada aleatorimente na dimensão: " + n + "x" + m);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizF[i][j] + " ");
			}
		System.out.println();
		}
		
		System.out.print("\n");
		
		//array par
		if(qtdPar > 0){
		System.out.println("Vetor par criado com os elementos pares da matriz F:");
		for(int i = 0; i < qtdPar; i++){
		System.out.print(par[i] + " | ");
		}
		System.out.println();
		}else{
		System.out.println("Não ha elementos pares na matriz F");
		}
		
		System.out.print("\n");
		
		//array impar
		//se houver elemento impar
		if(qtdImpar > 0){
		System.out.println("Vetor impar criado com os elementos impares da matriz F:");
		for(int i = 0; i < qtdImpar; i++){
		System.out.print(impar[i] + " | ");
		}
		System.out.println();
		}else{
		System.out.println("Não ha elementos impares na matriz F");
		}
	}
}

