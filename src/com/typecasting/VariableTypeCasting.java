package com.typecasting;

				//for explicit the order is byte,short,char,int,long,float,double	
				// for implicit the order is double,float,long,int,char,short,byte						

public class VariableTypeCasting {
	
	int x =90;		
	
	double i=x;		//this is called Implicit or Widening typecasting, this converts automatically by JVM from smaller data types to larger data types
	
	
	void m1(){
		
		double d=10.999999635;			
		
		int f=(int)d;		//this is called Explicit or Narrowing type casting, this converts manually by the Programmer from larger data types to smaller data types
							//we need to write the data type inside parenthesis() to convert, this should be done manually
		
		System.out.println(f);
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		VariableTypeCasting obj=new VariableTypeCasting();
		obj.m1();
	}
}
