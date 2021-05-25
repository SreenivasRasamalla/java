package com.inheritance.java;

public class SingleSub extends SingleLevel {

	void m3(){
		
		System.out.println("m3 from subclass is called");
	}
	
	public static void main(String[] args) {
		/*InheritanceConcept obj=new SubInheritance();		//with this object we can Inherit the parent class properties to child class
		obj.m1();
		obj.m2();*/
		SingleSub objs=new SingleSub();		//with this child class object, we can Inherit parent class and child class properties
		objs.m2();
	}
	
}
