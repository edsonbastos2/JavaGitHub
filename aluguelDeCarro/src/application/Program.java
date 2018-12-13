package application;

import java.util.Scanner;

import entities.Carros;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carros[] vect = new Carros[10];
		
		System.out.print("Quantos carro vai alugar: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ": ");
			System.out.print("Modelo: ");
			String modelo = sc.nextLine();
			System.out.print("Placa: ");
			String placa = sc.nextLine();
			System.out.print("Número do carro: ");
			int numero = sc.nextInt();
			vect[numero] = new Carros(modelo, placa);
		}
		
		System.out.println();
		System.out.println("Carros ocupados: ");
		for(int i=0; i<10; i++) {
			if(vect[i] !=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}

}
