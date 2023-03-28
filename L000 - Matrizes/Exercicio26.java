/*Lista 01 - Exercicio 26
Escreva um programa em Java para gerar uma matriz W (N x M). Ordem
os elementos da matriz de forma decrescente e imprimir a matriz original e a
matriz ordenada.*/

import java.util.Random;
import java.util.Arrays;
public class Exercicio26 {
	
	public static void main (String[] args) {
		
		Random numRandom = new Random();
		
		int n = numRandom.nextInt(10);
		int m = numRandom.nextInt(10);
		
		int [][] matrizW = new int [n][m];
		
		System.out.println("Matriz Original:");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizW[i][j] = numRandom.nextInt(100);
			System.out.print(matrizW[i][j] + "\t");
			}
		System.out.println();
		}
		
		//ordenar matriz
		int [] arrayOrdem = new int [n * m];
		int k = 0;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			arrayOrdem[k] = matrizW[i][j];
			k++;
			}
		}
		
		for(int i = 0; i < arrayOrdem.length; i++){
			for(int j = i + 1; j < arrayOrdem.length; j++){
				if(arrayOrdem[j] > arrayOrdem[i]){
				int h = arrayOrdem[i];
				arrayOrdem[i] = arrayOrdem[j];
				arrayOrdem[j] = h;
				}
			}
		}
		
		k = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			matrizW[i][j] = arrayOrdem[k];
			k++;
			}
		}
		
		//exibe matriz
		System.out.println("\n\nOrdem Decrescente: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
			System.out.print(matrizW[i][j] + "\t");
			}
		System.out.println();
		}
	}
}

