/* Juliany Eufrásio
Lista 001 - Metodos pt. 01 - Exercicio 01*/

import java.util.Scanner;
public class Exercicio01 {
	
	//verifica se o numero é positivo
	public static boolean ePositivo(double num){
		return num >= 0;
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double num;
		
		System.out.print("Entre com um numero para validar se é positivo ou não: ");
		num = input.nextDouble();
		
		if(ePositivo(num)){
			System.out.printf("O numero %.2f é positivo", num);
		}else{
			System.out.printf("O numero %.2f é negativo", num);
		}
	}
}

