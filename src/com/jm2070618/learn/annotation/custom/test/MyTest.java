package com.jm2070618.learn.annotation.custom.test;

public class MyTest {

	@Test
	public void method1() {
		System.out.println("Method1 is running...");
	}

	@Test(enabled = true)
	public void method2() {
		System.out.println("Method2 is running...");
	}

	@Test(enabled = false)
	public void method3() {
		System.out.println("Method3 is running...");
	}

	public void method4() {
		System.out.println("Method4 is running...");
	}
}
