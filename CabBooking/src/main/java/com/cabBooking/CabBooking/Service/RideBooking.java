package com.cabBooking.CabBooking.Service;



import java.util.ArrayList;
import java.util.List;

import com.cabBooking.CabBooking.Model.DriverDetails;
import com.cabBooking.CabBooking.Model.DrivingPartner;
import com.cabBooking.CabBooking.Model.Location;
import com.cabBooking.CabBooking.Model.User;
import com.cabBooking.CabBooking.Repository.DriversDB;

public class RideBooking {
	
	public List<DrivingPartner> find_ride(User user, Location source, Location destination, DriversDB driverDB){
		List<DriverDetails> db = driverDB.getDriverDB();
		List<DrivingPartner> available_drivers = new ArrayList<DrivingPartner>(); 
		for(DriverDetails driver: db) {
			Location driverLocation = driver.getLocation();
			int driverX = driverLocation.getX();
			int driverY = driverLocation.getY();
			
			int sourceX = source.getX();
			int sourceY = source.getY();
			
			int distance = (sourceY - driverY) * (sourceY - driverY) + (sourceX - driverX) * (sourceX - driverX);
			
			//Considering driver if he/she is less than 7 units of distance;
			if(Math.sqrt(distance) <= 7)
				available_drivers.add(driver.getDriver());
		}
		
		return available_drivers;
	}
	
	
}
