package com.inheritance.java;

public interface HybridD extends HybridB,HybridC {				//we can get this by only using interface
	
	void m4();
	
	
	public static void main(String[] args) {		// here we need to create object for D subclass and compulsory we need to override to access A,B,C in D.
		HybridD obj=new HybridD() {
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("m3 from C is called");
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m4() {
				// TODO Auto-generated method stub
				
			}
		};
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
	}
	

}
