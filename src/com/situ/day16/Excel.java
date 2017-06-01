package com.situ.day16;

public class Excel extends Office{

	public Excel() {
		super();
	}

	public Excel(String data) {
		super(data);
	}

	@Override
	public void start() {
		//super.start();
		System.out.println("Excel 正在打开，打开的数据是 " + data);
	}
	
}
