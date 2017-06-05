package com.situ.day19;

import java.util.Arrays;

import org.junit.Test;

public class TTT {
	public static void main(String[] args) {
		//Cannot instantiate the type Animal
		//Animal animal = new Animal();
		
		Student student = new Student();
		student.showInfo();
		student.walk();
		student.study();
		
		//站在动物Animal的角度去看这个
		AbstractAnimal animal = new Student();
		animal.showInfo();
		
		//站在人Person的角度去看这个
		AbstractPerson person = new Student();
		person.showInfo();
		person.walk();
	}
	
	@Test
	public void test() {
		Pigeon pigeon = new Pigeon(2);
		AbstractBird bird = new Pigeon(2);
		//从能不能飞IFly这个角度去看Pigeon，只能调用IFly里面的方法。
		IFly fly = new Pigeon(2);
		fly.fly();
	}
}
