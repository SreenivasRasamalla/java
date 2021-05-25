package com.methodoverloading;

public class OverRideTest {
	
	void m1() {
	}
	public static void main(String[] args) {
		OverRidingB obj=new OverRidingB();
		obj.m1();
		OverRidingC objs=new OverRidingC();
		objs.m1();
	}
}
