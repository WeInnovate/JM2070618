package com.jm2070618.learn.annotation.predefined.override;

public class HondaCity extends Vehicle {

	@Override
	public void move() {
		System.out.println("HondaCity is moving....");
	}
	
	/*
	@Override
	public void mvoe() {
		System.out.println("HondaCity is moving....");
	}*/
}
