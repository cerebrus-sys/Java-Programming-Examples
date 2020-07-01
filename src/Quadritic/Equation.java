/**
 * Program to solve quadritic equation using quadritic forumula.
 */

package Quadritic;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Format: a(x**2) + bx + c = 0");
		
		System.out.print("Enter a, b and c: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double d = (b * b) - (4 * a * c);
		
		if (d == 0) {
			System.out.print("X1 = ");
			System.out.println(b/(2*a));
			System.out.print("X2 = -");
			System.out.println(b/(2*a));
		} else if (d > 0) {
			System.out.print("X1 = ");
			System.out.println(-b-Math.sqrt(d)/(2*a));
			System.out.print("X2 = ");
			System.out.println(-b+Math.sqrt(d)/(2*a));
		} else {
			System.out.print("X1 = ");
			System.out.print(-b/(2*a));
			System.out.print("-");
			System.out.print(Math.sqrt(-d)/(2*a));
			System.out.println("j");
			System.out.print("X2 = ");
			System.out.print(-b/(2*a));
			System.out.print("+");
			System.out.print(Math.sqrt(-d)/(2*a));
			System.out.println("j");
		}
		
		scan.close();
	}
}
