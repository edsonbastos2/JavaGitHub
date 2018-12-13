package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] produto = new Produto[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produto[i] = new Produto(nome, preco);			
		}
		
		double sum=0.0;
		for(int i=0; i<n; i++) {
			sum += produto[i].getPreco();
		}
		
		double media = sum / produto.length;
		
		System.out.printf("A media de pre�os �: %.2f%n", media);
		
		sc.close();

	}

}
