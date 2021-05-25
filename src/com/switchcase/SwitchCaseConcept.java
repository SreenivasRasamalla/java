package com.switchcase;

import java.util.Scanner;

public class SwitchCaseConcept {
	int stdNumber=123;
	String stdName="Vasu";
	
	void stdDetails(){
		
		System.out.println("Student Number is "+stdNumber);
		System.out.println("Student Name is	"+stdName);
	}
	
	public static void main(String[] args) {
		
		SwitchCaseConcept obj=new SwitchCaseConcept();
		Scanner sc=new Scanner(System.in);		//(3) switch case using Scanner 
		System.out.println("please enter SwitchCase number");
		int y=sc.nextInt();
		
		int z=1;			// this is given for Switch case
		int x=2;			//this is given for nested switch case 
		switch (y)	 {				//(1)this is switch statement
		case 1:
		obj.stdDetails();		//(2) executing the method with switch case 
			System.out.println("apple");
			break;
		case 2:
			System.out.println("ball");
			break;
		case 3:
			System.out.println("cat");
			
			switch (x) {					//(4) this is called Nested SwitchCase, which means Switchcase inside Switch case
			case (0):
				System.out.println("nested switch case 0");
				break;
			case (1):
				System.out.println("nested switch case 1");
				break;
			case (2):
				System.out.println("nested switch case 2");
				break;
			default:
				break;
			}
			
			break;
			
		case 4:
			System.out.println("doll");
			break;
		default:				//this default keyword specifies some code to run if there is no Case matching.
			System.out.println("looking forward");
			break;
		}
	}

}
