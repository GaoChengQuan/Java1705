package com.situ.day15;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "BMW";
		car.price = 3000000;
		car.color = "白色";
		car.show();
		car.startup();
	}
}
