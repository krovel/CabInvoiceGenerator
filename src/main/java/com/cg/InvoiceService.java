package com.cg;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
	private List<RideRepository> repository;

	public InvoiceService() {
		repository = new ArrayList<RideRepository>();
	}

	public InvoiceService(List<RideRepository> repository) {
		this.repository = repository;
	}

	public InvoiceSummary getInvoice(int userId) {
		InvoiceSummary invoiceSummary = null;
		for (RideRepository userRides : repository) {
			if (userRides.userId == userId) {
				invoiceSummary = new InvoiceGenerator().getInvoiceSummary(userRides.rides);
			}
		}
		return invoiceSummary;
	}
}