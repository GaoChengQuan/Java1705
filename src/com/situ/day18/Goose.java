package com.situ.day18;

public class Goose extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("Goose:egg()");
	}

	public void fly() {
		System.out.println("Goose:fly()");
	}

}
