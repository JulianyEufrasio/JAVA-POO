/*Juliany Eufrásio
Lista 01 - Exercicio 24
Escreva um programa em Java para solicitar ao usuário dimensões de
uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci
e imprimir o resultado.*/

import java.util.Scanner;
public class Exercicio24 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m;
		int a = 0, b = 1;
		
		System.out.println("Entre com os valores da dimesão da matriz:");
		do{
			System.out.print("Entre com o primeiro valor: ");
			n = input.nextInt();
			
			if(n <= 0){
			System.out.print("O valor deve ser maior que zero! Entre com um novo valor: ");
			n = input.nextInt();
			}
		}while(n <= 0);
		
		do{
			System.out.print("Entre com o segundo valor: ");
			m = input.nextInt();
			
			if(m <= 0){
			System.out.print("O valor deve ser maior que zero! Entre com um novo valor: ");
			m = input.nextInt();
			}	
		}while(m <= 0);
		
		int [][] matrizFibo = new int [n][m];
		
		System.out.println("\n\nMatriz Fibonacci: ");
		for(int i = 0; i < n; i++){
		System.out.println();
		
			for(int j = 0; j < m; j++){
			matrizFibo[i][j] = a;
			int c = a + b;
			a = b;
			b = c;
			System.out.print("\t" + matrizFibo[i][j]);
			}
		}
	}
}

