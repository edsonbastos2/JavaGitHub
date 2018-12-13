package entities;

public class ContaEmpresario extends Conta{
	
	private double limitEmprestimo;

	public ContaEmpresario() {
	
	}

	public ContaEmpresario(int numConta, String titular, double saldo, double limitEmprestimo) {
		super(numConta, titular, saldo);
		this.limitEmprestimo = limitEmprestimo;
	}

	public double getLimitEmprestimo() {
		return limitEmprestimo;
	}

	public void setLimitEmprestimo(double limitEmprestimo) {
		this.limitEmprestimo = limitEmprestimo;
	}
	
	public void emprestimo(double valor) {
		this.depositar(valor);
	}
}
