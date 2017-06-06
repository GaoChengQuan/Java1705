package com.situ.day19.homework;

public class PersonTest {
	public static void main(String[] args) {
		ISmoking smoking = new SmokingBikingStudent("zhangsan", 20, "Java1703");
		smoking.smoking();
		
		SmokingBikingStudent smokingBikingStudent = new SmokingBikingStudent("lisi", 18, "1703");
		smokingBikingStudent.show();
		smokingBikingStudent.study();
		smokingBikingStudent.bike();
		smokingBikingStudent.smoking();
	}
}
