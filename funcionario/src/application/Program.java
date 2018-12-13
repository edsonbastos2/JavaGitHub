package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Tercerizados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quanto funcionarios serão casatrados: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + " dados: ");
			System.out.print("Tercerizado (s/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHoras = sc.nextDouble();
			
			if( ch == 's') {
				System.out.print("Adicionar taxa: ");
				double despesaAdd = sc.nextDouble();
				Funcionario emp = new Tercerizados(nome, horas, valorHoras, despesaAdd);
				list.add(emp);
			}else {
				Funcionario emp = new Funcionario(nome, horas, valorHoras);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		for(Funcionario emp : list) {
			System.out.println(emp.getNome() + " - R$" + String.format("%.2f", emp.pagamento()));
		}
		
		sc.close();
	}

}
