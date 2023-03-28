/* Juliany Eufrásio
Lista 001 - Metodos pt. 01 - Exercicio 03 */

import java.util.Scanner;
public class Exercicio03 {
	
	public static boolean eZero(double num){
		return num == 0;
	}
	
	public static boolean ePositivo(double num){
		return num >= 0;
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num;
		
		System.out.print("Entre com um numero para validar se é positivo, negativo ou igual a zero: ");
		num = input.nextDouble();
		
		if(eZero(num)){
			System.out.printf("O numero %.2f é  zero e é positivo", num);
		}else if(ePositivo(num)){
			System.out.printf("O numero %.2f é positivo", num);
		}else{
			System.out.printf("O numero %.2f é negativo", num);
		}
	}
}


