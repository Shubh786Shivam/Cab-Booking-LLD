package com.cabBooking.CabBooking.Model;

public class Route {
	Location location;

	public Route(Location location) {
		super();
		this.location = location;
	}

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
