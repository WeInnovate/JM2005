package com.atuldwivedi.jee.learn.annotation.pre.deprecated;

public interface Vehicle {

	@Deprecated
	public void startUsingKick();
	
	public void startUsingSelf();

	public void move();

	public void stop();
}
