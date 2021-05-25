package com.loopsconcept;

public class DoWhile {
	
	public static void main(String[] args) {
		int x=5;		//this should be only above the condition, if below the condition it will be an error
		do {		
			System.out.println("Hi, Iam from DoWhileLoop"+  x);	
			x-- ; 
		}	while (x>6); 
	}

}
 