package com.inheritance.java;

public interface MultipleLevelC extends MultipleLevelA , MultipleLevelB {

	void m3();
	
	int m=20;
	
	
	
	public static void main(String[] args) {
		
		MultipleLevelC obj=new MultipleLevelC() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1 called from A");
			}
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2 called from B");
			}
			
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("m3 called from C");
			}
		};
		obj.m1();
		obj.m2();
		obj.m3();
	}
	
}
	
	
		
	

		
			
			
		
		
	
	
	

