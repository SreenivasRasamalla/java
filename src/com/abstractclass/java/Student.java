package com.abstractclass.java;

public abstract class Student {
	
	void m1(){				//this is a Implementation method with body
		System.out.println("Implementation method M1 from Student Class is called");
	}
	
	
	//void m2();				//this is a error, it is without body, so we need to add 'abstract' before the method 

	abstract void m3();		// this is a UnImplimented method, we need to add abstract here
	
	//here in m3 we cannot write any logics, we can write only in subclass of m3
	
	
	
	public static void main(String[] args) {
		
		//Student obj=new Student();  	//here it is an error that we cannot create an object in an abstract class, we need a sub class for creating an object
		
		
		
	}

}
