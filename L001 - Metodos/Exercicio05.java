/* Juliany Eufrásio
Lista 001 - Metodos pt. 01 - Exercicio 05 */

import java.util.Scanner;
public class Exercicio05 {
	
	/*
	ax² + bx + c
	a != 0
	Delta = b² 4ac
	D > 0 | duas soluções
	D = 0 | soluções repetidas
	D < 0 | raizes complexas
	
	bhaskara = -b +- raiz delta / 2 * a
	*/
	
	// delta
	public static double delta(double a, double b, double c){
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	//bhaskara
	public static double[] bhaskara(double a, double b, double c){
	
	//vetor para as duas raizes da equação
	double [] raizes = new double [2];
	if(delta(a, b, c) < 0){
		return raizes;
	}else{
		raizes[0] = (-b + Math.sqrt(delta(a, b, c))) / 2 * a;
		raizes[1] = (-b - Math.sqrt(delta(a, b, c))) / 2 * a;
		
		return raizes;
	}
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Para Calcular as raizes da equação entre com os valores de: ");
		do{
		System.out.print("A: ");
		a = input.nextDouble();
			if(a == 0){
			System.out.print("\nO valor de A deve ser diferente de zero! \nEntre com um novo valor: ");
			a = input.nextDouble();
			}
		}while(a == 0);
		
		System.out.print("B: ");
		b = input.nextDouble();
		System.out.print("C: ");
		c = input.nextDouble();
		
		System.out.println();
		// calcula e verifica o delta 
		delta = delta(a, b, c);
		if(delta < 0){
			System.out.print("O valor de delta é " + delta + " então se não admite solução real");
		}else{
			System.out.print("O valor de delta é " + delta + " então as raizes são reais");
		}
		
		// calcula e mostra raizes
		double [] raizes = bhaskara(a, b, c);
		System.out.print("\nAs raizes da equação são: " + raizes[0] + " e " + raizes[1]);
	}
}


