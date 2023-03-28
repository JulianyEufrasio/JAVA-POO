/* Juliany Eufrásio
Lista 001 - Metodos pt. 01 - Exercicio 02 */

import java.util.Scanner;
public class Exercicio02 {
	
	//verifica se o numero é zero
	public static boolean eZero(double num){
		return num == 0;
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num;
		
		System.out.print("Entre com um numero para validar se é igual a zeros ou não:: ");
		num = input.nextDouble();
		
		if(eZero(num)){
			System.out.printf("O numero %.2f é  zero", num);
		}else{
			System.out.printf("O numero %.2f não é zero", num);
		}
	}
}

