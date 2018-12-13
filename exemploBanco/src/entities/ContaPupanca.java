package entities;

public class ContaPupanca extends Conta {
	private Double taxaJuros;

	public ContaPupanca() {
		super();
	}

	public ContaPupanca(Integer numConta, String titular, Double saldo, Double taxaJuros) {
		super(numConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void saldoAtualizado() {
		saldo += saldo * taxaJuros;
	}
	
}
