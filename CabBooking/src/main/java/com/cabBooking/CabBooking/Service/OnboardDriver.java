package com.cabBooking.CabBooking.Service;


import com.cabBooking.CabBooking.Model.DriverDetails;
import com.cabBooking.CabBooking.Model.DrivingPartner;
import com.cabBooking.CabBooking.Model.Location;
import com.cabBooking.CabBooking.Model.Vehicle;
import com.cabBooking.CabBooking.Repository.DriversDB;

public class OnboardDriver {
	   private DrivingPartner driver;
	   private Vehicle vehicle;
	   private Location location;
	   private DriversDB driverDB; 
	   
       public OnboardDriver(DrivingPartner driver, Vehicle vehicle, Location location, DriversDB driverDB) {
		super();
		this.driver = driver;
		this.vehicle = vehicle;
		this.location = location;
		this.driverDB = driverDB;
	}

	   public void add_driver(DrivingPartner driver, Vehicle vehicle, Location location) {
    	   this.driverDB.getDriverDB().add(new DriverDetails(driver, location));
       }
}
