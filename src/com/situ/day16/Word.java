package com.situ.day16;

public class Word extends Office{
	public Word() {
		super();
	}

	public Word(String data) {
		super(data);
	}

	@Override
	public void start() {
		System.out.println("Word 正在打开，打开的数据是 " + data);
	}
}
