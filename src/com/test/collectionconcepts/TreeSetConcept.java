package com.test.collectionconcepts;

import java.util.TreeSet;

public class TreeSetConcept {
	
	public static void main(String[] args) {
		TreeSet<String> obj=new TreeSet<String>();
		
		//Elements are added using add method
		obj.add("B");
		obj.add("A");
		obj.add("E");		
		obj.add("D");	// and these are also case Sensitive
		obj.add("C");	
		obj.add("C");//Duplicate values are not allowed & follows ascending order by default	
		System.out.println(obj);	//by default elements get stored in ASCENDING ORDER
	}

}
