package com.exceptionconcept;


import java.util.Scanner;

public class ExceptionHandlingConcept {

	void m1(){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("x value");
		int x=sc.nextInt();
		System.out.println("y value");
		int y=sc.nextInt();			//(3) trying with Scanner
		if (x==0 || y==0) {
			try {
				throw new ArithmeticException("Don't divide by zero, please use any value other than Zero");
				//throw new InputMismatchException("please enter only values as it is a int type");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		} else {
			
			int z=x/y;
			System.out.println(z);
			}
				
	}
	
	public static void main(String[] args) {
		ExceptionHandlingConcept obj=new ExceptionHandlingConcept();	//(1) through object
		obj.m1();
		
		/*try {			//(2) use try catch statement to give the user friendly message to the user
			//obj.m1(10,0);		//call the required method in 'try' and	use the getMessage syntax to display user friendly message
		
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println(e.getMessage());	
			}*/
	} 
}
	
