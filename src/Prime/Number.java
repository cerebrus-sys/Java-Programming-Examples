/**
 * Program to check if a number is a prime number.
 */

package Prime;

import java.util.Scanner;

public class Number {
	
	public static boolean isPrimeNumber(int n) {
		if (n < 0)
			return false;
		else if ((0 <= n) && (n <= 3))
			return true;
		else
			for (int i=2; i<=n/2; i++)
				if (n % i == 0)
					return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = scan.nextInt();
		
		System.out.print("Is Prime Number? ");
		System.out.println((isPrimeNumber(x)) ? "Yes" : "No");
	}
}
