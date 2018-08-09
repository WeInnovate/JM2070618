package com.jm2070618.learn.annotation.predefined.deprecated;

public class Vehicle {

	public void start() {
		System.out.println("Vehicle started");
	}

	@Deprecated
	public void move() {
		System.out.println("Vehicle is moving....");
	}

	public void stop() {
		System.out.println("Vehicle has been stopped.");
	}
}
