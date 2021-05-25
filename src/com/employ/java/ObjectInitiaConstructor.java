package com.employ.java;

public class ObjectInitiaConstructor {
	
	String S;					
	float f;					// Global Variables
	
	public ObjectInitiaConstructor() {			//note: for constructors use only public, void is not needed
		// TODO Auto-generated constructor stub
		//this("Sree", 10);
		
		System.out.println("default Constructor is called");
		System.out.println(S);
		System.out.println(f);
	}
	
	ObjectInitiaConstructor(String S, float f) {
		
		System.out.println("Two param Constructor is called");
		
		
		System.out.println(S);
		System.out.println(f);
		
		this.S = S;   		  //this.S is a global variable & right side S is a local variable
		this.f = f;			//this.S is a global variable & right side S is a local variable
		
		System.out.println(this.S);
		System.out.println(this.f);
		
	}
		
		void m1(){
			
			/*System.out.println("m1 method called");
			ObjectInitiaConstructor ob = new ObjectInitiaConstructor();   //C --- M is called here
			*/
		}
		
	
	public static void main(String[] args) {
		
		ObjectInitiaConstructor obj = new ObjectInitiaConstructor();
		ObjectInitiaConstructor objs = new ObjectInitiaConstructor("Sree",2021);
		//obj.m1();
		
	}

}
