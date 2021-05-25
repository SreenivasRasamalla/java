package com.loopsconcept;

public class WhileLoop {
	
	public static void main(String[] args) {
		int x=5;
		while (x>1) {			//here if we use <, we need to use x++, and if we use >, we need to use x--
			System.out.println("condition is true" +x);
			//System.out.println(x);
			x--;
			
		}
	}

}
