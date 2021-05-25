package com.methodoverloading;

		//To achieve method overloading, 3 types of changes were required
		//MethodOverloading can write only inside Class, whereas Method Overriding can be written only in parent and child class 

public class MethodOverloadingConcept {
	
	static void m1(){
		System.out.println("no parameters here");
	}
	static void m1(String aadhar){		
		System.out.println("approved with aadhar");
	}
	static void m1(String aadhar, String pan){			//this is called changing number of parameters with same method
		System.out.println("approved with aadhar and pan");
	}
	
	static void m1(String aadhar, int mobileNumber){			// this is called changing type of parameters
		System.out.println("approved with aadhar and mobileNumber");
	}
	
	static void m1(int mobileNumber, String Pan){		// this is called changing order of parameters
		System.out.println("approved with mobileNumber and pan");
	}
	
	
	public static void main(String[] args) {
		
		m1("310512980413","Bsepr2829D");
		m1("310512980413",5489748);
		m1(93487947, "Bsepr2829D");
		
		
	}
	
	
}
