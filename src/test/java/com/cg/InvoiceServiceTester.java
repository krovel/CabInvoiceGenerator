package com.cg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTester {

	InvoiceGenerator invoiceGenerator = null;

	@Before
	public void initialize() {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {		
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTime_WhenFareLessThanMinimumFare_ShouldReturnMinimumFare() {
		double distance = 0.3;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5.0, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		Ride[] rides = {
				new Ride(5.0, 10),
				new Ride(0.3, 1),
				new Ride(1.0, 5)
				};
		double totalFare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(80.0, totalFare, 0.0);
	}
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = {
				new Ride(5.0, 10),
				new Ride(0.3, 1),
				new Ride(1.0, 5)
		};
		InvoiceSummary invoiceSummary = invoiceGenerator.getInvoiceSummary(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 80.0);
		Assert.assertEquals(expectedInvoiceSummary, invoiceSummary);
	}
}