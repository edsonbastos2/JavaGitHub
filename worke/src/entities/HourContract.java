package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valueOerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valueOerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueOerHour() {
		return valuePerHour;
	}

	public void setValueOerHour(Double valueOerHour) {
		this.valuePerHour = valueOerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
	
}
