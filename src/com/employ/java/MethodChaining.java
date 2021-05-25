package com.employ.java;

public class MethodChaining {
	
	String S;        //Variable Initialiazation
	int x=220;		//Variable Declaration
	
	// Now lets create some methods
	
	static void methodName1() {				//m1&m2 are static methods
		System.out.println("Sreeni");
		int m=methodName2();
		System.out.println(m);
		
	}
	
	static int /*void*/ methodName2() {					//methodName1 is called here
		//methodName1();	
		return 111;
	}
	
	void methodName3() {						//m3 & m4 are Instance methods
			
		String M=methodName4();
		System.out.println(M);
		
		MethodChaining.methodName2();					//#2 static to Instance is called **** required syntax is ClassName.methodName();
		int z=methodName2();
		System.out.println(z);
		
		//System.out.println(x);	
		
	}
	
	String methodName4(){
		
		
		//methodName3();						  // #3  Instance to Instance is called
		return "vasu";
		
	}
	
	public static void main(String[] args) {     //this is known as main method
		
		//methodName1();
		//methodName2();							//#1 static to static is called here
		
		MethodChaining obj= new MethodChaining();
		//obj.methodName3();						// #4 Instance to static is called by using object syntax ClassName objectname = new ClassName
		
		String S=obj.methodName4();					//return value will be in output
		System.out.println(S);
		
		
		 
		
	}

}
