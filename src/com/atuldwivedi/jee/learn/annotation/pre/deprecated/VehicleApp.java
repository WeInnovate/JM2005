package com.atuldwivedi.jee.learn.annotation.pre.deprecated;

public class VehicleApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Vehicle vehicle = new TVSBike();
		
		
		vehicle.startUsingKick();
	}

}
