package com.cabBooking.CabBooking.Model;

public class DriverDetails {
     DrivingPartner driver;
     Location location;
	public DriverDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverDetails(DrivingPartner driver, Location location) {
		super();
		this.driver = driver;
		this.location = location;
	}
	public DrivingPartner getDriver() {
		return driver;
	}
	public void setDriver(DrivingPartner driver) {
		this.driver = driver;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
    
}
