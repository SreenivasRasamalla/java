package com.conditionalstatements.java;

public class IfElseInsideElse {
	
	public static void main(String[] args) {
		int i=30;
		int y=50;
		if (i<20) {
			System.out.println("first is true");
			
		} else {
			if (y>20) {								//here we wrote if else, inside the else
				System.out.println("second is true");
			} else {
				System.out.println("third is true");

			}
		}
			
		
	}

}
