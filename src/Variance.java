/**
 * Program to calculate sum, mean, variance and standard deviation.
 */

import java.util.Scanner;

public class Variance {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		
		double ar[] = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Enter the value of element ");
			System.out.print(i);
			System.out.print(": ");
			ar[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += ar[i];
		}
		
		System.out.print("Sum = ");
		System.out.println(sum);
		
		double mean = sum / n;
		System.out.print("Mean = ");
		System.out.println(mean);
		
		double variance = 0;
		for (int i=0; i<n; i++) {
			variance += (mean-ar[i])*(mean-ar[i]);
		}
		variance /= n;
		
		System.out.print("Variance = ");
		System.out.println(variance);
		
		System.out.print("Standard Deviation = ");
		System.out.println(Math.sqrt(variance));
	}
}
