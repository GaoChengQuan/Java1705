package com.situ.day16;

public class OverloadDemo {
	
	void show(int a,char b,double c){}
	
	//Duplicate method show(int, char, double) in type OverloadDemo
	//void show(int x,char y,double z){}
	
	int show(int a,double c,char b){return 0;}
	
	boolean show(int c,char b){return false;}
	
	//double show(int x,char y,double z){return 0.0;}
}
