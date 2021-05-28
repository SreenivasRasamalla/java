package com.mytest.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class TrackBook {
	
	ArrayList<BookDetails> list=new ArrayList<BookDetails>();		//this is a ArrayList object  (here we want to store multiple objects in 'list' )
	
	ArrayList<BookDetails> getBookInfo(){			//this is a method it means we are storing the book information in ArrayList and we are trying to find book Title available in ArrayList or not.. 
	
		Scanner sc=new Scanner(System.in);
		
		try {										// inside try we need to write logics only
			
			for (int i = 0; i < 2; i++) {		//this means we are giving object initializing with for loop for iterating 3 times
				
				
				System.out.println("Enter author name");
				String authorName=sc.next();	
				
				System.out.println("Enter Rack number");
				String RackNumber=sc.next();
				
				System.out.println("Enter price");
				double price=sc.nextDouble();
				
				System.out.println("Enter published year");
				int yearOfPublishing=sc.nextInt();
				
				//BookDetails obj=new BookDetails("SreeSree", "A6", 500, 1985);
				BookDetails obj=new BookDetails(authorName, RackNumber, price, yearOfPublishing); 
				list.add(obj);
			
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
		
	}	
	
	
	
	void getBookInfo(Scanner sc){ 			//we took second method and calling first method into second method
		
		//getBookInfo();
		
		try {
			ArrayList<BookDetails> obj=getBookInfo();
			System.out.println("Enter author name & get book information");
			 String authorName=sc.next();
			
			for (BookDetails bookDetails : obj) {
				
			if (bookDetails.getAuthorName().equalsIgnoreCase(authorName)) {
				System.out.println("Author name="+bookDetails.getAuthorName()+"Rack Number="+bookDetails.getRackNumber()+"book price="+bookDetails.getPrice()+"year of publishing="+bookDetails.getYearOfPublishing());
				break;
			}
			else {
				
			}
				//System.out.println(bookDetails);
				
			}
			System.out.println("Not Available");
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
		
	
	public static void main(String[] args) {
		
		TrackBook obj=new TrackBook();	
		Scanner sc=new Scanner(System.in);
		obj.getBookInfo(sc);
		
	}


}
