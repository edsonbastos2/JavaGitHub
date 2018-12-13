package application;

import entities.Conta;
import entities.ContaPupanca;

public class Program {

	public static void main(String[] args) {
		
		Conta cc1 = new Conta(102, "Maria", 1000.0);
		Conta cc2 = new ContaPupanca(1003, "Bob", 1000.0, 0.01);
		cc1.saque(50.0);
		cc2.saque(50.0);
		
		System.out.println(cc1.getSaldo());
		System.out.println(cc2.getSaldo()); 

	}

}
