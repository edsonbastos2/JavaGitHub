package application;

import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente[] vect = new Cliente[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Cliente(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<10; i++) {
			if(vect[i] !=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
	}

}
