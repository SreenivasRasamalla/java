package com.employ.java;

public class ThisKeywordConcept {
									//this keyword is used in 3 levels, variable level, method level & Constructor level
									//this keyword using in method level
	
	void m1(){
		System.out.println("M1 is called");
		this.m3();			//static method m3 to Instance can be called to by using this keyword
		this.m4();
		
	}
	
	void m2(){
		//m1();					// this is calling directly
		this.m1();				// this is calling m1 by using this keyword
	}
	
	static void m3(){
		System.out.println("M3 is called");
	}
	
	static void m4(){
		//this.m3();   // here static to static or Instance to static cannot be called by using this keyword
	}
	
	/*Note: we cannot use this keyword in a static context*/
	
	public static void main(String[] args) {
		
		ThisKeywordConcept obj=new ThisKeywordConcept();
		obj.m2();
		
	}

}
