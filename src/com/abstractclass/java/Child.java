package com.abstractclass.java;

public class Child extends Student {
	String name;
	int x;

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("abstract class is overrided here from parent Class");
		
	}
	public Child() {
		// TODO Auto-generated constructor stub
	}
	public Child(String name, int x) {
		this.name=name;
		this.x=x;
		System.out.println(name);
		System.out.println(x);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Student obj=new Child();				//object for abstract class by using sub class
		Student objs=new Child("Tom",10);		//Constructor object for abstract class by using sub class
		//obj.m1();
		//obj.m3();
		
		
		
		
	}
	
	
	
}
