package com.conditionalstatements.java;

public class IfConcept {
	
	//static int x=30;		//this is through variable initializing
	
	void age(int x){			//here is x value is initialized through the object or throough object Initializing

		if (x>20) {			//change only here to < or >
			System.out.println("Condition is true");
		} 
		else if (x<17) {
			System.out.println("Condition is false ");
		}
		else {
			System.out.println("Condition is ???? ");
		}
		
	}
	
	public static void main(String[] args) {
		
		/*if (x<38) {					//change only here to < or >
			System.out.println("Dispalying as Condition is true");
	
		} else {
			System.out.println("Diplaying as condition is false");
			
		}*/
		
		
		IfConcept obj=new IfConcept();
		obj.age(18);
				
			
	}
	}


