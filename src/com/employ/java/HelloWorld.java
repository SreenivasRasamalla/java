package com.employ.java;

public class HelloWorld {
	
	String S;
	int x;
	char a;                  // all these are variable declaration
	boolean b;
	double d;
	float f;  
	
	
	String n="Sree";
	int x1=10;
	char a1='v';            // all these are variable initialization
	boolean b1=true;
	double d1=20;
	float f1=48;
	
	static String S1;
	static int y;
	
	static String S2="xyz";
	static int y1=200;

	void method() {
	
		System.out.println(S);
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		                   				
		System.out.println(n);
		System.out.println(x1);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(d1);
		System.out.println(f1);
		
	}
		
	public static void main(String[] args) {
	
		System.out.println("HelloWorld");   //my HelloWorld program will be executed now

		System.out.println(S1);
		System.out.println(y);
		System.out.println(S2);
		System.out.println(y1);
	
		
		HelloWorld obj = new HelloWorld();
		obj.method();
	
		
		
		
	}
		
	}
	


