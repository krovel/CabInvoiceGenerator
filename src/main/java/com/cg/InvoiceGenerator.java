package com.cg;

public class InvoiceGenerator {
	public final double COST_PER_KILOMETER = 10.0;
	private static final int COST_PER_MINUTE = 1;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
		return totalFare;
	}
}