package com.situ.day19;

public abstract class AbstractBird {
	protected int legNum;

	public AbstractBird() {
		super();
	}

	public AbstractBird(int legNum) {
		super();
		this.legNum = legNum;
	}
	
	public abstract void egg();

	public int getLegNum() {
		return legNum;
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
}
