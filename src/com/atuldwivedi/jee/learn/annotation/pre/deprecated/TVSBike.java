package com.atuldwivedi.jee.learn.annotation.pre.deprecated;

public class TVSBike implements Vehicle {

	@Override
	public void startUsingKick() {
		System.out.println("Tvs Bike is started using kick.");
	}

	@Override
	public void move() {
		System.out.println("Tvs bike is moving.");
	}

	@Override
	public void stop() {
		System.out.println("Tvs bike os stopped.");
	}

	@Override
	public void startUsingSelf() {
		System.out.println("Tvs bike started using self.");
	}

}
