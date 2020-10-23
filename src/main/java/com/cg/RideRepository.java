package com.cg;

public class RideRepository {
	int userId;
	Ride[] rides;

	public RideRepository(int userId, Ride[] rides) {
		this.userId = userId;
		this.rides = rides;
	}
}