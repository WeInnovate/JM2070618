package com.jm2070618.learn.annotation.custom.classinfo;

@ClassInfo(author = "Atul", createdOn = "09/08/2018", version = 1)
public class VehicleWithAnnotation {

	public void start() {
		System.out.println("Vehicle started");
	}

	public void move() {
		System.out.println("Vehicle is moving....");
	}

	public void stop() {
		System.out.println("Vehicle has been stopped.");
	}
}
