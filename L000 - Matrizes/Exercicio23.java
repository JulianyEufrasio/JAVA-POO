/*Juliany Eufrásio
Lista 01 - Exercicio 23
Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.*/

import java.util.Scanner;
public class Exercicio23{
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m;
		
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
		
		//crie e gera a matriz com sequencia de primos
		int [][] matrizPrimo = new int [n][m];
		
		int num = 2;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				while(!isPrimo(num)){
				num++;
				}
				matrizPrimo[i][j] = num;
				num++;
			}
		}
		
		//exibe a matriz
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizPrimo[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	//metodo numero primo
	public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

