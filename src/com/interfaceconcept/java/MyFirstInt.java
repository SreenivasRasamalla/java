package com.interfaceconcept.java;

		// this is a subclass for MyFirst Interface Class, we need to use the keyword Implements to define a subclass for Interface

public class MyFirstInt implements MyFirst {			//here we need to add an unimplemented method to override the method from Main class to Sub-class

			
		public void m1() {		
		// TODO Auto-generated method stub			//this is an unimplimented method from Class MyFirst, turned into Implimented method here by overriding
			System.out.println("Unimplemented m1 method from Class MyFirst ");		//here we can write any logics
	}
			
		void m3(){
			System.out.println("Implimented method m2 from Subclass");
			
			
		}
		
		//void m2();		// It is an error, because In subclass we cannot write an Unimplemented method, we need to write only with body method or Implimented method
		
		public static void main(String[] args) {
		
			MyFirst obj=new MyFirstInt();		// Object for Interface by using Subclass
			obj.m1();
			//obj.m3();			//we should again override m3 here by writing m3 method in Main Class 'MyFirst'
			
	}

	
			
		}

