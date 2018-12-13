package entities;

public class Carros {
	private String modelo;
	private String placa;
	
	public Carros(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String toString() {
		return modelo + ": " + placa;
	}
}
