package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Emplyoee> list = new ArrayList<>();
		
		System.out.print("How many employees wil be registered: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Emplyooe #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add( new Emplyoee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id tha will have salary increase: ");
		int numero = sc.nextInt();
		Emplyoee emp = list.stream().filter(x -> x.getId() == numero).findFirst().orElse(null);
		System.out.print("Enter the percentage: ");
		double porcentage = sc.nextDouble();
		emp.porcentage(porcentage);
		
		System.out.println();
		for(Emplyoee x : list) {
			System.out.println(x);
		}

	}

}
