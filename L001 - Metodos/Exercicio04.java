/* Juliany Eufrásio
Lista 001 - Metodos pt. 01 - Exercicio 04 */

import java.util.Scanner;
public class Exercicio04 {
	
	public static double delta(double a, double b, double c){
	//delta= b² - 4ac
		return Math.pow(b, 2) - 4 * a * c;
	}
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Para Calcular o valor de Delta entre com: ");
		
		System.out.print("O valor de a: ");
		a = input.nextDouble();
		System.out.print("O valor de b: ");
		b = input.nextDouble();
		System.out.print("O valor de c: ");
		c = input.nextDouble();
		
		//a variavel recebe o vlor que foi calculado pelo metodo
		delta = delta(a, b, c);
		System.out.printf("O valor de Delta é %.2f", delta);
	}
}
