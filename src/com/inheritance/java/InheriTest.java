package com.inheritance.java;

public class InheriTest {

	public static void main(String[] args) {		//we can also create the object in MultiC class
		/*MultiC  obj=new MultiC();
		obj.m1();
		obj.m2();
		obj.m3();	*/	// these 3 are called by Multilevel Inheritance
		
		HierarchiB obj2=new HierarchiB();		//we need to create object for subclass B here, so we can access parent class properties also here
		obj2.m1();
		obj2.m2();
		
		HierarchiC obj3=new HierarchiC();		//we need to create object for subclass C here, so we can access parent class properties also here.
		obj3.m1();
		obj3.m3();
		
	}
}
