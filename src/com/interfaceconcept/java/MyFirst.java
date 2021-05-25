package com.interfaceconcept.java;

public interface MyFirst {
	
	/*void m1(){			 this is an error because it as an implemented method or with body method, 
	
	}*/

	void m1();			//this is Unimplemented method or without body method,  also known as method decalration
	
	//System.out.printlm();		//we have ann error for this because, we cannot write any logics here, we can write in subclass only
	
	
	public static void main(String[] args) {		// we don't even need a main method here
		
		//MyFirst obj=new MyFirst();		//we cannot create an object in Interface parent class, we can create object only in sub-class
		
	}

	
	
	//NOTE: while creating a subclass we should create a normal class, we should not take any abstract class or Interface class.
}
	

	

		
				
		

	

