package applicatio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos empregados serão cadastrado ? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionario N° " + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add( new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Digite o Id do funcionario: ");
		int id = sc.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		System.out.print("Valor em % para aumento: ");
		double valor = sc.nextDouble();
		emp.pordentagem(valor);
		
		System.out.println();
		for(Funcionario x : list) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
