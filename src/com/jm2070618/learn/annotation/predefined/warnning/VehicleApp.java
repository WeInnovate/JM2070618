package com.jm2070618.learn.annotation.predefined.warnning;

public class VehicleApp {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
	}
}
