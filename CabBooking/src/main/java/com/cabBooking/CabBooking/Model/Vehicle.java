package com.cabBooking.CabBooking.Model;

public class Vehicle {
          String name;
          String make;
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Vehicle(String name, String make) {
			super();
			this.name = name;
			this.make = make;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
          
          
}
