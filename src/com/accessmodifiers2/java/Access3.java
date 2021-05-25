package com.accessmodifiers2.java;

import com.accessmodifiers1.java.Access1;

public class Access3 extends Access1 {
	
	
		
	
	public static void main(String[] args) {
		Access1 obj=new Access1();
		//obj.m1();			//here we called m1 from package1 to package2 by using public modifier
		//obj.m2(); 		// here we cannot access the m2 from package1 to package2,
						// because m2 method is a 'private modifier' private
						// modifiers can access only in the same class.
		//obj.add();		// here we cannot access add method because it is an default modifier of anothe package
		//obj.m3();			// here protected modifier m3 cannot be called from one package to another package, it can be accessed only same in package
		
		Access3 objs=new Access3();			//once after using extending we get the Access1 class properties into Access3 class of an another package
		objs.m3();
		
	}

}
