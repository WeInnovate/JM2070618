package com.jm2070618.learn.annotation.predefined.override;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle vehicle = new HondaCity();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
	}

}
