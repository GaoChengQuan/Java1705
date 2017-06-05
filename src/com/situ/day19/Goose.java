package com.situ.day19;

public class Goose extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("Goose:egg()");
	}

	public void fly() {
		System.out.println("Goose:fly()");
	}

}
