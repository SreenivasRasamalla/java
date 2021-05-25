package com.conditionalstatements.java;
		// if inside if is known as Nested if

public class NestedIfConcept {
	
	public static void main(String[] args) {
		int i=40;
		if (i<50) {					//if this first condition is false, Controller will directly jump outside, it will not check for the next statement because it is if inside if concept, it will check for the next statement only if there is else condition.
		System.out.println("First Condition is true ");
			if (i>45) {
				System.out.println("Second Condition is true");
				
			} System.out.println("outside the second condition");
		} System.out.println("outside the first condition");
		
	} 

}
