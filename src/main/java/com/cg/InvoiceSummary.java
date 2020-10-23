package com.cg;

public class InvoiceSummary {
	private int numOfRides;
	private double totalFare;
	private double averageFare;
	
	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.numOfRides;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if(other.numOfRides==this.numOfRides && this.totalFare==other.totalFare && this.averageFare==other.averageFare)
			return true;
		else return false;
	}
}