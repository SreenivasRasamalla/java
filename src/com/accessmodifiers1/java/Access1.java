package com.accessmodifiers1.java;

	

public class Access1 {

	int t = 129;
	
	void add(){						//this is a default modifier
		System.out.println("Default modifier is called===="+t);
		
	}

	public void m1() {				//this is a public modifier

		System.out.println("public modifier m1 from package 1 is called in====" + t);

	}

	private void m2() {				//this is a private modifier

		System.out.println("private modifier m2 from package 1 is called in====" + t);

	}

	protected void m3() {				//this is a protected modifier
		System.out.println("protected modifier m3 from package1 is called in==="+t);
		
	}
	public static void main(String[] args) {
		Access1 obj = new Access1(); // here m2 can be called in the same
		obj.m2();							// class, it cannot be called to
											// another package because it is an
											// private modifier
		obj.add();

	}
}
