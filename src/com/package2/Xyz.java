package com.package2;

import com.package1.Abc;


public class Xyz {
	
	void m2(){						//here I need to access m1 method of PACKAGE 1
	//m1();							// this will be an error, we cannot call directly, we need to create an object for calling m1 here
	Abc.m4();						//here Package 1 static method name is called to package 2 by using ClassName.method name(same calling as static to Instance syntax)
	}
	
	void m3(){
		Abc.m4();
	}
	
	public static void main(String[] args) {
		Abc obj=new Abc();		//here we need to create an object of PACKAGE 1 class name
								//we need to add import method while creating a object here(refer row 3)
		obj.m1();				//here we find an error coz we need to add a 'PUBLIC' modifier in PACKAGE 1
		obj.m4();
	}

}
