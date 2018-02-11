package com.atuldwivedi.jee.learn.annotation.pre.override;

public class Child extends Parent {
	@Override
	void saveMoney() {
		System.out.println("Child saves money.");
	}
}
