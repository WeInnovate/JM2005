package com.atuldwivedi.jee.learn.annotation.cust;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProcessTestAnnotation {

	public static void main(String[] args) {

		try {
			Class<MyTest> myTest = (Class<MyTest>) Class.forName("com.atuldwivedi.jee.learn.annotation.cust.MyTest");
			Method[] methods = myTest.getDeclaredMethods();

			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].getName());
				if (methods[i].isAnnotationPresent(Test.class)) {
					System.out.println("Test annotation is present.");
					Test test = (Test) methods[i].getDeclaredAnnotation(Test.class);
					if (test.enabled()) {
						System.out.println("Annotation is enabled on the method.");
						methods[i].invoke(myTest.newInstance());
					} else {
						System.out.println("Annotation is not enabled on the method.");
					}
				} else {
					System.out.println("Test annotation is not present.");
				}

			}

		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
	}

}
