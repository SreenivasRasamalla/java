package com.employ.java;

public class ThisKeywordConstructor {
	
										//this keyword using in Constructor level
	
	String str;
	int x;
	
	
	public ThisKeywordConstructor() {
		// TODO Auto-generated constructor stub
		this(66);
		System.out.println("Default Constructor is called");
		System.out.println(str);
	}
	
	public ThisKeywordConstructor(int x){
		
		this("nani", 200);
		//this();
		
		System.out.println("One para Constructor is called");
		
		
	}
	
	public ThisKeywordConstructor(String str, int x){
		//this();
		System.out.println("Two para Constructor is Called");
		System.out.println(str);
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		//ThisKeywordConstructor obj=new ThisKeywordConstructor();  
		//ThisKeywordConstructor objs=new ThisKeywordConstructor(100);
		ThisKeywordConstructor objss=new ThisKeywordConstructor( "java",100);
		
	
	}

}
