package com.exceptionconcept;

public class ExceptionConcept {
	
	void m1(){
		try {
			int x=10;
			int y=0;
			System.out.println("hii");
			int z=x/y;
			System.out.println("result is"+z);
			System.out.println("hello");
			
		} catch (ArithmeticException e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}finally {
			//here we can close the resources
		}
	}
	
				
	public static void main(String[] args) {
		int x=10;
		int y=0;
		System.out.println("hii");
		int z=x/y;
		System.out.println("hello");		//this will not be executed because there is an error occured at row 9, so the execution flow will stooped at the error point 
				//	(1)
		ExceptionConcept obj=new ExceptionConcept();
		obj.m1();
	
	
	}
	
} 

