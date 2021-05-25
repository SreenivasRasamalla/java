package com.test.collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static <E> void main(String[] args) {
		
		//ArrayListConcept list=new ArrayListConcept();			//this is known as Class object
		ArrayList<String> list=new ArrayList<String>();			//this is known as ArrayList creation
					//with this we can store only String type, because the object returns with String type
		list.add("ABC");
		list.add("DEF");
		list.add("XYZ");
		list.add("123");
		list.add("ABC");		// it also accepts duplicate values
		System.out.println(list);	
	
		ArrayList list1=new ArrayList();		//with this object we can store values of all data types
		list1.add("ABC");
		list1.add(true);
		list1.add(true);			// it also accepts duplicate values	& and follows Insertion order
		list1.add(123);
		list1.add(345.989379898327f);
		list1.add(782.332);
		System.out.println(list1);
		
		System.out.println(list.contains("A "));		//this shows true if the list contains the given value else it shows false

		/*Iterator itr=list.iterator();		//it executes one by one in next line
		while(itr.hasNext()){
			System.out.println(itr.next());*/
		
			if (list.isEmpty()) {
			System.out.println("inside if condition");
		}else {
			System.out.println("inside else condition");
		}
		
		}
	}


