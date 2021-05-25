/*package com.exceptionconcept;

import java.awt.geom.Ellipse2D;

//Note: throw keyword should be written inside method, throws keyword should be written beside method

public class ThrowAndThrowsConcept {
	int x=10;
	int y=0;
	
	void m1(int x,int y){
		if(y==0){
		throw new ArithmeticException("Dont divide by zero, please enter any number other than zero");		//the user who is calling m1, they need to handle my(this written) exception
		}else {
			System.out.println("hii");
			int z=x/y;				//(1)
			System.out.println("result is"+z);
			System.out.println("hello");	
		}
	}

	
	public static void main(String[] args) {
	ThrowAndThrowsConcept obj=new ThrowAndThrowsConcept();
	//obj.m1();
	try {
		obj.m1(10,0);
	} catch (Exception e) {
		// TODO: handle exception
		//e.getMessage();
		System.out.println(e.getMessage());
		
	}
	
	
}
}
*/