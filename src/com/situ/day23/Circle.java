package com.situ.day23;

public class Circle extends Graphic{
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
}
