package com.employ.java;

import java.util.Scanner;

public class FinalKeyWord {
	
	final String name = "Sreeni";    // for Final keyword always variable should be initialized, but not declared.
	
	int x = 10;      // no final keyword here, lets check the difference
	
	
	
	void m1() {
		//name = "new java"; 				// we cant reassign here because name is having a final keyword.
	x=200;							// here we can reassign because int x doesnt have the final keyword.
	System.out.println(x);
	
	}
	
	void m2(int x, String name){							// this method is an example for learning Scanner method
		
		
	}
		
	
	public static void main(String[] args) {
		
		FinalKeyWord obj= new FinalKeyWord();
		String A= obj.name;      // here for name we cannot reassign another value as it is final
		System.out.println(A);
		
		int y = obj.x;
		y=1000;            // re-assigning the value here, it can accept because it doesnt have final keyword
		System.out.println(y);
		
		obj.m1();					// m1 is called here
		
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		String name=sc.next();
		
		obj.m2(x, name);
		 
	}
	
}
