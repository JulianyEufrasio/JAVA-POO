package exercicio10;

/* Juliany Eufrásio
Lista 01 - Exercício 09
Escreva um programa em Java para gerar uma matriz quadrada G de 
dimensão N.
Imprimir os elementos da diagonal principal (linha = coluna).
 */

import java.util.Scanner;
import java.util.Random;
public class Exercicio09 {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         Random numRandom = new Random();
         
         int n;
         
         do{
             System.out.print("Entre com o Valor de N para gerar uma matriz quadrada: ");
             n = input.nextInt();
             if(n <= 0){
                 System.out.println("Valor Invalido! N deve ser maior que zero: ");
                 n = input.nextInt();
             }
         }while(n <= 0);
            
         //cria matriz
         int [][] matrizG = new int [n][n];
         
         for(int i = 0; i < n; i++){
             for(int j = 0; j < n; j++){
                 matrizG[i][j] = numRandom.nextInt(101);
             }
         }
         
         //exibe a matriz
         System.out.println("\n");
         System.out.println("A matriz gerada é: ");
         for(int i = 0; i < n; i++){
             for(int j = 0; j < n; j++){
                 System.out.print(matrizG[i][j] + " ");
             }
         System.out.println();
         }
         
        // diagonal princiapl i == j
        System.out.println("\n");
        System.out.println("A diagonal principal da matriz é: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    System.out.print(matrizG[i][j] + " | ");
                }
            }
        }
    }   
}
