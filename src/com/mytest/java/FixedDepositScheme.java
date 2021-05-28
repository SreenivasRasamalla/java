package com.mytest.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FixedDepositScheme {

	Scanner sc=new Scanner(System.in);
	
	
	void DepositLimit(){
		try {
		System.out.println("Enter age ");
		int age=sc.nextInt();
		
			switch (1) {
			
			case (1):
				if (age>=25 && age<60 ) {
					int amount=(int) (500000/100*7.5);
					System.out.println("Scheme 1==="+amount);
				}
			case (2):
				 if (age>60 && age<100) {
					int amount=(int) (50000/100*9);
					System.out.println("Scheme 2==="+amount);	
				}
			case (3):
				 if (age>100) {
					
					System.out.println("No Schemes are Available for your age..");
				}
			
			default:
				if (age<25) {
					System.out.println("Oops!! you are not eligible..!!");
					break;
				}
			
				}
					
			}
			catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
			
		}
	
	public static void main(String[] args) {
		FixedDepositScheme obj=new FixedDepositScheme();
		obj.DepositLimit();
	}
}
