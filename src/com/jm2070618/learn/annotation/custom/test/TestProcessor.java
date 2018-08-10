package com.jm2070618.learn.annotation.custom.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestProcessor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Class<MyTest> myTest = (Class<MyTest>) Class.forName("com.jm2070618.learn.annotation.custom.test.MyTest");
			Method[] methods = myTest.getMethods();
			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				System.out.println("Inspecting: " + method.getName());
				if (method.isAnnotationPresent(Test.class)) {
					System.out.println("Annotation is present.");
					Test test = (Test) method.getAnnotation(Test.class);
					if (test.enabled()) {
						System.out.println("Annotation is enabled.");
						method.invoke(myTest.newInstance());
					} else {
						System.out.println("Annotation is not enabled.");
					}
				} else {
					System.out.println("Annotation is not present.");
				}
				System.out.println("------------------");
			}
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| InstantiationException e) {
			e.printStackTrace();
		}
	}

}
