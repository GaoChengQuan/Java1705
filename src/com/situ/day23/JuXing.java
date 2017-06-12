package com.situ.day23;

public class JuXing extends Graphic{
	private double a;

	public JuXing() {
		super();
	}

	public JuXing(double a) {
		super();
		this.a = a;
	}

	@Override
	public double getArea() {
		return a * a;
	}
}
