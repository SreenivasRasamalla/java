package com.typecasting;

public class ObjectSubTypeCasting extends ObjectTypeCasting{
	
	void m2(){
		
		double d=i;
		int x=(int) d1;
		System.out.println(d);
		System.out.println("child class is called");
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		
		ObjectTypeCasting parent=new ObjectTypeCasting();
		ObjectSubTypeCasting child=new ObjectSubTypeCasting();
		parent=child;
		parent.m1();
		child=(ObjectSubTypeCasting) parent;
		child.m2();
		
	}

}
