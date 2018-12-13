package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Double[] vect = new Double[n];
		
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		Double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			
			sum += vect[i];
		}
		
		Double media = sum / vect.length;
		System.out.printf("A media de idade: %.2f%n", media);

	}

}
