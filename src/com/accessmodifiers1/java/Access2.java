package com.accessmodifiers1.java;

public class Access2 {
	
	//public class Modifiers1ClassA extends ClassB{
		
	

	/*private void m4() {
		// m2();
	}*/

	public static void main(String[] args) {

		Access1 obj = new Access1();
		// obj.m2(); //here we cannot access m2 from Modifier1 class, because m2
		// is a private class, it can access only in same class of same package
		obj.add();
		obj.m3();		//here protected modifier is called from package1 to another package
				
	}

}
