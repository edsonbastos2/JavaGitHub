package entities;

public class Conta {
	private Integer numConta;
	private String titular;
	protected Double saldo;
	
	public Conta() {
		super();
	}

	public Conta(Integer numConta, String titular, Double saldo) {
		super();
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void saque(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
}
