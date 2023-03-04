package com.cabBooking.CabBooking.Model;

public class Location {
	//Representing a location in xy plane using x-y coordinates.
    int x;
    int y;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
    
    
}
