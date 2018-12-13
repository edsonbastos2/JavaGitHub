package entities;

public class Tercerizados extends Funcionario {
	
	private double despesaAdd;
	
	
	public Tercerizados() {
		super();
	}
	
	public Tercerizados(String nome, Integer horas, Double valorHoras, double despesaAdd) {
		super(nome, horas, valorHoras);
		this.despesaAdd = despesaAdd;
	}

	public double getDespesaAdd() {
		return despesaAdd;
	}

	public void setDespesaAdd(double despesaAdd) {
		this.despesaAdd = despesaAdd;
	}
	
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdd * 1.1;
	}
}
