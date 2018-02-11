package com.atuldwivedi.jee.learn.annotation.cust;

public class MyTest {
	
	@Test(enabled=true)
	public void method1() {
		System.out.println("Method 1 is running...");
	}

	@Test
	public void method2() {
		System.out.println("Method 2 is running...");
	}

	@Test(enabled=false)
	public void method3() {
		System.out.println("Method 3 is running...");
	}

	public void method4() {
		System.out.println("Method 4 is running...");
	}
}
