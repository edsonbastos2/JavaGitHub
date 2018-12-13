package entities;

public class ContaCorrente extends Conta {
	private Double saldoEmprestimo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numConta, String titular, Double saldo, Double saldoEmprestimo) {
		super(numConta, titular, saldo);
		this.saldoEmprestimo = saldoEmprestimo;
	}

	public Double getSaldoEmprestimo() {
		return saldoEmprestimo;
	}

	public void setSaldoEmprestimo(Double saldoEmprestimo) {
		this.saldoEmprestimo = saldoEmprestimo;
	}
	
	public void emprestimo(double valor) {
		this.deposito(valor);
	}
	
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
