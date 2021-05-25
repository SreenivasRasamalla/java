package com.superkeyword.java;

public class SuperSubClass extends SuperKeywordConcept {

	String name="Sree";
	
	int z;
	
	
	void m2(){
		
		int y=30;
							
		System.out.println("m2 called from child class");
		super.m1();			//by using super.m1, we can invoke the properties of parent class m1 to subclass m2
		System.out.println(name+""+str);
		System.out.println(y);
	}
	
	public SuperSubClass(int z) {
		// TODO Auto-generated method stub
		System.out.println(z);
		super.y=y;
	}
	
	public static void main(String[] args) {
		SuperSubClass obj=new SuperSubClass(26);
		//obj.m1();
		obj.m2();
		
	}

	
}
