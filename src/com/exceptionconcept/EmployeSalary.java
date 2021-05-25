package com.exceptionconcept;

import java.util.Scanner;

public class EmployeSalary {
	static int salary= -100;
	
	static void empSal(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		int salary=sc.nextInt();
		
		if (salary<0) {
			try {
				throw new EmployeNegativeSalaryExceptionConcept("please don't enter negative salary");
				
			} catch (EmployeNegativeSalaryExceptionConcept e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();		//this syntax will show the exception type and error row number
				e.getMessage();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				// TODO: handle exception	//like this we can add multiple catch blocks for the different statements
			}
		} else {
			System.out.println("employe salary "+ salary);			
		}
	}
	public static void main(String[] args) {
		empSal();
		
	}

}
