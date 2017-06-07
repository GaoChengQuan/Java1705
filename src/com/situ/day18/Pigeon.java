package com.situ.day18;

public class Pigeon extends AbstractBird implements IFly{
	public Pigeon() {
		super();
	}

	public Pigeon(int legNum) {
		super(legNum);
	}

	@Override
	public void egg() {
		System.out.println("Pigeon:egg()");
	}

	public void fly() {
		System.out.println("Pigeon:fly()");
	}
}
