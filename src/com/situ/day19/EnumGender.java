package com.situ.day19;

public enum EnumGender {
	//会调用下面的构造方法
	MALE("男"), FEMALE("女");
	
	private String value;
	
	//The constructor EnumGender(String) is undefined
	//Illegal modifier for the enum constructor; only private is permitted.
	private EnumGender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
