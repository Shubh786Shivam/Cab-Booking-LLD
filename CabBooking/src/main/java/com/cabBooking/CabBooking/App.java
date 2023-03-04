package com.cabBooking.CabBooking;

import java.util.ArrayList;
import java.util.List;

import com.cabBooking.CabBooking.Model.DriverDetails;
import com.cabBooking.CabBooking.Model.DrivingPartner;
import com.cabBooking.CabBooking.Model.Location;
import com.cabBooking.CabBooking.Model.User;
import com.cabBooking.CabBooking.Model.Vehicle;
import com.cabBooking.CabBooking.Repository.DriversDB;
import com.cabBooking.CabBooking.Service.OnboardDriver;
import com.cabBooking.CabBooking.Service.RideBooking;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Onboarding Users
    	
    	User user0 = new User("Abhishek", "Male", 23);
    	User user1 = new User("Rahul", "Male", 29);
    	User user2 = new User("Nandini", "Female", 22);

    	//Driving Partners
    	DrivingPartner d0 = new DrivingPartner("Driver0", "Male", 22);
    	DrivingPartner d1 = new DrivingPartner("Driver1", "Male", 29);
    	DrivingPartner d2 = new DrivingPartner("Driver2", "Male", 24);
    	
    	//Vehicles
    	
    	Vehicle v0 = new Vehicle("Swift", "KA-01-12345");
    	Vehicle v1 = new Vehicle("Swift", "KA-01-12345");
    	Vehicle v2 = new Vehicle("Swift", "KA-01-12345");
    	
    	
    	//Driver Locations
    	
    	Location driverLocation0 = new Location(10, 1);
    	Location driverLocation1 = new Location(11, 10);
    	Location driverLocation2 = new Location(5, 3);
    	
    	
    	//Initialising Driver Details Repository
    	
    	DriverDetails detail0 = new DriverDetails(d0, driverLocation0);
    	DriverDetails detail1 = new DriverDetails(d1, driverLocation1);
    	DriverDetails detail2 = new DriverDetails(d2, driverLocation2);
    	
    	
    	List<DriverDetails> listDrivers = new ArrayList<DriverDetails>();
    	DriversDB db = new DriversDB(listDrivers);
    	//Onboarding Drivers
    	
    	OnboardDriver onboard0 = new OnboardDriver(d0, v0, driverLocation0, db);
    	OnboardDriver onboard1 = new OnboardDriver(d1, v1, driverLocation1, db);
    	OnboardDriver onboard2 = new OnboardDriver(d2, v2, driverLocation2, db);
    	onboard0.add_driver(d0, v0, driverLocation0);
    	onboard1.add_driver(d1, v1, driverLocation1);
    	onboard2.add_driver(d2, v2, driverLocation2);
    	
    	
    	
    	//Finding Rides

		RideBooking rideBook = new RideBooking();
		List<DrivingPartner> first = rideBook.find_ride(user0, new Location(0,0), new Location(20,1), db);
		
		//Checking for available drivers.
		if(first.size() > 0) {
			for(DrivingPartner d: first)
			   System.out.println("For " + user0.getName() + "," + d.getName() + " is available.");
		}
		List<DrivingPartner> second = rideBook.find_ride(user1, new Location(10,0), new Location(15,3), db);
		
		//Checking for available drivers.
		if(second.size() > 0) {
			for(DrivingPartner d: second)
			   System.out.println("For " + user1.getName() + "," + d.getName() + " is available.");
		}
    	List<DrivingPartner> third = rideBook.find_ride(user2, new Location(15,6), new Location(20,4), db);
    	
    	//Checking for available drivers.
		if(third.size() > 0) {
			for(DrivingPartner d: third)
			   System.out.println("For " + user2.getName() + "," + d.getName() + " is available.");
		}	
    }
}
