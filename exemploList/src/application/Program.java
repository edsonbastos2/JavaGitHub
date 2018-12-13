package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Edson");
		list.add("Wanessa");
		list.add("Lane");
		
		list.add(2, "Liane");
		list.add(1, "Eduardo");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'L');
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'W').collect(Collectors.toList());
		
		for(String y : result) {
			System.out.println(y);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println(name);
		
		sc.close();
	}

}
