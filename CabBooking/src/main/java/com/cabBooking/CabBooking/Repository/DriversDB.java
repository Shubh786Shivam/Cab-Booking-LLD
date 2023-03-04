package com.cabBooking.CabBooking.Repository;

import java.util.ArrayList;
import java.util.List;

import com.cabBooking.CabBooking.Model.DriverDetails;
import com.cabBooking.CabBooking.Model.DrivingPartner;
import com.cabBooking.CabBooking.Model.Location;

public class DriversDB {
	private List<DriverDetails> driverDB;

	public DriversDB(List<DriverDetails> driverDB) {
		super();
		this.driverDB = driverDB;
	}

	public DriversDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<DriverDetails> getDriverDB() {
		return driverDB;
	}

	public void setDriverDB(List<DriverDetails> driverDB) {
		this.driverDB = driverDB;
	}
	
}
