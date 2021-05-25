package com.employ.java;

public class MethodCalling {
	
	float f;
	
	static String S="20";
	
	static int m1(){
		 m2();
		//System.out.println(S);
		return 29;
		
	}
	static void m2(){
		System.out.println("helloooo");
		
	}
	
	void m3(){
		
		String ABC= m4();      
		System.out.println(ABC);
		MethodCalling.m1();    
	}
	
	String m4(){
		
		System.out.println("myworld is");
		return "My Love";
		
		
	}
	
	
	public static void main(String[] args) {
		
		MethodCalling obj = new MethodCalling();
		obj.m4();
		
		
		
	}

}
