package com.accessmodifiers1.java;


// this is an example created for accessing protected modifier
public class SubClass extends Access1 {
	
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.add();
		obj.m1();
	  //obj.m2();			//here m2 cannot be called from Access1 because it is a private modifier
		obj.m3();
		
		
	}

}
