package entities;

public class Conta {
	private int numConta;
	private String titular;
	private double saldo;
	
	
	public Conta() {
		super();
	}


	public Conta(int numConta, String titular, double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
}
