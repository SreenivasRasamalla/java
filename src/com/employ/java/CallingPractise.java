package com.employ.java;

public class CallingPractise {

	
	boolean b=true;
	float f=65;
	
	static void m1(){
		
		 
		System.out.println("first");         
		
		CallingPractise obj=new CallingPractise();
		 obj.m3();
	}
	
	static void m2(){
		//m1(); 
			System.out.println("123");
		
		}
	
	void m3() {
		CallingPractise.m2();                   // doubt
		boolean b= m4();
		System.out.println(b);
		
	}
	
	boolean m4() {
		//m3();
		CallingPractise.m1();
		
		return true;
		
	}
		

	public static void main(String[] args) {
		 
			
			  
			
			
	
	
	
	
	
		
	}
	
	
	}
